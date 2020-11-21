package Day07;

import java.util.Arrays;
import java.util.Random;

public class bubbleSort {
    public static void main(String[] args) {//随机给数组元素赋值
        Random random = new Random();
        int[] x = new int[20];
        for (int index = 0; index < x.length; index++) {
            x[index] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(x));

        //冒泡排序
        for (int j = 0; j < x.length - 1; j++) {//起始交换次数为数组长度-1，每循环一次交换次数-1
            for (int i = 0, temp; i < x.length - 1; i++) {//一轮交换次数为数组长度-1
                if (x[i] > x[i + 1]) {//交换位置
                    temp = x[i + 1];
                    x[i + 1] = x[i];
                    x[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(x));
    }
}
