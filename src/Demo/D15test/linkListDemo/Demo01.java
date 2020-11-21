package Demo.D15test.linkListDemo;

public class Demo01{
    public Demo01(String content, Object next,Object last) {
        this.content = content;
        this.next = next;
        this.last=last;
    }
    public Demo01() {
    }
    public Demo01(String content) {
        this.content=content;
    }

    @Override
    public String toString() {
        return "content='" + content ;
    }

    String  content;
    Object next;
    Object last;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Object getNext() {
        return next;
    }

    public Object getLast() {
        return last;
    }

    public void setLast(Object last) {
        this.last = last;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public static void main(String[] args) {
        Demo01 n1=new Demo01("A");
        Demo01 n2=new Demo01("B");
        Demo01 n3=new Demo01("C");
        Demo01 n4=new Demo01("D");
        Demo01 n5=new Demo01("E");
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=null;

        n1.last=null;
        n2.last=n1;
        n3.last=n2;
        n4.last=n3;
        n5.last=n4;
        Demo01 temp=n1;
        while (temp!=null){
            System.out.println(temp);
            temp=(Demo01) temp.next;
        }
//        temp=n5;
//        while (temp!=null){
//            System.out.println(temp);
//            temp=(Demo01) temp.last;
//        }
    }
}
