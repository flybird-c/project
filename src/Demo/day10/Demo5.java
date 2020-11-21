package Demo.day10;

public class Demo5 {
    String name;
    String name1;
    Demo5(String input) {
        name = input;
    }
    Demo5() {
        this.name="1";
        this.name1=("Java language");//第一行构造方法内的this是默认给第一个符合类型的变量赋值
         }
    public static void main(String args[]) {
        Demo5 IO1 = new Demo5();
        Demo5 IO2= new Demo5();
        System.out.println(IO1.name);
        System.out.println(IO2.name);
        System.out.println(IO1.name1);
        System.out.println(IO2.name1);
    }
}
