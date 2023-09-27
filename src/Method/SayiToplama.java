package Method;

import java.util.Scanner;

public class SayiToplama {
    public static void main(String[] args) {
        // Verilen iki sayiyi toplayip,sonucu yazdiran bir method olusturun. Yazdiran dedigi icin void yapcaz
        toplaYazdir(5, 6.4); // *methodu cagırırız burda // Verilen iki sayinin toplami : 11.4
        // java calısmaya baslayınca yukardan inerken bu methodu gorur ve bu methodun olusturuldugu yere gider
        // sayi1 e 5 i koyar ve sayi2 ye 6.4 u koyar ve sout un icindeki islem yapılır
        toplaYazdir(7, 6); //*Methodu istedigimiz kadar cagırabiliriz. Verilen iki sayinin toplami : 13.0
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen toplanmak uzere iki sayi giriniz");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();
        toplaYazdir(sayi1,sayi2); // *methodu kullanicidan deger alarak da kullanabiliriz
    }// main method sonu
    public static void toplaYazdir(double sayi1,double sayi2){
        System.out.println("Verilen iki sayinin toplami : " + (sayi1+sayi2));
        // bu metodu calıstırdıgımızda bi sonuc donmez cunku bu metodu bi yerde cagırmamız lazım.
        // Ustte cagırıyoruz
    }

}
