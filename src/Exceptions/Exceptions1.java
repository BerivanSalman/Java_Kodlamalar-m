package Exceptions;

import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) {

        // kullanicidan iki tamsayi alin
        // ilk sayiyi ikinciye bolup yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen iki tamsayi giriniz");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
       /*System.out.println(sayi1/sayi2); asağıdaki if i yazmadan bu işlemi yaptırmak
        istediğimizde kullanıcı 5 ve 0 rakamlarını girerse AritmeticException verir. Bu ongürülebilir ve
       asagidaki gibi bir cozum bulunabilir bir hatadır
        */
        /*
        Kullanıcı harf veya ondalıklı  sayı girerse Inputmismatchexception verir.Her sorunu
        if-else ile cozemeyiz
         */

        if (sayi2 != 0){
            System.out.println("Sayilarin bolumu : " + sayi1/sayi2);
        }else {
            System.out.println("ikinci sayi 0 olamaz");
        }
    }
}
