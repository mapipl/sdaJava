package java_exercises_1_sda;

//Załóżmy, że nie wiesz, że istnieje operator %, a potrzebujesz wylicz resztę z dzielenia
//        dwóch liczb. Napisz własną wersję funkcji modulo.

public class Ex9 {
    public static void main(String[] args) {
        System.out.println("My modulo function returns: " + myModuloFunction(13, 5));
    }

    public static int myModuloFunction(int dividend, int divisor) {
        System.out.println("divident: " + dividend + " divisor: " + divisor);
        int total = (int) dividend / divisor;
        System.out.println("Total: " + total);
        return dividend - (total * divisor);
    }

}
