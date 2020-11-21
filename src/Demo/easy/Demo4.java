package Demo.easy;

public class Demo4 {
    public static void main(String[] args) {
        Short s2=100;
        Short s3=100;
        Short s4=200;
        Short s5=200;
        Long l2=100L;
        Long l3= 100L;
        Long l4= 200L;
        Long l5= 200L;
        Float f2=100f;
        Float f3=100f;
        Float f4=200f;
        Float f5=200f;
        //用==号会不相等
        System.out.println(s2.equals(s3));
        System.out.println(s4.equals(s5));
        System.out.println(l2.equals(l3));
        System.out.println(l4.equals(l5));
        System.out.println(f2.equals(f3));
        System.out.println(f4.equals(f5));
    }
    //integercache longcache 都是静态内部类
//整型有缓存机制，浮点数没有

}
