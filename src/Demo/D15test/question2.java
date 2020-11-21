package Demo.D15test;

import java.util.Arrays;
import java.util.List;

public class question2 {//2.	使用三种方式遍历List的集合元素 (for循环，增强for循环、迭代器)(15分 )
    public static void main(String[] args) {
        List list= Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        int  j=6;
        for (int i = 0; i < list.size(); i++) {
           System.out.println(list.get(i));
        }
        System.out.println("_________");
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("_________");
        list.stream().forEach(i->System.out.println(i));

    }
}
