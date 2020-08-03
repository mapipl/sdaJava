package java_exercises_1_sda;

//Napisz funkcję tworzącą ciąg arytmetyczny o podanych: długości, pierwszym elemencie,
//        różnicy ciągu

public class Ex7 {

//    Napisz funkcję tworzącą ciąg arytmetyczny o podanych: długości, pierwszym elemencie,
//    różnicy ciągu

    public static void main(String[] args) {
        printTable(arraySeries(10, 0, 3));
    }

    public static int[] arraySeries(int lenght, int firstNumber, int gap) {
        int array[] = new int[lenght];
        array[0] = firstNumber;
        for (int i = 0; i < lenght - 1; i++) {
            array[i + 1] = array[i] + gap;
        }
        return array;
    }

    public static void printTable(int[] array) {
        for (int value : array) {
            System.out.print("[" + value + "] ");
        }
    }

}
