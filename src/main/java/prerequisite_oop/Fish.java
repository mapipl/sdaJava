package prerequisite_oop;

public class Fish extends Animal {

    public Fish(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    //    abstract method implemented
    @Override
    public void move() {
        System.out.println("fish is swimming...");
    }

    public void swim() {
        System.out.println("Fish ---> Swimming...");
    }

}
