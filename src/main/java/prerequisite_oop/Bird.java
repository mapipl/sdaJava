package prerequisite_oop;

public class Bird extends Animal {

    public Bird(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    //    abstract method implemented
    @Override
    public void move() {
        System.out.println("flapping wings...");
    }

//    Remove fly() from Bird and implement interface
//    public void fly() {
//        System.out.println("Bird ---> Flying...");
//    }

}
