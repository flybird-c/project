package Demo.Day13.homework;

import java.io.File;

public class fileList {
    public String fileList(String target){
        String paths="";
        if (target.length()==0||target==null){//参数检查
            return null;
        }
        File file=new File(target);//是否是文件夹
        if (!file.isDirectory()){
            return null;
        }
        File[] files= file.listFiles();//文件列表储存在数组里
        for (File f : files) {//遍历
            if (f.isDirectory()){//文件夹是否还有文件夹
                paths+=fileList(f.getAbsolutePath())+"#";
            }else {
                if (f.getName().endsWith("jpg"))//后缀名判断
                paths+=f.getAbsolutePath()+"#";
            }
        }
        paths = paths.substring(0,paths.length() - 1);//字符串修剪

        return paths;
    }
}
