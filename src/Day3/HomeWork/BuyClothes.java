package Day3.HomeWork;
import java.util.Scanner;
public class BuyClothes {//有5家衣服专卖店，每家最多购买3件。用户可以选择离开，可以买衣服。最后打印总共买了几件衣服。
    public static void main(String[] args) {
        int count=0,num=1;
        int repeatbuy=0;
        Scanner scanner=new Scanner(System.in);
        while (num<=5){
            System.out.println("欢迎光临第"+num+++"家店");
            while (repeatbuy<3){
                System.out.println("要离开吗（y/n）？");
                String sc=scanner.next();
                if (sc.equals("y")){
                    System.out.println("离店结账"+"\n");
                    break;
                }
                else if (sc.equals("n")){
                    System.out.println("买了一件衣服"+"\n");
                    count++;
                    repeatbuy++;
                    if (repeatbuy==3){
                        repeatbuy = 0;
                        System.out.println("同一家商店最多只能买3件衣服");
                        break;
                    }else {
                        ;
                    }
                }
                else {
                    ;
                }
            }

        }
        System.out.println("总共买了"+count+"件衣服");

    }
}
