package Demo.easy;

public class ArrayUtils {
    //-- 需要改成成员变量。因为要在其它的方法中访问这两个变量，如果写在main方法中。作用域仅限再main中，其它的方法无法访问！
    //-- str  是数据源
    static String[] str = new String[10];
    //-- size 代表数据源中实际存储的元素个数！（我们放进去的。不算默认值）
    static int size = 0;

    //-- 代表上面数组 str的使用率 ： 实际使用的空间/数组的长度
    static final double RATE = 0.75;

    public static void main(String[] args) {
        boolean flag = true;

        while (flag) {
            //-- 1.显示菜单项
            showMenuItem();
            //-- 2.显示分隔线
            System.out.println("----------请输入----------");
            int choose = InputUtils.nextInt(1, 9);
            switch (choose) {
                case 1:
                    showAllElements();
                    break;
                case 2:
                    showCountOfElements();
                    break;
                case 3:
                    if(checkElementExists()){
                        System.err.println("元素存在");
                    }else{
                        System.err.println("元素不存在");
                    }
                    break;
                case 4:
                    saveElement();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    flag = false;
                    break;
                default:
                    break;
            }
        }
        //Unreachable statement
        System.out.println("欢迎下次使用！");
    }


    public static void checkArrayRange(){
        if(((double)size) / str.length >= RATE){
            //-- 对数组进行扩容操作
            //-- 扩容：新建一个数组（新建数组的长度是原有数组长度的1.8倍） 把原有数组的内容复制过来
            String[] temp = new String[(int)(str.length*1.8)];
            for (int i = 0 ; i < size ; i ++){
                temp[i] = str[i];
            }
            //-- 让str这个引用变量指向新的数组，因为我们操作的始终都是str
            str = temp;
        }
    }

    public static void saveElement(){
        System.out.println("请输入要保存的元素");
        String target = InputUtils.next();
        //-- 保存的方式：把元素放到数组中

        //-- 检查数组中是否有空间来存储这个元素，如果有什么事也不干，如果没有扩容，扩容80%
        checkArrayRange();

        //-- 顺序添加一个元素
        str[size] = target;

        //-- 个数累加1
        size = size + 1;
    }


    /**
     *
     * 判断元素在数组中是否存在！
     *  返回true  表示 元素存在
     *  返回false 表示 元素不存在！
     */
    public static boolean checkElementExists(){
        System.out.println("请输入要查找的元素");
        String target = InputUtils.next();
        int index = indexOfElement(target);
        return index != -1;
    }

    /**
     * 返回元素在数组中第一次出现的下标，如果没有出现返回-1
     * @param content
     * @return
     */
    public static int indexOfElement(String content){
        for (int i = 0; i < size; i++) {
            if(str[i].equals(content)){
                return i;
            }
        }
        return -1;
    }


    public static void showCountOfElements(){
        System.err.println("数据源中有元素:" + size + "个！");
    }


    /**
     * 显示所有的元素
     */
    public static void showAllElements(){
        if(size == 0){
            //-- 不算默认值，没有数据指的 我们还没有放数据到数组中！
            System.err.println("暂无数据");
        }else{
            //-- ? 为什么是<size而不是 < str.length
            for (int i = 0 ;i < size ; i ++){
                System.err.println(str[i]);
            }
        }
    }

    public static void showMenuItem() {
        System.out.println("1.查询数组中所有元素");
        System.out.println("2.查询数组中元素个数");

        System.out.println("3.判断元素是否存在");

        System.out.println("4.插入元素到数组中");
        System.out.println("5.插入元素到数组中指定的位置");

        System.out.println("6.删除数组中的元素");
        System.out.println("7.删除数组中指定的元素");

        System.out.println("8.更新数组中指定的元素");

        System.out.println("9.退出");
    }
}
