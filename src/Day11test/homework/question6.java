package Day11test.homework;

import java.util.Arrays;
import java.util.Scanner;

public class question6 {//6.从键盘录入一串字符串，对其内容按照自然序排序 （如果同时有数字和字母，先排序数字，再排序字母）

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        char[] charArray= str.toCharArray();
        for(int index=0;index<charArray.length-1;index++){
            for (int i = 0; i < charArray.length-1; i++) {
                if(charArray[i]>charArray[i+1]){
                    char temp=charArray[i+1];
                    charArray[i+1]=charArray[i];
                    charArray[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(charArray));
    }
}
