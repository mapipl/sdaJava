package java_programing_5;

public class WhileAndDoWhileStatement2 {

    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int counter = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            counter++;
            if (counter == 5) {
                break;
            }
        }
        System.out.println("Found even number " + counter + " times and exiting...");

    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }

    }


}
