package Demo.day10.car;

public class Tractor extends car implements run{
    Tractor(){
        super.setCarName("拖拉机");
    }
    @Override
    public void run() {
        System.out.println(this.getCarName()+"在跑");
    }
}
