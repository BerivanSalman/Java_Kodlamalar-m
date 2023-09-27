package WhileLoop;

import java.util.Scanner;

public class HowToUseWhileLoop {
    public static void main(String[] args) {
        // Kullanicidan toplanmak uzere sayilar isteyin
        // Kullanici 0'a basincaya kadar islemi tekrar ettirin
        // Kullanici 0'a bastiginda girilen sayilarin toplamini yazdirin
        // Dongunun kac kere calisacagi belli olmayan islemlerde while loop tercih edilir. Ama for da bi sınırlama var
        Scanner scanner = new Scanner(System.in);
        /*
            Kullanicidan alacagimiz sayi 0 olmadigi surece kod calisacak
            loop'dan once bu sayiyi olusturmamiz gerekir ki
            while() icinde kullanabilelim
            NOT : ilk deger atamasi yaparken
                  loop'un ilk calismasini engellemeyecek bir deger atamaya
                  DIKKAT EDILMELIDIR
         */
        // while ın ustunde sayi degerini olusturmamız gerekiyor ki while icinde kullanabilelim
        // 0 haricinde sıradan istedigimiz bir sayiyi yazabiliriz. Mesela 44 yazıcam
        //
        double sayi = 44;
        double toplam = 0;
        while(sayi != 0 ){ // kullanici 0'a basincaya kadar decam edecek
            System.out.println("Toplanmak uzere sayilar giriniz \nBitirmek icin 0'a basiniz");
            sayi = scanner.nextDouble();
            toplam += sayi;
        } // sayi 0 a esit olmadıgı sürece bu dongu devan etsin 0 a esit olursa da sayı aşagıdaki sout calıssın
        System.out.println("Girilen sayilarin toplami : " + toplam);
    }
}
