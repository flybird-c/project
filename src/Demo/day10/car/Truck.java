package Demo.day10.car;

public class Truck extends car implements run  {

    public Truck() {
        super.setCarName("卡车");
    }

    @Override
    public void run() {
        System.out.println(this.getCarName()+"在跑");
    }
}
