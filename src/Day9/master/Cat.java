package Day9.master;

public class Cat extends Pet {

    public Cat(String catName) {
        super.petName=catName;
    }

    @Override
    public void petEat(Food food) {
        if (food instanceof Fish){
            System.out.println(this.petName+"喜欢吃");
        }else {
            System.out.println(this.petName+"不喜欢吃");
        }

    }
}
