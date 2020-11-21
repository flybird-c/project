package Demo.Day13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileRead {
public  String fileRead(String path){
    StringBuilder sb=new StringBuilder();
    try {
        FileInputStream file=new FileInputStream(path);
        byte[] c=new byte[100];

        for (int length;(length=file.read(c))!=-1; ) {//read是每次取出byte数组长度的字，能取到末尾时，会把这次长度内的剩余字节返回，再返回-1表示已经到末尾
            //这个方法从 InputStream 对象读取指定字节的数据。返回为整数值。返回下一字节数据，如果已经到结尾则返回-1。
            sb.append(new String(c,0,length,"gbk"));
        }
        file.close();
    }catch (FileNotFoundException x){

    }catch (IOException y){

    }
    return sb.toString();
    }
}
