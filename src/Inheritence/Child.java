package Inheritence;

public class Child extends Parent {
    public static void main(String[] args) {

        Child child1 = new Child();
        // child1.araba private oldugu icin parentin cocugu da olsa ulasamaz
       // System.out.println(child1.kasa); kasa zaten static obje uzerinden ulasmana gerek yok
        System.out.println(kasa);

        kasa = "75" ; //yeni atama da yapabiliyoruz
        System.out.println(kasa); // 75
        child1.sayi = 34; //default
        /*default normalde inheritance icin uygun degildir
         ama bu class ayni package'da oldugu icin kullanilabilir
         Parent baska package'da olursa,child class
         parent class'daki default access modifier'a sahip
        class uyelerine ulasamaz
         */

        System.out.println(child1.adres); // Cankaya


    }
}
