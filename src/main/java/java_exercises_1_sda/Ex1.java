package java_exercises_1_sda;

//Wypisz poniższy kawałek tabliczki mnożenia:
//        5 x 1 = 5
//        5 x 2 = 10
//        5 x 3 = 15
//        5 x 4 = 20
//        Zmodyfikuj powyższe żeby wyświetlało ten kawałek tabliczki dla liczby zadanej w
//        parametrze.

public class Ex1 {

    public static void main(String[] args) {
        printMultiplication(5);
    }

    public static void printMultiplication(int number) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("[" + number + "]" + " x " + "[" + i + "]" + " = " + number * i);
        }
    }

}
