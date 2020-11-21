package Demo.easy;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtils {

    private static final Scanner scan = new Scanner(System.in);

    public static int nextInt(int start,int end){
        int temp = 0;
        while(true){
            try{
                temp = scan.nextInt();
                if(temp > end || temp < start){
                    System.out.println("越界，超过了指定的范围，范围是："+start +"-" + end);
                    continue;
                }
                break;
            }catch (InputMismatchException e){
                System.out.println("只能输入数字，请重新输入！");
                scan.next();
            }
        }
        return temp;
    }

    public static String next(){
        return scan.next();
    }

}
