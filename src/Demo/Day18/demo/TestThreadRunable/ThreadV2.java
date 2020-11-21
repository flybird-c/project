package Demo.Day18.demo.TestThreadRunable;

public class ThreadV2 extends Thread {

    private int ticket = 20;

    @Override
    public void run(){
        for(int i =0;i<20;i++){
            synchronized (this){
                if(this.ticket>0){
                    try {
                        Thread.sleep(100);
                        System.out.println(Thread.currentThread().getName()+"卖票---->"+(this.ticket--));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] arg){
        ThreadV2 t1 = new ThreadV2();
        new Thread(t1,"线程1").start();
        new Thread(t1,"线程2").start();
    }

}
