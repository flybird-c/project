package Day4.homework;
import java.util.Scanner;

public class work02 {//3.求a+aa+aaa+...+aaaaaaaaa的和（比如a是2）

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入最大的数字：");
        int sc=scanner.nextInt();
        int sum=0;
        while (true){
            if (sc/10==0){
                sum+=sc;
                break;
            }else {
                sum+=sc;
                sc/=10;
            }
        }
        System.out.println("和一共是："+sum);
    }
}
