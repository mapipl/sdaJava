package java_exercises_1_sda;

//Dla zadanej tablicy 3 intów zamień miejscami pierwszy i trzeci element.
//        Przykład:
//        zadana tablica [12, 7, 19]
//        wynik [19, 7, 12]

public class Ex4 {

    public static void main(String[] args) {
        int[] array = {5, 10, 15};
        printTable(array);
        System.out.print(" ---> ");
        printTable(switchTable(array));
    }

    public static int[] switchTable(int[] tableOf3Ints) {
        if (tableOf3Ints.length > 1) {
            int temp = tableOf3Ints[0];
            tableOf3Ints[0] = tableOf3Ints[tableOf3Ints.length - 1];
            tableOf3Ints[tableOf3Ints.length - 1] = temp;
        }
        return tableOf3Ints;
    }

    public static void printTable(int[] table) {
        for (int value : table) {
            System.out.print("[" + value + "]");
        }
    }

}
