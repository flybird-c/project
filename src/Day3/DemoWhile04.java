package Day3;

public class DemoWhile04 {
    public static void main(String[] args) {
        int i=1;
        while (i<=100){
            if (i%4==0&&i%9==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
