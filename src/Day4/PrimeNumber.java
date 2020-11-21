package Day4;

public class PrimeNumber {
    public static void main(String[] args) {
        int i=1;
        boolean x=true;
        while (i<=100){
            int j=2;
            while (j<i){
                if (i%j==0&&i!=j){
                    System.out.println(i+"不是素数");
                    x=false;
                    break;
                }
                j++;
            }
            if (x){
                System.out.println(i+"是素数");
            }
            i++;
        }
    }
}
