package Day08.afternoonWork;

import java.util.Scanner;

public class catTest {
    public static void main(String[] args) {//字符串比较用equals方法
        cat cat1=new cat("小黑",2,"黑色");
        cat cat2=new cat("小白",5,"白色");
        System.out.println("请输入小猫的名字");
        Scanner scanner=new Scanner(System.in);
        String sc=scanner.nextLine();
        if(sc.equals("小黑")){
            cat1.showCat();
        }else if (sc.equals("小白")){
            cat2.showCat();
        }else {
            System.out.println("小红没有养这只猫");
        }
    }
}
