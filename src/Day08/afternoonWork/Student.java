package Day08.afternoonWork;

import java.text.Format;
import java.text.MessageFormat;

public class Student {
    String Name;
    int Age;
    String sex;
    String profession;

    Student(String Name,int Age){
        this.sex="男";
        this.profession="Android";
        this.Name=Name;
        this.Age=Age;
    }
    Student(String Name,int Age,String sex,String profession){
        this.Name=Name;
        this.Age=Age;
        this.sex=sex;
        this.profession=profession;
    }
    void selfIntroduction(){
        System.out.println(MessageFormat.format("我叫{0}，今年{1}岁，性别{2},我的专业是{3}",Name,Age,sex,profession));
    }
}
