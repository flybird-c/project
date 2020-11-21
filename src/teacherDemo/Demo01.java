package teacherDemo;

import java.io.*;
import java.util.Scanner;

public class Demo01 {
    //-- 需求： 把给定路径下所有的TXT文件复制到另外一个目录下

    //-- 1.获取给定路径下的所有TXT : 文件的路径或者是File对象

    //-- 2.把这些File对象复制到另外一个目录下！

    public static void main(String[] args) {
        Demo01 d = new Demo01();
        Scanner scan = new Scanner(System.in);
        System.out.println("输入路径1");
        String target = scan.next();
        System.out.println("输入路径2");
        String newPath = scan.next();

        String paths = d.listFiles(target);

        String[] array = paths.split("#");
        for (String s : array) {
            //-- newPath代表的是一个目录而不是一个文件的完整路径。所以要把文件的完整路径拼接出来
            String temp = newPath + s.substring(s.lastIndexOf("\\"));
            d.copyFile(s,temp);
        }


    }

    public String listFiles(String target){
        //--  不知道有多少个路径，选择使用字符串拼接来完成最终路径
        //-- 文件1#文件2#文件3
        String paths = "";

        //-- 1.检查参数
        if(target == null || target.length() == 0){
            return null;
        }

        //-- 2.构建File对象确认File是一个文件夹 listFiles必须是被文件夹调用的，如果是文件返回值是null
        File file = new File(target);
        if (!file.isDirectory()){
            return null;
        }

        //-- 3.通过file对象调用listFiles方法得到给定路径下的所有文件或者文件夹的File对象。保存在数组中
        File[] files = file.listFiles();

        //-- 4.确认数组是否为空，避免遍历时产生空指针
        if (files == null){
            return null;
        }

        //-- 5.遍历File数组
        for (File f : files) {
            if (f.isDirectory()){
                paths += listFiles(f.getAbsolutePath()) + "#";
            }else{
                //-- 判断文件的后缀名是不是txt
                if (f.getName().endsWith("txt")){
                    paths = paths + f.getAbsolutePath() + "#";
                }
            }
        }
        //“”+路径1 + “#” + “路径2"+# 最终会多一个#出来
        paths = paths.substring(0,paths.length() - 1);

        return paths;
    }


    private void copyFile(String oldPath, String newPath) {
        //-- JDK1.8新特性 try（）的写法！
        //-- ()内放的是需要关闭的资源，JVM会自动帮我们关闭掉
        try(InputStream is = new FileInputStream(oldPath);
            OutputStream os = new FileOutputStream(newPath)){

            int length = 0 ;
            byte[] buffer = new byte[1024];

            while(-1 != (length = is.read(buffer))){
                os.write(buffer,0,length);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
