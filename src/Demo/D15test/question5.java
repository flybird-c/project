package Demo.D15test;

import java.io.*;
import java.util.ArrayList;
import java.util.function.Consumer;

public class question5 {
//    5.使用IO流读取D盘里面的exam.txt文本文件的内容，每次读取一行内容，将每行作为一个输入放入ArrayList的泛型集合中并将集合中的内容使用foreach进行输出显示。（15分）
//    Sid,sname,sage,sgender,sphone
//1,张三,19,男,110
//            2,李四,20,女,120
//            3,王五,21,女,119
//            4,赵六,22,男,10086.
public static void main(String[] args) {
    String path1 = "D:\\c\\exam.txt";
    File f1 = new File(path1);

    try {
        File f1parent = new File((f1.getParent()));
        f1parent.mkdirs();
        f1.createNewFile();

        Writer cw = new FileWriter(path1);
        cw.write("Sid,sname,sage,sgender,sphone\n" + "1,张三,19,男,110\n" + "\t2,李四,20,女,120\n" + "\t3,王五,21,女,119\n" + "\t4,赵六,22,男,10086.");
        cw.close();

        Reader cr = new FileReader(path1);

        char[] chars = new char[1024];
        ArrayList<String> arrayList=new ArrayList<>();
        int length;
        while ((length = cr.read(chars)) != -1) {
            arrayList.add(""+cr.read(chars, 0, length));
        }
//        arrayList.forEach();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
