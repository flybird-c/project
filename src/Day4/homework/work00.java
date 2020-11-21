package Day4.homework;

public class work00 {//1.求任意整数的二进制

    public static void main(String[] args) {
        int i=10;
        String str="";
        while (i!=0){
            str=i%2+str;
            i/=2;
        }
        System.out.println(str);
    }
}
