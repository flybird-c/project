package Day9.master;

public class test {
    public static void main(String[] args) {
        Master master=new Master("小红");
        Pet cat=new Cat("小花");
        Pet dog=new Dog("旺财");
        Food fish=new Fish("金枪鱼");
        Food bone=new Bone("酱香骨头");
        master.feed(fish);
        dog.petEat(fish);
        master.feed(bone);
        cat.petEat(bone);
    }
}
