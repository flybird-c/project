package Day9.master;

public class Master {
    private String masterName;
    private Pet pet;
    public Master(String masterName) {
        this.masterName=masterName;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
    public void feed(Food food) {
        System.out.println(masterName+"喂食"+pet.getPetName());
        pet.petEat(food);
    }
}
