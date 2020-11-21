package Demo.D15test;

public class question4 {//4.	使用递归求：1！+2！+3！+4！+…+10!(10分)

    public static void main(String[] args) {
        question4  question4=new question4();
        System.out.println(question4.jieCheng(10));
    }
    public int jieCheng(int velue){
        int sum=1;
        for (int i = velue; i >0; i--) {
            if (velue==1){
                return  1;
            }else {
               sum+= jieCheng(velue-2)+jieCheng(velue-1);
            }
        }
        return sum;
    }
}
