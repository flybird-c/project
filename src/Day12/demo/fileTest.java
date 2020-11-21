package Day12.demo;

import java.io.File;
import java.io.IOException;

public class fileTest {
    public static void main(String[] args) {
        fileTest fileTest =new fileTest();
        String path="d:"+File.separator+"D"+File.separator+"D.TXT";
        System.out.println(path);
        try {
            fileTest.createFile(path);
            System.out.println(path);
            fileTest.deleteFile(path);
            String path1="d:"+File.separator+"D"+File.separator+"ex"+File.separator+"1232131.TXT";
            fileTest.createFile(path1);
            System.out.println(path1);
            fileTest.renameFile(path,path1);
        }catch (IOException e){

        }
    }
    public void createFile(String path)throws IOException {
        if (path==null||path.length()==0){
            System.out.println("路径非法");
            return;
        }
        File file=new File(path);
        if(file.exists()){
            return;
        }
        File parent=file.getParentFile();
        if(!parent.exists()){//-- 创建上级目录
            //-- 创建目录有两个方法：mkdir和mkdirs
            //-- c:\\A\\B\\C
            //-- 假如A是不存在的，使用mkdir创建不了任何目录，因为需要一个前提就是：上级目录是存在的
            //-- 假如A是不存在的，使用mkdirs 会把路径中所有不存在都创建出来！
            parent.mkdirs();
        }
        file.createNewFile();
    }
    public void deleteFile(String path){
        if (path==null||path.length()==0){
            System.out.println("路径非法");
            return;
        }
        File file=new File(path);
        if (!file.exists()){
            return;
        }
        file.delete();
    }
    public void renameFile(String oldName,String newName){
        if (oldName==null||oldName.length()==0||newName==null||newName.length()==0){
            System.out.println("路径非法");
            return;
        }
        File oldFile=new File(oldName);
        File newFile=new File(newName);
        oldFile.renameTo(newFile);
    }
}
