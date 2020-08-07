package java_exercises_1_mz;

//Utwórz listę ArrayList przechowującą liczby zmiennoprzecinkowe. Dodaj ręcznie 10
//        liczb do listy.
//        a. Wyświetl sumę pierwszego i ostatniego elementu zapisanego w liście..
//        b. Wyświetl iloczyn pierwszego i ostatniego elementu zapisanego w liście.
//        c. Wyświetl iloraz drugiego i przedostatniego elementu zapisanego w liście.

import java.util.ArrayList;
import java.util.List;

public class ColEx3 {

    public static void main(String[] args) {
        System.out.println("Rozmiar listy: " + listOfDoubles().size());
        System.out.println("Suma pierwszej i ostatniej wynosi: " + sumOfFirstAndLast(listOfDoubles()));
        System.out.println("Iloraz drugiego i przedostatniego wynosi " + divisionOfSecondAndSecondToLast(listOfDoubles()));
    }

    public static List<Double> listOfDoubles() {
        List<Double> myArray1 = new ArrayList<>();
        myArray1.add(1.1);
        myArray1.add(2.2);
        myArray1.add(3.3);
        myArray1.add(4.4);
        myArray1.add(5.5);
        myArray1.add(6.6);
        myArray1.add(7.7);
        myArray1.add(8.8);
        myArray1.add(9.9);
        myArray1.add(10.0);
        return myArray1;
    }

    public static double sumOfFirstAndLast(List<Double> arrayList1) {
        double result = arrayList1.get(0) + arrayList1.get(arrayList1.size() - 1);
        return result;
    }

    public static double divisionOfSecondAndSecondToLast(List<Double> arrayList1) {
        double result = arrayList1.get(1) / arrayList1.get(arrayList1.size() - 2);
        return result;
    }

}
