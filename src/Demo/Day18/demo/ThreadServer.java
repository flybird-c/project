package Demo.Day18.demo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ThreadServer {
    class workspace extends Thread {
        public String getRequest() {
            return pon;
        }

        public void setRequest(String request) {
            this.pon = request;
        }

        private String pon;

        public workspace(Socket socket) {
            this.socket = socket;
        }

        private Socket socket;

        @Override
        public void run() {

            //构建地址的输入流,得到地址的输出流
            //对字节输入流做包装

            try (
                    BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);) {
                while (true) {
                    String request = br.readLine();
                    if (getRequest()!=null){
                        System.out.println("request:" + request);
                        System.out.println("pon:" + pon);
                    }

                    if ("bye".equalsIgnoreCase(getRequest())) {
                        break;
                    }
                }


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        String msg;
        //初始化端口并绑定
        try (ServerSocket serverSocket = new ServerSocket(10086)) {
            ThreadServer threadServer = new ThreadServer();
            System.out.println("服务器启动成功");
            //等待连接
            Socket socket = serverSocket.accept();
            //
            System.out.println("地址" + socket);
            workspace work1 = threadServer.new workspace(socket);
            work1.start();

            //-- 利用流向Socket做读写操作!
            //-- 服务端和客户端的读和写要相反!
            Scanner scan = new Scanner(System.in);
            while (true) {
                System.out.println("输入返回给客户的消息");
                work1.setRequest(scan.next());

            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
