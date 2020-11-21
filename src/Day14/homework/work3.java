package Day14.homework;

import java.awt.*;
import java.util.ArrayList;

public class work3 {
    //    3.四种方法遍历第二题的集合
    public static void main(String[] args) {
        ArrayList arrayList=new work2().list();

        arrayList.stream().forEach(a->System.out.println(a));
        System.out.println("——————————————————");
        for (int i = arrayList.size()-1; i >=0; i--) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("——————————————————");
        for (Object x:
             arrayList) {
            System.out.println(x);
        }System.out.println("——————————————————");

    }
}
