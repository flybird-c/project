package Day11test.homework;

import java.util.Arrays;
import java.util.Scanner;

public class question4 {//4.模拟一个trim方法，去除字符串两端的空格

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        String[] Str=str.split("");
//        str =Str.toString();
        char c=32;
        if (str.charAt(0)==c){
            System.out.println("是空格");
//            str.trim()
        }
        System.out.println(c);
        System.out.println(Arrays.toString(Str));
    }
}
