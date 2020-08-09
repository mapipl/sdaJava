package java_programing_3;

public class PositiveNegariveZero {

    public static void main(String[] args) {

        checkNUmber(0);
    }

    public static void checkNUmber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }

}
