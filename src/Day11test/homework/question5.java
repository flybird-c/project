package Day11test.homework;

import java.util.Arrays;

public class question5 {//5.有一段字符串 str = "i love shang hai" 反转为 "hai shang love i"

    public static void main(String[] args) {
       String str = "i love shang hai";
       String[] Str=  str.split(" ");
       System.out.println(Arrays.toString(Str));
        for (int i = Str.length - 1; i >= 0; i--) {
            System.out.print(Str[i]+"\t");
        }
        }
    }
