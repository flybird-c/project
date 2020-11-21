package Day08.afternoonWork;

public class StudentTest {
    public static void main(String[] args) {
        Student student=new Student("张三",18);
        Student student1=new Student("李四",19,"男","计算机应用技术");
        student.selfIntroduction();
        student1.selfIntroduction();
    }
}
