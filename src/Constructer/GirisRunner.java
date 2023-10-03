package Constructer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class GirisRunner {
    public static void main(String[] args) {
        /*
            Constructor bir class'dan obje olusturmak istedigimizde
            o objeye olusturuldugu class'daki variable ve methodlarla ilgili
            ilk atamayi(initialize) yapan yapidir
         */
        Giris obj = new Giris();
        System.out.println(obj.sayi); // 6
        // bana rastgele bir sayi lazim
        obj.rastgeleSayiUret();
        // Bugunku sansli sayi : 798
        // bugun ne yemek pisirsem ?
        obj.bugunNePisireyim();
        Scanner scanner = new Scanner(System.in);
        String str = new String("Java Candir");
        List<Integer> sayilar = new ArrayList<>();
               Giris             obj2          =                    new                  Giris()         ;
        // Class adi     obje adi   atama isareti   keyword     Constructor(Giris classından obje olusturup getiren constructer)
    /*Constructer bir class'dan obje olusturmak istedigimizde
        o objeye olusturuldugu classdaki variable ve
        methodlarla ilgili ilk atamayı yapan yapıdır
     */
    }
}
