package java_programing_5;

public class Sum3And5 {
    public static void main(String[] args) {

        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println("Found number = " + i);
            }
            if (count == 5) {
                System.out.println("Found 5 occurances and exiting...");
                break;
            }
        }
        System.out.println("Sum = " + sum);
    }
}
