package WhileLoop;

import java.util.Scanner;

public class WhileLoopQuestion2 {
    // kullanicidan toplanmak uzere tam sayilar isteyin
    // toplam 500 oldugunda veya gectiginde islemi durdurup
    // kac sayi girildigini ve toplamlarini yazdirin
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam= 0 ;
        int sayac = 0;
        while (toplam < 500){
            System.out.println("Lutfen toplanmak uzere tam sayilar giriniz: ");
            int sayi = scanner.nextInt();
            toplam += sayi;
            sayac++;
        }
        System.out.println("Sayiların toplamı: " + toplam+ " ve "+ sayac+ " tane sayi girdiniz");
    }
}
