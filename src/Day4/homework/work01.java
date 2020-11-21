package Day4.homework;

public class work01 {// 2.求1！+4！+7！+..+16!

    public static void main(String[] args) {
        int i=1,j,factorial=1;
        double sum=0;
        while (i<=16){
            j=1;
            factorial=1;
            while (j<=i){
                factorial*=j;
                j++;
            }
            if (j>i){
                sum+=factorial;
            }
            i+=3;
        }
        System.out.println(sum);
    }
}
