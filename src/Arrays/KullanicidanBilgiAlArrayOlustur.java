package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class KullanicidanBilgiAlArrayOlustur {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip
        //         array’i olusturan ve bize donduren bir method olusturun.
        String[] kullanicidanAlinanArray = stringArrayOlustur(); //dondurulen degeri kaydetmek istedigimiz icin boyle yaparız
        System.out.println(Arrays.toString(kullanicidanAlinanArray));
    }
    public static String[] stringArrayOlustur(){ // String bir array olusturmasını istedik ve
        // stringArrayOlustur diye isim verik
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array'in uzunlugunu giriniz");
        int arrLength = scanner.nextInt(); // kullanicidan arrayin uzunlugunu aldik
        String[] kullaniciArrayi = new String[arrLength]; //uzunlugu kullanicidan aldıgım arr.length kadar olacak
        // orn kullanici 5 girerse [null, null, null, null, null]
        scanner = new Scanner(System.in); // hata verdigi icin bunu boyle kullandık
        for (int i = 0; i < kullaniciArrayi.length ; i++) { // kullanicidan verilen length kadar deger almalıyım
            System.out.println("Array'e eklemek icin bir isim soyleyin");
            kullaniciArrayi[i] = scanner.nextLine();
            //0. indexten baslayarak kullanıcının girdigi length e kadar teker teker indexlere atama yapacak
        }
        return kullaniciArrayi; // bize dondursun dedigi icin return deriz
    }
}
