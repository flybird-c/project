package Demo.easy;

/**
 * @author EDZ
 */
public class A {
    public void show(A a){System.out.println("AA");}
    public void show(D d){System.out.println("AD");}

}
class B extends A {
    public void show(A a){System.out.println("BA");}
    public void show(B b){System.out.println("BB");}

}
class C extends B{}
class D extends B{}

