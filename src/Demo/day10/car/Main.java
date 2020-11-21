package Demo.day10.car;

public class Main {//通过抽象类定义车类的模版,定义一个抽象方法run()，然后通过抽象的车类来派生拖拉机(Tractor)、卡车(Truck)、小轿车(Saloon)，并且有各自的run()方法实现。

    public static void main(String[] args) {
        car saloon=new Saloon();
        car tractor=new Tractor();
        car truck=new Truck();
        saloon.run();
        tractor.run();
        truck.run();
    }
}
