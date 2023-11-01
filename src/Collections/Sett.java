package Collections;

import java.util.HashSet;
import java.util.Set;

public class Sett {
    public static void main(String[] args) {

        Set<String> harfler = new HashSet<>();

        System.out.println(harfler.hashCode()); // 0

        harfler.add("B");
        harfler.add("Ali");

        System.out.println(harfler.hashCode()); // 65984
        /*
        Her hash algoritmasi, girdileri farkli sonuclara donusturebilir. Ancak
        bir hash mekanizmasindan beklenen ayni girdi icin hep ayni sonucu uretmesidir.
       Universitelerdeki numara algoritmasi hashCode’a iyi bir ornek olabilir.
       Java’da kullanilan hash mekanizmasi da girilen tum obje’ler icin belirlenen yapida bir
       hashCode uretir. Bu hashCode o objenin memory’de depolanmasi ve ihtiyac oldugunda ona ulasilmasini kolaylastirir.
         */



    }
}
