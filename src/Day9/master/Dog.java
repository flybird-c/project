package Day9.master;

public class Dog extends Pet {
    public Dog(String dogName) {
        super.petName=dogName;
    }

    @Override
    public void petEat(Food food) {
        if (food instanceof Bone) {
            System.out.println(super.petName + "喜欢吃");
        } else {
            System.out.println(super.petName + "不喜欢吃");
        }

    }
}
