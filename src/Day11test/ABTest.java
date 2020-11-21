package Day11test;

/**
 * @author EDZ
 */
public class ABTest {
    public static void main(String[] args) {
        classC classC=new classC();
        classB classB=classC;
        classA classA=classB;
        classA classA1=new classA();
        Day11test.classA.teacherClass teacherClass=classA.new teacherClass(){
            @Override
            public void teach() {
                System.out.println("这是一个新的老师的教学");
            }
        };
        teacherClass.teach();
    }
}
