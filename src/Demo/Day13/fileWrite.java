package Demo.Day13;

import java.io.*;

public class fileWrite {
    public void write(String write,String path,boolean append){//1.选择流
        try {
            OutputStream os=new FileOutputStream(path,append);
            os.write(write.getBytes("gbk")); //2.写入内容
            os.close(); //3.关闭文件
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
