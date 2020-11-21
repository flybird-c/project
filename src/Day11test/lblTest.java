package Day11test;

public class lblTest {
    public static void main(String[] args) {
        leiBuLei leiBuLei=new leiBuLei();
        int i=11;
        leiBuLei.new mx(){
            @Override
            void print() {

                int i=10;
                System.out.println(this.i);
            }
        };
    }
}
