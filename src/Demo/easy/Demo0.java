package Demo.easy;
import Day06.InputUtils;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Demo0 {
    public static void main(String[] args) {
//     int i=0;
//     InputUtils.nextInt(1,10);

//
//        String[] strings=new String['Z'-'M'+1];
//        for (char i='Z',j='Z';i>='M';i--){
//            strings[j-i]=i+"";
//        }
//        int index=0;
//        while (index<strings.length){
//            System.out.print(strings[index++]+"\t");
//
//
        System.out.println(Arrays.toString(generatingIntRandomGrrays(10)));
    }
    public static int[] generatingIntRandomGrrays(int x){
        int[] i=new int[x];
        Random random=new Random();
        for (int index=0;index<i.length;index++){
            i[index] =random.nextInt(100);
        }
        return i;
    }
    public static int outOfTheStack(int[] x){
        return 0;
    }
}
