package ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class Indexof {
    public static void main(String[] args) {
        List<String> isimler = new ArrayList<>();
        isimler.add("Deniz");
        isimler.add("Omer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Basak");
        isimler.add("Esra");
        System.out.println(isimler);//[Deniz, Omer, Esra, Hamza, Basak, Esra]
        System.out.println(isimler.indexOf("Esra"));//2 (bastan aramaya baslayarak ilk buldugu Esrayı getirir.)
        System.out.println(isimler.indexOf("İbrahim")); //-1
        System.out.println(isimler.lastIndexOf("Gulsum")); //-1


    }
}
