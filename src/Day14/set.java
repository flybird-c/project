package Day14;

import java.util.ArrayList;

public class set {
    public static void main(String[] args) {
        ArrayList<Integer> l4=new ArrayList<Integer>();
        l4.add(1);
        l4.add(2);
        l4.add(3);
        l4.add(4);
        l4.add(10);
        l4.set(0,3);
        for (int i = 0; i < l4.size(); i++) {
            System.out.println(l4.get(i));
        }
        for (Integer i : l4) {
            System.out.println(i);
        }
        l4.stream().forEach(i ->System.out.println(i));
    }
}
