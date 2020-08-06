package java_exercises_1_mz;

//2. Utwórz listę ArrayList przechowującą liczby całkowite.
//        a. Dodaj 3 dowolne liczby, a następnie wyświetl długość tablicy.
//        b. Wyświetl pierwszy element zapisany w liście.
//        c. Wyświetl ostatni element zapisany w liście

import java.util.ArrayList;
import java.util.List;

public class ColEx2 {

    public static void main(String[] args) {
        listOfWholeNumbers();
    }

    public static void listOfWholeNumbers() {
        List<Integer> myArray1 = new ArrayList<>();
        myArray1.add(5);
        myArray1.add(10);
        myArray1.add(15);
        System.out.println("Dlugosc tablicy: " + myArray1.size());
        System.out.println("Pierwszy element tablicy: " + myArray1.get(0));
        System.out.println("Ostatni element tablicy: " + myArray1.get(myArray1.size()-1));
    }

}
