package Day14;

import java.io.*;
import java.util.Arrays;

public class demoReadBufferMyself {
    public static void main(String[] args) {
        String newPath="D:\\D\\红楼梦.txt";
        String oldPath="D:\\D\\D\\红楼梦.txt";

        try {
            Reader reader=new FileReader(newPath);
            Writer writer=new FileWriter(oldPath);
            char[] chars=new char[1024];
            while (reader.read()!=-1){
                writer.write(chars);
//                System.out.println(Arrays.toString(writer.toString()));
                writer.flush();

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
