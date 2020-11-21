package Day4;

import java.text.MessageFormat;

public class MultiplicationTable {
    public static void main(String[] args){
        int a=0,b,p;
        while (++a<=9){
            b=a;
            p=1;
            while (++b<=9){
                while (p<a){
                    System.out.print("\t\t");
                    p++;
                }
                System.out.print(MessageFormat.format("{0}*{1}={2}\t",a,b,a*b));
            }
            System.out.println("\n");
        }
    }
}
