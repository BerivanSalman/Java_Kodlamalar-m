package Iterator_Collections;

import java.util.*;

public class LinkedListt {
    public static void main(String[] args) {

        /*
            LinkedList birden fazla Interface'i implement ettigi icin
            implement ettigi Interface'ler data turu olarak secilebilir
            ve hangi Interface'i data turu secersek
            LinkedList o data turunun sahip oldugu ozellikleri tasir

            Eger data turu ve constructor LinkedList secilirse
            implement ettigi List, Queue ve Deque interface'lerindeki
            tum ozellikleri tasiyacaktir. En fazla ozellik LinkedList secildigi zaman kullanılır
         */

        LinkedList<String> ll1 = new LinkedList<>();

        List<Integer> ll2 = new LinkedList<>();

        Queue<String> ll3 = new LinkedList<>();

        Deque<String> ll4 = new LinkedList<>();
        //LinkedList'in kendisinden olusturdugumuzda ; List, Queue, ve deque nin tüm methodlarını implement etmek zorundadır.
        //Deque diye bir class yok onu olustururken mecburen LinkedList kullanmamız gerekli


        // Eger data turu olarak List<> secilirse
        // bizim simdiye kadar kullandigimiz ArrayList<> ile ayni ozelliklere sahip olur

        ll2.add(4);
        ll2.add(5);
        ll2.add(8);

        System.out.println(ll2); // [4, 5, 8]

        ll2.add(1,9);
        System.out.println(ll2); // [4, 9, 5, 8] list te boyle araya koyabiliyorduk

        System.out.println(ll2.get(2)); // 5 / 2. indexteki elemanı getirdi

        System.out.println(ll2.remove(1)); // 9 delil olarak 9 u getirir

        System.out.println(ll2); // [4, 5, 8]

        Integer silinecekSayi = 8 ; //8 i direkt yazarsak index olarak kabul eder, direkt 8 sayısını sildirmek istiyorsak variable olusturmak gerekli

        System.out.println(ll2.remove(silinecekSayi)); // true

        silinecekSayi = 12;
        System.out.println(ll2.remove(silinecekSayi)); // false

        System.out.println(ll2); // [4, 5]

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(9);
        list.add(10);

        System.out.println(list); // [4, 6, 9, 10]

        System.out.println(list.retainAll(ll2)); // true retainall kesisim dısındakileri siler

        System.out.println("ll2 : " + ll2); // ll2 : [4, 5]
        System.out.println("list : " + list); // list : [4]

        /*
            list'den ll2'da olmayan elemanlari siler
            eger herhangi bir elemani silerse true
            hic bir elemani silemezse false doner
         */

        list.add(6);
        list.add(9);
        list.add(10);


        System.out.println(list.removeAll(ll2)); // true removeall kesişimleri siler
        System.out.println("ll2 : " + ll2); // ll2 : [4, 5]
        System.out.println("list : " + list); // list : [6, 9, 10]

        // retainAll() ortak elemanlar disindakileri siler
        // removeAll() ise ortak elemanlari siler

    }
}
