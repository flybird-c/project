package Day4.homework;

public class work03 {//4.输入一个数，求质因数分解过程  20 => 4*5 2*2*5
    //20/2=10,print2
    // 10/2=5,print2
    // 5/2!=0,5/3!=0...5/5=1,print5

    public static void main(String[] args) {
        int input=37;
        int w=2;
        while (w<37){
            if (input%w==0){
                System.out.println(w+"\t");
                input/=w;
                continue;
            }
            else {
                w++;
            }
        }
    }
}
