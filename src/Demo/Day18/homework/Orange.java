package Demo.Day18.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author EDZ
 */
public class Orange {//桌子上有一个盘子,爸爸向盘子中放苹果,妈妈向盘子中放橘子,儿子只吃苹果,女儿只吃橘子.同一时间盘子中只能有一个水果!
    static  volatile int i = 0;
    static  volatile int j = 0;

    class fang extends Thread {


        @Override
        synchronized public void run() {
            if ((int) (Math.random() * 2) == 1) {
                System.out.println(i);
                System.out.println("妈妈放了一个橘子");
                i++;
                System.out.println(i);
                System.out.println("_______________");
            } else {
                System.out.println(j);
                System.out.println("爸爸放了一个苹果");
                System.out.println(j);
                System.out.println("_______________");
                j++;
            }
            if (i == 1) {
                System.out.println(i);
                System.out.println("女儿吃了一个橘子");
                i--;
                System.out.println(i);
                System.out.println("_______________");
            } else if (j == 1) {
                System.out.println(j);
                System.out.println("儿子吃了一个苹果");
                j--;
                System.out.println(j);
                System.out.println("_______________");
            }
        }
    }
        public static void main(String[] args) {
            Orange orange = new Orange();
            int c=0;
            while (c<50){
            orange.new fang().start();
            orange.new fang().start();
            c++;
        }}

    }
