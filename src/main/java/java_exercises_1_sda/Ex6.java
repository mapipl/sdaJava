package java_exercises_1_sda;

//Dla zadanej tablicy intów policz ile jest w niej liczb ujemnych. Jeśli takie występują
//        utwórz nową tablicę, do której przepisze tylko te ujemne liczby

public class Ex6 {

    public static void main(String[] args) {
        int[] numbers = {-99, -50, -1, 0, 1, 50, 99};
        tablePrint(numbers);
        System.out.println();
//        System.out.println(getNegatives(numbers));
        tablePrint(storeNegativesInNewArray(numbers));
    }


    public static void tablePrint(int[] array) {
        for (int value : array) {
            System.out.print("[" + value + "]");
        }
    }

    public static int getNegatives(int[] array) {
        int negativesCounter = 0;
        for (int values : array) {
            if (values < 0) {
                negativesCounter++;
            }
        }
        return negativesCounter;
    }

    public static int[] storeNegativesInNewArray(int[] array) {
        int size = getNegatives(array);
        int[] negativeArray = new int[size];
        int iterator = 0;
        for (int value : array) {
            if (value < 0) {
                negativeArray[iterator] = value;
                iterator++;
            }
        }
        return negativeArray;
    }

}
