package Day05.ArrayPractice;

import java.util.Random;

public class StatisticsTimes {
    public static void main(String[] args) {
        Random random=new Random(1);
        int[] array=new int[10];
        int index=0;
        int[] x=new int[11];
        while (index<array.length){
            array[index]=random.nextInt(10)+1;
            index++;
        }
        index=0;
        while (index<array.length){
            System.out.println(array[index]);
            x[array[index]]+=1;
            index++;
        }
        index=0;
        while (index<x.length){
            if (x[index]!=0)
                System.out.println(index+"出现了"+x[index]+"次");
            index++;
        }
    }

}
