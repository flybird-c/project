package Demo.Day13;

import java.io.*;

public class fileMove {
    public void fileMove(String oldPaths,String newPaths){
        try {
            FileInputStream file=new FileInputStream(oldPaths);
            OutputStream os=new FileOutputStream(newPaths);
            byte[] c=new byte[1024];
            int length;
            for (;(length=file.read(c))!=-1; ) {//read是每次取出byte数组长度的字，能取到末尾时，会把这次长度内的剩余字节返回，再返回-1表示已经到末尾
                //这个方法从 InputStream 对象读取指定字节的数据。返回为整数值。返回下一字节数据，如果已经到结尾则返回-1。
                os.write(c,0,length); //2.写入内容
            //(new String(c,0,length,"gbk"));
            }
            file.close();
            os.close(); //3.关闭文件

        }catch (FileNotFoundException x){

        }catch (IOException y){

        }
    }
}
//        fileRead fileRead=new fileRead();
//        String path=fileRead.fileRead("C:\\Users\\EDZ\\Pictures\\表情包\\1000.jpg");
//        fileWrite fileWrite=new fileWrite();
//        fileWrite.write(path,"D:\\D\\D\\1000.jpg",false);
