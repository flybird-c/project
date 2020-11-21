package Day11test.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class question3 {//3.从控制台录入两个字符串，并重载3个函数分别实现这两个字符串的
    // 拼接、整数相加和浮点数相加。要进行异常处理，对输入的不符合要求的字符串提示给用户，
    // 不能使程序崩溃
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        question3 sum=new question3();
        String str1=scanner.next();
        String str2=scanner.next();
        try {
            System.out.println(sum.sum(str1,str2));
        } catch (InputMismatchException x){
            System.out.println("输入不合法");
        }
        }int sum(int x,int y){
            return x+y;
        }float sum(float x,float y){
        return x+y;

    } String sum(String x,String y){
        return x+y;
    }
}
