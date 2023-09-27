package MethodOverloading;

public class Lesson3 {
    public static void main(String[] args) {
         /*
            Bir Method Call yapildiginda
            Java hangi method'un calisacagina karar vermek icin
            asagidakileri kontrolleri yapar
            1- isim
            2- argument sayisi ile parametre sayisi
            3- argument olarak yazilan DEGERler ile PARAMETRElerin data turunun uyumlu olmasi
            4- eger argument ve parametreler %100 uyumlu olmazsa
               minumun sayida casting ile calistirabilecegi method'u tercih eder
         */
        toplama(7,9); //int int degerlerdir
        // asagidaki metodlarda int int degerler olmamasına ragmen java sorun cıkarmaz.
        // java isin oluruna ve ekonomisine bakar.  İlk metodu kullansa bi tane casting yapacak ama ikinci
        // metodu kullansa iki tane casting yapacak. O yüzden ilkini secer.

    }
    public static void toplama(int a , double b){ // toplama int double
        System.out.println("int ve double 2 sayinin toplami : " + (a+b));
    }
    public static void toplama(double a , double b){ // toplama double double
        System.out.println("double ve double 2 sayinin toplami : " + (a+b));
    }
}
