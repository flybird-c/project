package Day3;

import java.util.InputMismatchException;
import java.util.Scanner;
public class DemoWhile06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sc=0;
        while (true){
            System.out.println("请输入数字");
            try {
                sc=scanner.nextInt();
                }catch (InputMismatchException x){
                System.out.println("输入的不是数字");
                scanner.next();
            }
            if (sc<0){
                System.out.println(sc+"是负数");
            }else if (sc>0){
                System.out.println(sc+"是正数");
            }else {
                break;
            }
        }
    }
}
