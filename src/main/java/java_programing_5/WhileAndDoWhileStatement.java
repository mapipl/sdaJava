package java_programing_5;

public class WhileAndDoWhileStatement {

    public static void main(String[] args) {

//        System.out.println("---while loop");
        int count = 0;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

//        System.out.println("---for loop");
//        for (count = 0; count != 6; count++) {
//            System.out.println("Count value is " + count);
//        }

        count = 1;
        while (true) {
            if (count == 5) {
                break;
            }
            System.out.println("While loop --> Count value is " + count);
            count++;
        }

        count = 1;
        do{
            System.out.println("Do while loop ---> Count value was " + count);
            count ++;
        } while (count !=6);

    }
}
