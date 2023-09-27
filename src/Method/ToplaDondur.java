package Method;

public class ToplaDondur {
    public static void main(String[] args) {
        // Verilen 3 sayinin toplamini donduren bir method olusturun

        toplaDondur(5,6,7); // bunu calıstırdıgımızda calısır fakat calıstırınca ekranda birsey gorunmez
        // bundan sonra yapilacak sey kodu yazan kisiye baglidir
        // 1- ya return edilen sonucu direk yazdirabilir
        // 2- ya da daha sonra kullanilmak uzere bir variable'a atayabilir
        System.out.println(toplaDondur(2, 3, 4)); // 9.0 // sout dedigi icin sonucu yazdırır

        double toplam = toplaDondur(6,9,1); // 16 dondurecek ve bu deger toplam variable'ina kaydedilecek
        // ekranda gormek icin sout kullanmalıyız.
    }
    public static double toplaDondur(double sayi1, double sayi2, double sayi3){
        double toplam = sayi1+sayi2+sayi3;
        return toplam;
    }
}
