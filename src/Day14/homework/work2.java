package Day14.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class work2 {
    //    2.创建ArrayList实例化对象，添加10个以上的元素，
//            1.在2号位插入一个元素，
//            2.获得5号位元素，
//            3.删除6号位元素，
//            4.修改7号位的元素
    public static void main(String[] args) {
         work2 work2=new work2();
         ArrayList<Object> arrayList= work2.list();
        System.out.println(arrayList.toString());
        arrayList.add(2, "w");
        System.out.println(arrayList.toString());
        System.out.println(arrayList.get(5));
        System.out.println(arrayList.toString());
        arrayList.remove(6);
        System.out.println(arrayList.toString());
        arrayList.set(7, "ok");
        System.out.println(arrayList.toString());
    }

    public ArrayList<Object> list() {
        ArrayList<Object> arrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arrayList.add(i);
        }
        return arrayList;
    }
}
