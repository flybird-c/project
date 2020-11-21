package Demo.D15test;

import java.io.*;

public class question3 {//3.	在C盘创建C文件夹，文件夹内创建C.txt，同理创建D:\D\D.txt和E:\E\E.txt如果没这么多盘符创在一个磁盘下也可以

    //    在C.txt中写入Hello,在D.txt中写入Java。C.txt和D.txt中的内容读取出来写入到E.txt (15分)
    public static void main(String[] args) {
        String path1 = "c:\\c\\c.txt";
        String path2 = "c:\\c\\d.txt";
        String path3 = "c:\\c\\e.txt";
        File f1 = new File(path1);
        File f2 = new File(path2);
        File f3 = new File(path3);

        try {
            File f1parent = new File((f1.getParent()));
            f1parent.mkdirs();
            f1.createNewFile();
            File f2parent = new File((f2.getParent()));
            f2parent.mkdirs();
            f2.createNewFile();
            File f3parent = new File((f3.getParent()));
            f3parent.mkdirs();
            f3.createNewFile();
            Writer cw = new FileWriter(path1);
            cw.write("hello");

            Writer dw = new FileWriter(path2);
            dw.write("java.c");

            char[] chars = new char[1];
            cw.close();
            dw.close();//写入结束，关闭写入刷新文本状态
            Reader cr = new FileReader(path1);
            Reader dr = new FileReader(path2);

            Writer ew = new FileWriter(path3, true);
            int length;
            while ((length = cr.read(chars)) != -1) {
                ew.write(chars, 0, length);
            }
            while ((length = dr.read(chars)) != -1) {
                ew.write(chars, 0, length);
            }

            ew.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
