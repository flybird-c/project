package Day9;

public class electricRefrigerator extends electric{
    @Override
    void turnOff(String x) {
        System.out.println("张三关闭了电冰箱");
    }

    @Override
    void turnOn(String x) {
        System.out.println("张三开启了电冰箱");
    }
}
