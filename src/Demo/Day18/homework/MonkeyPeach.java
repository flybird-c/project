package Demo.Day18.homework;

public class MonkeyPeach {
    /*
    三个猴子分100个桃子
     */

    volatile int i = 100;
    class money extends Thread {

        Integer x;

        public money(int x) {
            this.x = x;
        }

        @Override
        public void run() {
            while (i > 0) {
                if (i == 1) {


                        System.out.println("猴子" + getName() + "拿走了" + i / 2 + "个桃子");
                        i -= i / 2;

                        System.out.println("剩余" + i + "个桃子");

                } else{
                    System.out.println(getName() + "拿走最后一个桃子");
                    i = i - 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        int x = 1;
        MonkeyPeach monkeyPeach = new MonkeyPeach();
        monkeyPeach.new money(x).start();
        monkeyPeach.new money(x).start();
        monkeyPeach.new money(x).start();
    }
}
