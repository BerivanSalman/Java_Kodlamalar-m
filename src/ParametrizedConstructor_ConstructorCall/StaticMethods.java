package ParametrizedConstructor_ConstructorCall;

public class StaticMethods {
     static int sayi = 20;
     int yas = 40;

     public StaticMethods () {
         sayi++;
         yas++;
     }
     public static int method1(){
         return sayi;
     }
     public int method2(){
         return yas;
     }

    public static void main(String[] args) {
        StaticMethods obj1 = new StaticMethods();
        StaticMethods obj2 = new StaticMethods();
        StaticMethods obj3 = new StaticMethods();
        System.out.println(obj3.yas +" "+ obj3.sayi);
    }
    //Main methoduna girip ordan da parametresiz olarak tanımlanan 7. satırdaki constructora girer. Oraya girerken obje olusturup
    //instance olarak tanımlanan degerleri objenin icine koyar. Int static bir variable oldugu icin class da olusturur. Sayı 20 yi
    // ona atar ve obje onu da kullanır ayrıca 40 instancesini objenin icine koyar. Constructorın icinde sayı  sayi++;
    //       yas++; yazar ve 40la 20 sayisini 1 artırırız. 41-21 olurlar. Sonra geldiği yere geri gider ve obj2 icin 7. satırdaki
    //  constructora gider. Yeniden yası objenin icine kopyalar. Int static sayi yı kopyalamasına gerek yok zaten sınıfın icinde var
    // sayı 40 dan 41 olur. Class da sayiyi zaten tuttugu ve daha onceden artırdıgı icin 21 olarak duruyordu ve bu constructorun
    // icinde  yine artırırız ve 22 olur bu boyle devam eder
}
