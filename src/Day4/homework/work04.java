package Day4.homework;

public class work04 {//1+1/3-1/5+1/7-1/9+..1/101

    public static void main(String[] args) {
        double sum=0;
        double i=1;
        double x=1;
        int count=1;
        while (i<=101){
            if (count%2!=0&&count!=1){
                x*=-1;
            }else {
                x=1;
            }
            sum+=x/i;
            i+=2;
            count+=1;
        }
        System.out.println(sum);
    }
}
