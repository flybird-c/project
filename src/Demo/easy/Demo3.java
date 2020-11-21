package Demo.easy;

import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {
        //声明一一个二维数组，用于存储3个一维数组，每一个一维数据存多少个数组，不知道 ，null
        int [][]intB=new int[3][];
        intB[0]=new int[3];  //3
        intB[1]=new int[]{1,2,3,4};  //3
        intB[2]=new int[2];  //2
        for (int x=0;x<intB.length;x++){
            System.out.println(Arrays.toString(intB[x]));
        }
    }
}
