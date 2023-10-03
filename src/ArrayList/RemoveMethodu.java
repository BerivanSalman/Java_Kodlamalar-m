package ArrayList;
import java.util.ArrayList;
import java.util.List;
public class RemoveMethodu {
    public static void main(String[] args) {
        List<String> isimler = new ArrayList<>();
        isimler.add("Deniz");
        isimler.add("Omer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Basak");
        //remove(silinecekObje) calıstırılınca silinecekObje varsa siler ve bize true doner
        //yoksa silemez ve bize false doner
        System.out.println(isimler);//[Deniz, Omer, Esra, Hamza, Basak]
        System.out.println(isimler.remove("Esra"));//true, gittim sildim geldim demek istiyor
        System.out.println(isimler);//[Deniz, Omer, Hamza, Basak]
        System.out.println(isimler.remove("Ercan")); //false, ercan yok silemedim diyor
        System.out.println(isimler);//[Deniz, Omer, Hamza, Basak]
        //İndex numarası belirtip silmek istersek;
        System.out.println(isimler.remove(1)); //1. indexteki Omeri siler ve sildigine dair delil olarak Omer dondurur
        System.out.println(isimler);//[Deniz, Hamza, Basak]
        isimler.add("Ibrahim");
        isimler.add("Ercan");
        isimler.add("Azim");
        System.out.println(isimler);//[Deniz, Hamza, Basak, Ibrahim, Ercan, Azim]
        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("Basak");
        silinecekler.add("Deniz");
        silinecekler.add("Azim");
        System.out.println(silinecekler);//[Basak, Deniz, Azim]
        //silmek istediğimiz isimlerinden bir liste olusturduk
        System.out.println(isimler.removeAll(silinecekler)); // true doner sildim demek ister
        System.out.println(isimler); //[Hamza, Ibrahim, Ercan] isimler listesinin icindeki elemanları sildikten sonraki hali
        //Bir tane daha silinecekler listesi olusturalım;
        List<String> silinecekler2=new ArrayList<>();
        silinecekler2.add("Ercan");
        silinecekler2.add("Gulnur");
        System.out.println(silinecekler2);//[Ercan, Gulnur]
        System.out.println(isimler.removeAll(silinecekler2));// Gulnur yok onu silemez ama
        // ercanı bari sildiği icin true doner. Bulduklarımı sildim diyor




    }

}
