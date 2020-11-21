package Day11test.homework;

import java.util.Scanner;

public class question2 {//2.从控制台录入一串字符串然后反序输出

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        StringBuffer stringBuffer=new StringBuffer(str);

        System.out.println(stringBuffer.reverse());
    }
}
