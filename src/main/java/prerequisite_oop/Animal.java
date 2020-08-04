package prerequisite_oop;

public abstract class Animal {

    int age;
    String gender;
    int weightInLbs;

    public Animal(int age, String gender, int weightInLbs) {
        this.age = age;
        this.gender = gender;
        this.weightInLbs = weightInLbs;
    }

    public void eat() {
        System.out.println("Animal ---> Eating...");
    }

    public void sleep() {
        System.out.println("Animal ---> Sleeping...");
    }

    public abstract void move();

}
