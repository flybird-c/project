package Day14.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class news{
    private String headline;
    private String content;

    public news(String headline) {
        this.content = "不是新闻的新闻";
        this.headline=headline;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return headline;
    }

    //4.封装一个新闻类，
//
//            1)包含标题和内容属性，提供get、set方法，重写toString方法，打印对象时只打印标题
//
//2)只提供一个带参数的构造器，实例化对象时，只初始化标题；并且实例化两个对象：
//    新闻一：特朗普结局在哪里
//    新闻二：疫情什么时候结束
//
//3)将新闻对象添加到ArrayList集合中，并且使用Iterator遍历；
//
//            4)在遍历集合过程中，对新闻标题进行处理，超过15字的只保留前14个，然后在后边加“…”
//
//            5)在控制台打印遍历出经过处理的新闻标题


    public static void main(String[] args) {
        news news1=new news("新闻一：特朗普结局在哪里?????????????????????????");
        news news2=new news("新闻二：疫情什么时候结束??????????????????????????");
        ArrayList<news> arrayList=new ArrayList<>();
        arrayList.add(news1);
        arrayList.add(news2);
        Iterator iterator=arrayList.iterator();
        for (;iterator.hasNext();) {
//          iterator.toString().length()>15?System.out.println(iterator.next().toString().substring(0,14)+"......"):System.out.println(iterator.next());
            if (iterator.toString().length() > 15) {
                System.out.println(iterator.next().toString().substring(0, 14) + "......");
            } else {
                System.out.println(iterator.next());
            }
        }
    }




}
