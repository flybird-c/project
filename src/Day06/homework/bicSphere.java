package Day06.homework;

import java.util.Arrays;
import java.util.Random;

public class bicSphere {
    public static void main(String[] args) {
        int index;
        int Index=0;
        int num;
        boolean x=true;
        //定义一个有100个7个长度数组的二维数组
        //定义一个二维数组
        int[][] Items=new int[100][7];
        Random random=new Random();
        while (Index<Items.length){
            index=0;//重置内层循环的计数器
            while (index<Items[index].length-1)
            {//判断是否有相同号码
                num=random.nextInt(34);//随机1-33的不重复的号码
                if (num==Items[Index][index])
                {//有则跳过存放进入下一次随机号码生成
                    continue;
                }
                else
                    {//没有则存放进数组
                        Items[Index][index]=num;
                    if (index==5)
                    {
                        Items[Index][6]=random.nextInt(17);//当倒数第二个值赋值完后，给最后一个值随机赋值一个1-16不重复的号码
                    }
                    index++;
                }
            }
//            Items[Index]=item;//一位数组赋值给二维数组、、、、、、、这里实际上是把一维数组的地址赋给了二维数组
            Index++;
        }
        Index=0;
        for (;Index<Items.length;Index++)
        System.out.println(Arrays.toString(Items[Index]));//最后输出的是100次一维数组，一维数组里放的是最后一轮的随机数值
    }
}

