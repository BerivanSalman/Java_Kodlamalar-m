package Scope;

public class Scope_DefaultValues {

    String str = "Java";
    String str2 ;
    int sayi = 23;
    int sayi2;
    static boolean bl = true;
    static boolean bl2;
    static char chr = 'a';
    static char chr2;
    public static void main(String[] args) {
        String metin;
        // System.out.println(metin);// deger atamadan olusturulabilir ancak kullanamayız
        // System.out.println(str); // method static oldugu icin ve str static olmadıgı icin burada str ı kullanamayız
        // System.out.println(sayi); //method static oldugu icin ve int sayi static olmadıgı icin burada sayiyi ı kullanamayız
        System.out.println(bl); // true // static tanımlandıgı icin kullanabiliriz
        System.out.println(bl2); // false // static oldugu icin kullanabiliriz fakat deger tanımlanmadıgı icin false verir
        System.out.println(chr); // a // static oldugu icin kullanılabilir
        System.out.println(chr2); // hiclik // statictir fakat icinde bi deger olmadıgı icin hiçlik yazdırdı
        // staticOlmayanMethod(); // static method icinde static olmayan bir method direkt cagrılamaz
        // static method'lar icerisinden
        // static olmayan class uyelerine ulasmak istersek
        // obje olusturmamiz gerekir
        Scope_DefaultValues obj = new Scope_DefaultValues();
        obj.staticOlmayanMethod();
    }
    /*
        Local variable'lar deger atamadan olusturulabilir
        ANCAK deger atanmadan KULLANILAMAZ

        class level variable'lar ise
        ister static olsun, ister static olmasin
        deger atamadan olusturulabilir
        VE deger atanmadan da KULLANILABILIR

        Class level variable'lara biz deger ATAMAZSAK
        Java default olarak belirledigi degerleri ATAR

        Default Java Degerleri

        char ==> hiclik
        boolean ==> false
        sayisal primitive'ler ==> 0
        non-primitive'ler ==> null

     */
    public void staticOlmayanMethod(){// secici  olan bir method degil
        System.out.println(str); // Java // yazabilirim
        System.out.println(str2); // null// yazabilirim degeri olmadıgı icin null yazdırır
        System.out.println(sayi); // 23
        System.out.println(sayi2); // 0 // deger olmadıgı icin boyle yazdı
    }
}
