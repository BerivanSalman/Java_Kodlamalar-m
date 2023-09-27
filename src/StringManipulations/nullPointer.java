package StringManipulations;

public class nullPointer {
    //SADECE NONPRIMITIVELERLE KULLANILABİLİR
    public static void main(String[] args) {
        // null pointer: bir objenin olusturuldugunu, simdilik deger atanmadıgını, ve deger atanana kadar kullanılmak istendigini
        // javaya soyleme yontemimizdir. Java deger atılmıs olarak kabul etmez kullanmamıza izin verir
        // ve bos olan variable denildiginde onları da gosterir


        String str;
        // System.out.println(str); // yazdırmaz
        // Java'da main method icerisinde deger atamadan bir variable olusturabiliriz
        // ANCAK deger atamadan kullanamayiz
        String str2 = "";
        System.out.println(str2); // hiclik yazdirir
        // str2'yi kullanabilmek icin hiclik degeri atayabiliriz
        // Ancak hiclik degeri atanan variable'lari
        // Java deger atanmamis olarak siniflandirmaz
        // deger atananlar grubuna koyar
        /*
            java deger atanmamis variable'lari isaretlemek icin
            ozel olarak null keyword'unu olusturmustur
            Asagidaki ornekte
            str4'e hiclik degeri atanmistir
            str5'e Tava degeri atanmistir
            str3 ise null olarak ISARETLENMISTIR
            null bir deger degil ISARETCIDIR
            str3'un olusturuldugunu ve bir deger atanana kadar
            bu sekilde kullanilmak istendigini Java'ya soyler
            null olarak isaretlenen bir String'i
            yazdirabilirsiniz
            ancak method'larda kullanamazsiniz
         */
        // String str3 = true; atayamayız
        // String str3 = 45 ; atayamayız
        // String str3 = 'f'; atayamayız
        String str3 = null ; // mavi yazdırır ve null olarak atanan variableleri java yazdırmamıza izin verir
        String str4 = "";
        String str5 = "Tava";
        System.out.println(str3); // null diye yazdırır
        // System.out.println(str3.isBlank()); // NullPointerException
        // System.out.println(str3.substring(0, 1)); // NullPointerException
        // System.out.println(str3.charAt(0)); // NullPointerException
        // System.out.println(str3.isEmpty()); // NullPointerException
        System.out.println(str3 == null); // true
    }
}
