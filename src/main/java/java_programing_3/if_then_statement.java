package java_programing_3;

public class if_then_statement {

    public static void main(String[] args) {

        double first = 20.00d;
        double second = 80.00d;

        double result = (first + second) * 100.00d;
        System.out.println("Result: " + result);

        double reminder = result % 40.00d;

        System.out.println("Reminder: " + reminder);

        boolean isNoReminder = (reminder == 0) ? true : false;

        System.out.println("Is Not Reminder: " + isNoReminder);

        if (!isNoReminder) {
            System.out.println("Got some reminder");
        }

    }

}
