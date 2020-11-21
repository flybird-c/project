package teacherDemo;

import java.io.*;

public class buffReader {
    public static void main(String[] args) {
        try {
            BufferedReader br = null;
            try {
                String[] chapters = new String[120];
                int chapter = 0;
                File file = new File("红楼梦.txt");
                Reader reader = new FileReader(file); //-- 一次只能读取一个字符
                //-- 对FileReader做包装得到包装流
                br = new BufferedReader(reader); //-- 可以一次读取一行
                String line = "";
                String regex = "^第.+回.+";
                while (null != (line = br.readLine())) {
                    if (line.matches(regex)) {
                        //-- 章节目录行
                        chapters[chapter] = line;
                        chapter++;
                    }
                }
                for (String s : chapters) {
                    if (s == null || s.length() == 0) continue;
                    System.out.println(s);
                }
            } finally {
                br.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
