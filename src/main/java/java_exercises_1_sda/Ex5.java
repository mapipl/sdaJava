package java_exercises_1_sda;

//Dla zadanej tablicy intów wyświetl najmniejszą oraz największą liczbę z tablicy

public class Ex5 {

    public static void main(String[] args) {
        int[] array = {-99, -50, 0, 50, 99};
        displayMinAndMaxFromArray(array);
    }

    public static void displayMinAndMaxFromArray(int[] numbers) {
        if (numbers.length > 0) {
            int min = 0;
            int max = 0;
            for (int value : numbers) {
                if (value > max) {
                    max = value;
                }
                if (value < min) {
                    min = value;
                }
            }
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
        }
    }

}
