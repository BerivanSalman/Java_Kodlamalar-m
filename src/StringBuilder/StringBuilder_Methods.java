package StringBuilder;

public class StringBuilder_Methods {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java Candir");
        sb1.reverse();
        System.out.println(sb1); // ridnaC avaJ // kalıcı ceviri yapıyor
        sb1.reverse();
        System.out.println(sb1); // Java Candir
        StringBuilder sb2 = new StringBuilder("Java Candir");
        System.out.println(sb1.equals(sb2)); // false doner. Metinler esit olmasına rağmen false dondu
         /*
            StringBuilder'larin esitligini anlamak icin equals() kullanilmaz
            Eger iki StringBuilder'in ayni oldugunu kontrol etmek istersek
            sb1.compareTo(sb2) yazariz,
            sonuc olarak bize 0 dondururse iki SB aynidir
            ayni degilse bastan kontrol ederek ilerler
            ve buldugu ilk farkli harflerin arasinda (ascii table) kac sayi oldugunu dondurur
         */
        /*
         System.out.println(sb1); // Java Candir
        StringBuilder sb2 = new StringBuilder("Java Candir");
        StringBuilder sb3 = new StringBuilder("Java Guzeldir");
        StringBuilder sb4 = new StringBuilder("Hava Guzel");
        StringBuilder sb5 = new StringBuilder("Ne bu simdi?");

        System.out.println(sb1.compareTo(sb3)); // -4
        //karsılastırmaya baslıyor ikisinde de javalar aynıdır fakat Candır ve Guzeldir bolumleri aynı degil. C D E F G => C harfi G harfinden
         4  geride oldugu icin -4 doner java yazdırınca
        System.out.println(sb1.compareTo(sb4)); // 2
        //Karsılastırmaya baslayınca Java ve Hava aynı degildir. H I J=> J harfi H harfinden 2 ileri oldugu icin yazdırılınca 2 doner
        System.out.println(sb1.compareTo(sb5)); // -4
        System.out.println(sb1.compareTo(sb2)); // 0 // hicbir fark oladıgı icin 0 verir
         */

        /*
            Bir String ve bir StringBuilder karsilastirilabilir mi ?
            Java'da farkli non-primitive datalar == ile  asla karsilastirilamaz
            bir String ile bir StringBuilder'i
            equals() ile karsilastirmaniza java CTE vermez
            AMMA metinler ayni olsa bile false doner. New ile oludturuldugun icin havuzda yoktur
         */
        String str = "Java Candir";
        // System.out.println(str == sb );
        // Operator '==' cannot be applied to 'java.lang.String', 'java.lang.StringBuilder'
        System.out.println(str.equals(sb1)); // false
        sb1.replace(0,4,"Hava");
        System.out.println(sb1); // Hava Candir
    }
}
