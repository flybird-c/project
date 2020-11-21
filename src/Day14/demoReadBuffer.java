package Day14;

import java.io.*;

public class demoReadBuffer {
    public static void main(String[] args) {
        ////文件路径
        String oldPath="D:\\D\\红楼梦.txt";
        String newPath="D:\\D\\D\\红楼梦.txt";
        //构建一个字符流来读取
        try {
            Reader reader=new FileReader(oldPath);
            Writer writer=new FileWriter(newPath);
            char[] chars=new char[1024];
            int length;
            while ((length= reader.read(chars))!=-1){
                writer.write(chars,0,length);
                writer.flush();//刷新缓存
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //字符串数组用来读取
        //StringBuilder类用来存储读取
        // 输出
    }
}
