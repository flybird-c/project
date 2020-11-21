package Demo.Day18.ChatRoom;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Ssocket {
    public static void main(String[] args) {
        //初始化端口并绑定
        try (ServerSocket serverSocket=new ServerSocket(10086)){
            System.out.println("服务器启动成功");
            //等待连接
            Socket socket=serverSocket.accept();
            //
            System.out.println("地址"+socket);
            //构建地址的输入流,得到地址的输出流
            InputStream is=socket.getInputStream();
            OutputStream os=socket.getOutputStream();





            //对字节输入流做包装
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            PrintWriter pw = new PrintWriter(os,true);
            //-- 利用流向Socket做读写操作!
            //-- 服务端和客户端的读和写要相反!
            Scanner scan = new Scanner(System.in);
            while(true){
                String request = br.readLine();
                System.out.println("request:" + request);
                if (request.equalsIgnoreCase("bye")){
                    break;
                }

                System.out.println("输入返回给客户的消息");
                String msg = scan.next();
                pw.println(msg);
            }




        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
