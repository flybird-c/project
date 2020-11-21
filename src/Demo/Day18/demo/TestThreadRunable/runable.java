package Demo.Day18.demo.TestThreadRunable;

//program--Runnable
public class runable {
    public static void main(String[] args) {
//        Object o = new Object();
        // TODO Auto-generated method stub
        MyThread2 mt=new MyThread2();
        new Thread(mt).start();
        new Thread(mt).start();


    }
    static class MyThread2 implements Runnable{


//        public MyThread2(Object o) {
//            this.o = o;
//        }

        private int ticket = 100;
        @Override
        public void run(){
//            synchronized (this){
                while(ticket >0){

                    try {
                        notify();
                        System.out.println("Runnable "+Thread.currentThread().getName()+" = " + ticket--);
                        if (ticket<0){
                            break;
                        }
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
//            }
        }
    }
}
