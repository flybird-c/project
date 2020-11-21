package Demo.Day13;

import java.io.*;

public class Demo1 {
    public static void main(String[] args) {
        try {
            //缓冲流，包装流，给普通字节流或者字符流包装，在内存中数据积累到一定数值，或者调用flush方法才会写入，目的是减少与硬盘交互次数，增加每次传输的数据量，提高传输效率
            BufferedReader bf=new BufferedReader((new FileReader("D:\\红楼梦.txt")));
            BufferedWriter bw=new BufferedWriter((new FileWriter("D:\\h.txt")));
            char[] chars=new char[10];
            int leigh=0;
            while (-1!=(leigh= bf.read(chars))){
                bw.write(chars,0,leigh);
                bw.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
