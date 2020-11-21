package Day12.demo;

public class rabbitQuestion {// 1.有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
    // 假如兔子都不死，问每个月各有多少兔子（12个月以内）
    public static void main(String[] args) {
        int sum=0;
        rabbitQuestion rabbitQuestion=new rabbitQuestion();
        System.out.println(rabbitQuestion.rabbit(12));
    }
    public  int  rabbit(int month){
        int sum=0;
        for (int count = 1; count <= month; count++) {
            if (month<=2){
                sum=2;
                return sum;
            }else {
                sum+=2;
            }
        }
        return rabbit(month-2)+rabbit(month-1);
    }
}
