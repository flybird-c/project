package Day06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class   InputUtils {
    public static int nextInt(int start,int end) {
        Scanner scanner=new Scanner(System.in);
        int sc;
        while (true){
            try {
                System.out.println("请输入数字");
                sc=scanner.nextInt();
                if (sc<start||sc>end){
                    System.out.println("不在数字"+start+"到"+end+"区间内");
                    continue;
                }
                break;
            }catch (InputMismatchException x){
                System.out.println("输入不合法");
                scanner.next();
            }
        }
        return sc;
    }
}
