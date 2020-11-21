package Day3.HomeWork;
import java.util.Scanner;

public class GoShopping {/*完成购买商品结算功能：
        1、循环输入商品编号和购物数量，计算消费金额并累加到总金额
    2、输入“n”开始结账（假设享8折）
            3、输入实付金额，计算找零*/
    public static void main(String[] args) {
        //头部
        int commodity01=398,commodity02=200,commodity03=1024;
        System.out.println("*********************跳楼大甩卖*********************");
        System.out.println("\t1.羽绒服："+commodity01+"¥\t"+"2.阿迪达斯："+commodity02+"¥\t"+"3.冰箱："+commodity03+"¥\t");
        System.out.println("*********************跳楼大甩卖*********************");
        boolean condition=true;
        Scanner sc=new Scanner(System.in);
        double money=0;
        while (condition){
            //主体
            //输入编号,获得当前购买的商品信息
            System.out.println("请选择购物编号：");
            int id=sc.nextInt();
            int prime;
            switch (id){
                case 1:prime=commodity01;
                    System.out.println("羽绒服\n");
                    break;
                case 2:prime=commodity02;
                    System.out.println("阿迪达斯\n");
                    break;
                case 3:prime=commodity03;
                    System.out.println("冰箱\n");
                    break;
                default:prime=0;
                    System.out.println("什么都没选\n");
                    continue;
            }
            //没选直接跳过
            //输入数量
            System.out.println("请选择该物品的购买数量：");
            int num=sc.nextInt();
            //输出现在购物车
            money+=prime*num;
            System.out.println(money+"¥\n");
            //询问是否继续并判断
            System.out.println("是否继续（y/n）");
            String str=new String(sc.next());
            if (str.equals("y")){
                continue;
            }else if (str.equals("n")){
                System.out.println("请输入折扣价格：");
                float discount=sc.nextFloat();
                System.out.println("折扣为："+discount);
                //结束输入折扣
                money*=discount;
                System.out.println("总价格是"+money+"¥");
                condition=false;
                //输出金额明细

                System.out.println("");
            }else {
                System.out.println("输入错误");
                continue;
            }
        }
        while (true){
            System.out.println("请输入付款金额：");
            double paymoney= sc.nextInt();
            if (paymoney<money){
                System.out.println("金额不足");
                continue;
            }else{
                System.out.println("找零："+(paymoney-money));
                break;
            }
        }
    }
}
