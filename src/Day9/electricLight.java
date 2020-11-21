package Day9;

public class electricLight extends electric{
    @Override
    void turnOff(String x) {
        System.out.println("张三关闭了电灯");
    }

    @Override
    void turnOn(String x) {
        System.out.println("张三开启了电灯");
    }
}
