package Demo.D16Demo;

import java.io.*;

/**
 * @author EDZ
 */
public class Student {
    private  String name;
    private  String age;

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public static void main(String[] args) {
        Student student=new Student();
        try {
            Writer writer=new FileWriter("D:\\D\\D.txt");
            InputStream inputStream=new FileInputStream("D:\\D\\D.txt");
//            ObjectInputStream objectInputStream=new ObjectInputStream();
//            writer.write(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
