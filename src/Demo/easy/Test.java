package Demo.easy;

public class Test {
    public static void main(String[] args) {
        A a=new A();
        A a2=new B();
        B b=new B();
        C c=new C();
        D d=new D();

        a.show(a); //AA
        a.show(a2);//AA
        a.show(b);//AA
        a.show(c);//AA
        a.show(d);//AD


        a2.show(a);//BA
        a2.show(a2);//BA

        a2.show(b);
        //A类型对象存储的是B类型实例，传进的b参数是B类型。
        // 第一步，找A类里的方法声明（引用变量找到实例（也叫对象））；
        //第二部，根据传进参数的类型找到方法体。     （引用变量，不是引用变量里的实例）
        //第三步，由于B类型参数找不到对应的方法体，*参数类型*自动向上转型，等同于a2.show(B类型)==>a2.show(A类型)。
        //A类方法体力有参数为A的方法，但由于A类实际储存的是B实例（对象），B实例(对象)的B类重写了A方法，所以输出的是B类里的A方法。

        a2.show(c);//
        a2.show(d);
    }
}
