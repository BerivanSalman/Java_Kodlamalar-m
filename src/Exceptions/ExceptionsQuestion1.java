package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsQuestion1 {
    public static void main(String[] args) {

        // kullanicidan toplanmak uzere sayilar isteyin
        // kullanici islemi bitirmek icin Q'ya basmalidir
        // kullanici Q'ya bastiginda,
        // kac sayi girildigini ve toplamin ne oldugunu yazdirin

        double girilenSayi=0;
        double toplam=0;
        int sayac=0;
        Scanner scanner = new Scanner(System.in);
        boolean devamEdelimMi= true;

        while(devamEdelimMi){

            System.out.println("Toplanmak uzere sayi giriniz\nBitirmek icin Q'ya basiniz");

            try { // giris sorunsuz oldugunda calisacak
                girilenSayi = scanner.nextDouble(); //kullanıcı q ya da kelime girdiğinde onu doubleya atayamadıgı icin orda bi exception olusur
                // ve java 26-27. satırları ignore eder ve  catch e gonderir
                toplam += girilenSayi;
                sayac++;

            } catch (InputMismatchException e) { //kullanici sayi disinda bir deger girerse; yakalanan exception bununla ortustugu icin e ye atar
                String sayiOlmayanDeger = scanner.nextLine(); // Sayıdan farklı bir deger girildiği icin yazılan deger scannerla alınamadı
                // girilen degeri ifle kullanmamız gerekiyor o yüzden  alınsın diye String bir variable olusturduk. String  yanlıs girilen her degeri icine alır ve String variablesine atar.
                // Stringle yazdık cunku girilen her degeri (sayı, harf, kelime) icine alabilir
                if (sayiOlmayanDeger.equalsIgnoreCase("Q")){
                    devamEdelimMi=false;
                }else{//q girmezse de mesela queen girerse;
                    System.out.println("Hatali giris, Sayi girmelisiniz, Bitirmek icin de Q'ya basmalisiniz"); //bunu verir ve devamEdelimMi
                    // false olmadıgı icin soru sormaya devam eder.
                }
            }
        }

        System.out.println("Girilen "+ sayac + " adet sayinin toplami : " + toplam);


    }
}
