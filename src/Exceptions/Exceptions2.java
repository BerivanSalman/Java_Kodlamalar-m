package Exceptions;

import java.util.Scanner;

public class Exceptions2 {
    public static void main(String[] args) {
        // kullanicidan iki tamsayi alin
        // ilk sayiyi ikinciye bolup yazdirin
        /*
        Bir kod yazarken
            olasi risk durumlarini analiz etmek
            ve bu riskler gerceklesirse ne yapacagini Java'ya soylemek
            iyi bir kod yazarinin gorevidir

            Java'da ongorulen bir hatayi
            exception olusmadan cozmek icin (handle etmek)
            try-catch/finally bloklari kullanilir

            1- hatanin olusabilecegi satirlari bir try blog'unun icine alin
            2- olasi exception'i catch (olasiExceptionAdi exceptioniKaydedecegimizObje)
               seklinde yaz
            3- exception olusmasi durumunda calismasini istedigimiz kodu
               catch() { catch blogu} na yaz

             Eger birden fazla olasi exception varsa
             1- ic ice try-catch bloklari olusturabiliriz
             2- bir try birden fazla catch yazabiliriz
             3- Eger tum olasi exception'lari kapsayan bir exception varsa
                tek catch ile genis kapsamli exception yazilabilir
                bu durumda hatayi spesifik olarak bilemeyecegimiz icin
                hata mesajini da genel vermeliyiz
         */

        Scanner scanner = new Scanner(System.in);
         /* ic-ice try-catch
        try{ İkinci bir exceptiona cozum icin bir daha try yazıp eğer problem cıkarsa bunu dene
            try{ bunu yap eğer problem cıkarsa,
                System.out.println("Lutfen iki tamsayi giriniz");

                int sayi1 = scanner.nextInt();
                int sayi2 = scanner.nextInt();
                System.out.println("Sayilarin bolumu : " + sayi1/sayi2);

            }catch (ArithmeticException e){
                System.out.println("Ikinci sayi 0 olamaz");
            }e ye kaydet sorunu ve bunu yazdır

        }catch (InputMismatchException f){
            System.out.println("Tamsayi girmelisiniz");
        } f ye kaydet sorunu ve bunu yazdır
         */
         /*
        try {
            System.out.println("Lutfen iki tamsayi giriniz");

            int sayi1 = scanner.nextInt();
            int sayi2 = scanner.nextInt();
            System.out.println("Sayilarin bolumu : " + sayi1/sayi2);
        }catch (ArithmeticException e){
            System.out.println("ikinci sayi 0 olamaz");
        }catch (InputMismatchException f){
            System.out.println("tamsayi girmelisiniz");
        }

         */

        System.out.println("Lutfen iki tamsayi giriniz");

        try {
            int sayi1 = scanner.nextInt();
            int sayi2 = scanner.nextInt();
            //69-70-71. satırları secip yukardaki code dan surround with i secip try/catch i sec
            System.out.println("Sayilarin bolumu : " + sayi1/sayi2);
        } catch (Exception e) {
            System.out.println("yanlis giris yaptiniz");
            //exeptionun avantajı hata mesayı verilir ve kod calısmaya devam eder. Bir sorun olustu fakat sorunun ustesinden gelindi
            //exception handle edildi deriz
            System.out.println(e.toString());
        }

        /*
            catch() icinde yazdigimiz e
            yakalanan exception'in kaydedildigi obje olacaktir

            eger exception ile ilgili daha detayli bilgi almak istersek
            e objesi kullanilarak
            hatanin detayi yazdirilabilir

            ornegin : e.printStackTrace(); asagidaki raporu yazdirir
            java.util.InputMismatchException
            at java.base/java.util.Scanner.throwFor(Scanner.java:939)
            at java.base/java.util.Scanner.next(Scanner.java:1594)
            at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
            at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
            at day28_exceptions.C03_Exceptions.main(C03_Exceptions.java:78)

            e.getMessage() ;  bize null veya / by zero  yazdirdi

            e.toString() ; bize java.lang.ArithmeticException: / by zero yazdirdi

         */

    }
}
