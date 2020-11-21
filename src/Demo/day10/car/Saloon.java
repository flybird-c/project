package Demo.day10.car;

public class Saloon extends car implements run {
    public Saloon() {
        super.setCarName("小轿车");
    }

    @Override
    public void run() {
        System.out.println(this.getCarName()+"在跑");
    }
}
