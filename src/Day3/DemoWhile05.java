package Day3;

public class DemoWhile05 {
    public static void main(String[] args) {
        int i=100;
        while (i<=999){
            if (Math.pow((i/100),3)+Math.pow((i/10%10),3)+Math.pow((i%100%10),3)==i){
                System.out.println(i);
            }
            i++;
        }
    }
}
