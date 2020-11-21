package Day3;

public class DemoWhile08 {
    public static void main(String[] args) {
        int i=1;
        while (i<=100){
            if (i%3==0&&i%4!=0&&i%2==1){
                System.out.println(i);
            }
            i++;
        }
    }
}
