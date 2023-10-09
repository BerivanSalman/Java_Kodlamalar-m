package Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class GirisRunner {
    //Runner classını calıstırmak icin main methodu kullanmamız lazım
    public static void main(String[] args) {
        /*
            Constructor bir class'dan obje olusturmak istedigimizde
            o objeye olusturuldugu class'daki variable ve methodlarla ilgili
            ilk atamayi(initialize) yapan yapidir. Null atar
         */
        //Burda run yapacağımız icin diger sınıfın ismini yazıp yanında da objenin adını yazarız
        Giris obj = new Giris(); //Bir class dan obje olusturdugumuzda o objeyi kullanarak o classdaki herseye ulasabiliyoruz
        System.out.println(obj.sayi); // 6 //sayi ya ulastık diger classda tanımlanan
        // bana rastgele bir sayi lazim
        obj.rastgeleSayiUret(); //methoda ulastık diger classdan tanımlanan
        // Bugunku sansli sayi : 798
        // bugun ne yemek pisirsem ?
        obj.bugunNePisireyim();
        Scanner scanner = new Scanner(System.in); // new keyword u ile obje olustururz
        String str = new String("Java Candir"); //String de bir classdır
        List<Integer> sayilar = new ArrayList<>(); //new keyword u ile obje olustururz
               Giris             obj2          =                    new                  Giris()         ;
        // Class adi     obje adi   atama isareti   keyword     Constructor(Giris classından obje olusturup getiren constructer)
    }
}
