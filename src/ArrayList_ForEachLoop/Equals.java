package ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Equals {
    public static void main(String[] args) {

    List<Integer> sayilar1 = new ArrayList<>();// []
    List<Integer> sayilar2= new ArrayList<>();// []
        System.out.println(sayilar1.equals(sayilar2)); // true
        sayilar1.add(1);
        sayilar2.add(2);
        System.out.println(sayilar1.equals(sayilar2)); // false

        sayilar1.add(0,2); //[2,1]
        sayilar2.add(1); //[2,1]
        System.out.println(sayilar1.equals(sayilar2)); // true

        sayilar1.add(0,3); //[3,2,1]
        sayilar2.add(3) ;// [2,1,3]

         //Sıralama yapabiliriz;
        Collections.sort(sayilar1); // [1,2,3]
        Collections.sort(sayilar2);// [1,2,3]
        System.out.println(sayilar1.equals(sayilar2)); // true


    }
}
