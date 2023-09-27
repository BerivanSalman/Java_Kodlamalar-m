package Scope;

public class Scope_ClassVariables {
    //Static variablelar class a aittir.Herkes icin ortaktır ve degisirse herkes icin degisir
    // // Eger herkes icin ortak olsun istiyorsam static yapmalıyım.
    //Static olmayan (instance) variable objeye aittir. Herkes icin farklıdır. Degisirse sadece o obje etkilenir
    // herkes icin ortak olmasın variable ye gore degissin istersem instance yapmalıyım
    String str = "Java";
    int sayi = 23;
    static boolean bl = true; // static her istedigi yere gider her istedigi yerde calısır.
    static char chr = 'a';
    public static void main(String[] args) {
        // static int a = 23;
        // System.out.println( str);
        // System.out.println(sayi);
        // method static olarak belirtildigi
        // ve static seckin oldugu icin static olmayanları kullanamayız icinde
        System.out.println(bl);
        System.out.println(chr);
    }
    public static void staticMethod(){
        // static String s = "tava";
        // System.out.println( str);
        // System.out.println(sayi);
        // method static olarak belirtildigi
        // ve static seckin oldugu icin static olmayanları kullanamayız icinde
        System.out.println(bl);
        System.out.println(chr);
    }
    public void staticOlmayanMethod(){
        // ama bu method static degil o yüzden class da tanımlanan tum variableleri icine alabilir
        System.out.println( str);
        System.out.println(sayi);
        System.out.println(bl);
        System.out.println(chr);
    }
    /*
        Class level variable'lar class'in icinde ama kod bloklarinin disinda olusturulur
        sonradan class'a bakildiginda ulasilmasi kolay olsun diye class'in basinda olusturulurlar
        Class level'da olusturulan variable'larin scope'u BUTUN CLASS'dir
        AMA class level variable'larda
        erisimi belirleyen SADECE scope degildir
        static KEYWORD de erisimde BELIRLEYICI bir role sahiptir
        static keyword'e sahip olan variable'lar tum class icinden direk kullanilabilir
        static keyword kullanmayan variable'lar
        SADECE static keyword kullanmayan method'larda direk kullanilabilir
     */

}
