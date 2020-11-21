package Demo.Day18.ChatRoom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Csocket {
    public static void main(String[] args) {


        try (Socket socket = new Socket("10.10.10.108", 10086);
             BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter pw = new PrintWriter(socket.getOutputStream(), true)) {
            Scanner scan = new Scanner(System.in);
            while (true) {
                System.out.println("输入消息");
                String request=(scan.next());
                br.read();
            }

        } catch (IOException e) {

        }
    }
}

