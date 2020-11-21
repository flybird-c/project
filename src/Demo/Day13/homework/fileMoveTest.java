package Demo.Day13.homework;

import Demo.Day13.fileMove;

import java.util.Scanner;

public class fileMoveTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入文件夹路径");
        String target=scanner.next();
        System.out.println("请输入目标文件夹路径");
        String paths=scanner.next();
        fileList fileList=new fileList();
        String list= fileList.fileList(target);
        System.out.println(list);
        String[] fileLists=list.split("#");
        fileMove fileMove=new fileMove();
        for (String s : fileLists) {
            //-- newPath代表的是一个目录而不是一个文件的完整路径。所以要把文件的完整路径拼接出来
            String temp = paths + s.substring(s.lastIndexOf("\\"));//将源路径文件的最后一个\\后的文件名拼接
            fileMove.fileMove(s,temp);
        }
    }
}