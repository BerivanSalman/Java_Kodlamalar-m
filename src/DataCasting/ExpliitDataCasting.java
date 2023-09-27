package DataCasting;

public class ExpliitDataCasting {
    public static void main(String[] args) {
        // kovada az su varsa tamam sığar ama cok su varsa doldur bosalt yapar sıfırlar.
        // 35 i 12 liğe koydugumuzda iki kere doldur bosalr yapar 11
        // kalır geriye.
        // zorlamayla yaparız.
        int a  = 12;
        int b = 567;
// Kucugu buyuge atarken data kaybı yasayabiliriz
        //bunları byte cevirirken;
        byte c = (byte) a; // 12 doner
        byte d = (byte) b; // sıgmadıgı icin doldur bosalt yapar ve  data kaybı yaşayıp 55 doner

        int sayi = 130;
        byte sayi2 = (byte)sayi;
        System.out.println("130'un byte olarak karsılıgı: "+ sayi2);
        //130'un byte olarak karsılıgı: -126 (127 den sonra geriye gider ve -128,-127 vs diye devam eder)
        // her 256 da sıfırlanır. O yüzden 567 sayısı da 55 doner

    }
}
