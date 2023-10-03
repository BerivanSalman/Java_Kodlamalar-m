package Arrays;

import java.util.Arrays;

public class StringSplitArrays {
    public static void main(String[] args) {
        //testerlık icin çok onemlidir
        String str = "About 197.000.000 results (0,43 seconds) ";
        // arama sonuc sayisinin 1 milyondan cok oldugunu test edin. Burdaki 197.000.000 alacağız metinden.
        // replaceall kullanıp digit olmayanları * yapmak istesek 0,43 isimize yaramayacak
        String[] kelimeler = str.split(" "); //str yi split yap, '''' bosluklardan ayır yani
        // ve onu String [] kelimeler dizisine at
        System.out.println(Arrays.toString(kelimeler)); // [About, 197.000.000, results, (0,43, seconds)]
        // Split yaptıktan sonraki sonuc budur. Dizi yaptı bunu. Java spaceleri bulup işaretliyor yok ediyor.
        // 5 tane elemanımız olmus oluyor
        int sonucSayisi= Integer.parseInt(kelimeler[1].replaceAll("\\D",""));
        //1. indexteki sayidaki noktaları yok ederiz replaceall'la ve string bir deger oldugu icin
        // Integar.parseInt ile integara ceviririz ve int olarak sonuc variable ına atarız degeri.
        // String olmaktan cıkınca artık bir milyon sayisindan buyuk olup olmadıgını karsılastırabiliriz
        System.out.println(sonucSayisi); // 197000000
        String[] ayirace = str.split("e"); // e den ayırmak istersek de e leri siler ve asagidaki sonuc doner
        System.out.println(Arrays.toString(ayirace)); // [About 197.000.000 r, sults (0,43 s, conds) ]
        String[] ayiracHiclik = str.split("");// hiçlikten ayırmak istersek
        System.out.println(Arrays.toString(ayiracHiclik)); //a ile b arasında ne var hiiç ordan ayırır hepsini öyle yapar
        // [A, b, o, u, t,  , 1, 9, 7, ., 0, 0, 0, ., 0, 0, 0,  , r, e, s, u, l, t, s,  , (, 0, ,, 4, 3,  , s, e, c, o, n, d, s, ),  ]
        String[] ayiracNokta = str.split(",");
        System.out.println(Arrays.toString(ayiracNokta));
        // [About 197.000.000 results (0, 43 seconds) ]
    }
}
