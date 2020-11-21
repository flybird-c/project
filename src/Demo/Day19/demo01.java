package Demo.Day19;

public class demo01 {
    private  Object demo;

    public static void main(String[] args) {
        demo01 demo=new demo01();
        Thread t1=new Thread(()->{
            synchronized (demo){
                for (int i=0;i<10;i++){
                    demo.notify();
                    System.out.println("A");
                    try {
                        demo.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                synchronized (demo){
                    for (int i=0;i<10;i++){
                        demo.notify();
                        System.out.println("C");
                        try {
                            demo.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            
        });
        t1.start();
    }
}
