package java_exercises_1_sda;

//Sprawdź, czy podany ciąg liczb jest ciągiem arytmetycznym

public class Ex8 {

    public static void main(String[] args) {
        int[] arrayAritmeticTrue = {1, 3, 5, 7, 9};
        int[] arrayAritmeticFalse = {1, 2, 5, 8, 9};
        printTable(arrayAritmeticTrue);
        System.out.println();
        printTable(arrayAritmeticFalse);
        boolean result1 = isArrayAritmetic(arrayAritmeticTrue);
        boolean result2 = isArrayAritmetic(arrayAritmeticFalse);
        System.out.println();
        System.out.println("Is array aritmetic:" + result1);
        System.out.println("Is array aritmetic:" + result2);
    }

    public static boolean isArrayAritmetic(int[] array) {
        if (array.length < 2) {
            return false;
        }
        boolean isAritmetic = true;
        int patternGap = array[1] - array[0];
        for (int i = 2; i < array.length - 1; i++) {
            int currentGap = array[i] - array[i - 1];
            if (patternGap != currentGap) {
                isAritmetic = false;
            }
        }
        return isAritmetic;
    }

    public static void printTable(int[] array) {
        for (int value : array) {
            System.out.print("[" + value + "]");
        }

    }

}
