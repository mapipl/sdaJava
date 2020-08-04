package java_exercises_1_sda;

//Właśnie się dowiedziałeś, że istnieje operator %. Napisz funkcję, która będzie sprawdzała,
//        czy napisana w poprzednim zadaniu funkcja zwraca dokładnie takie same wyniki jak ten
//        operator. Przetestuj dla różnych przypadków.

public class Ex10 {

    public static void main(String[] args) {
        myModuloFunctionTest(13, 5);
    }

    public static void myModuloFunctionTest(int dividend, int divisor) {
        System.out.println("dividend: " + dividend + " divisor: " + divisor);
        System.out.println("Wynik modulo wbudowanego: " + dividend % divisor);
        System.out.println("Wynik mojego modulo: " + myModuloFunction(dividend, divisor));
    }

    public static int myModuloFunction(int dividend, int divisor) {
        int total = (int) dividend / divisor;
        return dividend - (total * divisor);
    }

}
