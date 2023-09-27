package Loops;

import java.awt.*;
import java.util.Scanner;

public class RakamlarToplamı {
    public static void main(String[] args) {
        //Kullanicidan pozitif bir tam sayi alip rakamlar toplamini yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayi giriniz: ");
        int sayi = scanner.nextInt();
        int rakamlarToplami = 0;
        int rakam = 0;
        for (int i = sayi; i >0 ; i/= 10) {
            rakam =i %10;
            rakamlarToplami +=rakam;
        }
        System.out.println("Girilen "+ sayi+"'sının rakamlar toplamı: " +rakamlarToplami);
    } // ONEMLİ DETAY : int basamakSayisi = (girilenSayi+"").length();
    //"" bunu eklememizin sebebi int degeri stringlestirmektir.  Neden stringlestiriyoruz? cunku length metodunu kullanmak istiyoruz.
    // Metodlar non primitivelerle kullanılır.
}
