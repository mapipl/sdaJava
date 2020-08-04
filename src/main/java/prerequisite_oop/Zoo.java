package prerequisite_oop;

public class Zoo {

    public static void main(String[] args) {

//        abstract class can NOT be instanciated!!!
//        Animal animal1 = new Animal(12, "M", 23);
//        animal1.eat();

        Bird bird1 = new Bird(3, "F", 10);
//        bird1.fly(); <--- no longer available
        bird1.eat();
        bird1.sleep();

        Chicken chick1 = new Chicken(1, "M", 7);
//        chick1.fly();  <--- no longer available

        Sparrow sparrow1 = new Sparrow(1, "M", 4);
        sparrow1.move();

        Fish fish1 = new Fish(1, "W", 2);
        fish1.move();
    }

}
