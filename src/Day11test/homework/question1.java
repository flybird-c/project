package Day11test.homework;

import java.util.Arrays;
import java.util.Scanner;

public class question1 {//1.从控制台录入一串字符串，先将该串原样输出，然后判断该串的第一个字母是否为大写
    //若是大写则统计该串中大写字母的个数，
    //并将所有大写字母输出；否则输出信息串”第一个字母不是大写字母!

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        String[] Str=str.split("");
        System.out.println("你输入的字符串是："+str);

        for (int i=0;i<Str.length;i++){
            if (Str[0].toUpperCase().equals(Str[0])){

            }else {
                System.out.println("第一个字母不是大写字母!");
                break;
            }
            if (Str[i].toUpperCase().equals(Str[i])){
                System.out.print(Str[i]+"\t");
            }else {
            }
        }
//        System.out.println(Arrays.toString(Str));
//        if (str.indexOf(str,1)==str.indexOf(str,1))
    }
}
