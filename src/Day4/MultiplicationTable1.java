package Day4;

import java.text.MessageFormat;

public class MultiplicationTable1 {
    public static void main(String[] args){
        int a=1,b,k=9;
        while (a<=9){
            b=1;
            while (b<=k){
                System.out.print(MessageFormat.format("{0}*{1}={2}\t",b,b+a-1,b*(b+a-1)));
                b++;
            }
            System.out.println("\n");
            k--;
            a++;
        }
    }
}
