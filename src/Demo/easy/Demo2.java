package Demo.easy;

import jdk.nashorn.internal.ir.WhileNode;
import org.omg.Messaging.SyncScopeHelper;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Demo2 {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("请输入数字：");
        try {
            int sc=sca.nextInt();
            int i=0;
            while (i<sc){
                System.out.println(i++);
            }
        }catch (InputMismatchException x){
            System.out.println("输入数据不是数字");
            sca.next();
        }
    }
}
