package Demo.Day18.demo.TestThreadRunable;

//program--Thread
public class thread {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        new MyThread().start();
        new MyThread().start();

    }


    static class MyThread extends Thread{
        private int ticket = 5;
        @Override
        public void run(){
            while(true){
                System.out.println("Thread ticket = " + ticket--);
                if(ticket < 0){
                    break;
                }
            }
        }
    }
}
