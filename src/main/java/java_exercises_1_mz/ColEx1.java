package java_exercises_1_mz;

//1. Utwórz 10 elementową tablicę przechowującą liczby całkowite (int)
//        a. Dodaj 10 kolejnych liczb do tablicy rozpoczynając od liczby 1
//        b. Wyświetl długość tablicy
//        c. Wyświetl kolejno elementy tablicy wykorzystując pętlę for.
//        d. Wykorzystując pętlę for pomnóż przez 2 kolejno każdy element w tablicy i
//        zapisz go ponownie w tablicy.
//        e. Wyświetl kolejno elementy tablicy wykorzystując pętlę for.

public class ColEx1 {

    public static void main(String[] args) {
        printTable(tenElementsArray());
        System.out.println();
        System.out.println("Dlugosc tablicy: " + tenElementsArray().length);
        multiplyArray2Times(tenElementsArray());
    }

    public static int[] tenElementsArray() {
        int[] newArray1 = new int[10];
        for (int i = 0; i < newArray1.length; i++) {
            newArray1[i] = i + 1;
        }
        return newArray1;
    }

    public static void printTable(int[] array) {
        for (int value : array) {
            System.out.print("[" + value + "]");
        }
    }

    public static void multiplyArray2Times(int[] array) {
        for (int value : array) {
            System.out.print("[" + value * 2 + "]");
        }
    }

}
