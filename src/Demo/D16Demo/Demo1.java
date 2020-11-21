package Demo.D16Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author EDZ
 */
public class Demo1 {
    public static void main(String[] args) {//统计出现次数
        ArrayList arrayList = new ArrayList(Arrays.asList(1, 2, 1, 3, 4, 45, 5, 5, 5, 5));
        System.out.println(arrayList);
        ArrayList temp = new ArrayList();
        int i;
        while (arrayList.size() != 0) {
            i = 0;
            temp.add(arrayList.get(0));
            while (arrayList.indexOf(temp.get(0)) != -1) {
                arrayList.remove(arrayList.indexOf(temp.get(0)));
                i++;
            }
            System.out.println(temp.get(0) + "的出现次数是" + i);
            temp.clear();
        }
    }
}
