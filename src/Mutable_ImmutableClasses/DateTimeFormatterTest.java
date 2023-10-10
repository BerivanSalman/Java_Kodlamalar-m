package Mutable_ImmutableClasses;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest {
    public static void main(String[] args) {
        //Date Time Formatter ile tarih ve saati istediğimiz formatta yazdırabilirz
        LocalDateTime ldt = LocalDateTime.now();
        // 03 Oct 2023 Tue
        DateTimeFormatter istenenFormat = DateTimeFormatter.ofPattern("dd MMM yyyy  EEE");
        System.out.println(ldt.format(istenenFormat)); // 03 Oct 2023  Tue
        //Saati 09:55 AM şeklinde yazdiralim
        DateTimeFormatter istenilenSaatFormati1= DateTimeFormatter.ofPattern("hh:m a");
        System.out.println(ldt.format(istenilenSaatFormati1));//06:34 PM
        //saati  9.55 24 saate gore yapın
        DateTimeFormatter istenilenSaatFormati2 = DateTimeFormatter.ofPattern("H:mm");
        System.out.println(ldt.format(istenilenSaatFormati2));//18:39
         /*
         format olustururken
         GUN
         d : basta 0 varsa onu yazmadan gun numarasi
         dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
         DDD : yilin kacinci gunu oldugunu yazar
         E, EE, EEE : gun isminin ilk 3 harfi
         EEEE : gun isminin tamamini
         AY (Ay icin M, dakika icin m kullanilir)
         M : basta 0 varsa onu yazmadan ay numarasi
         MM:dd: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
         MMM : Ay isminin ilk 3 harfi
         MMMM : Ay isminin tamami
         YY : yilin son iki rakamini
         YYYY : Yilin tamamini
         Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)
         HH : saatin tamami, tek rakamli saat olursa 02 gibi
         H  : tek rakamli saat olursa sadece saati
         a yazarsak AM veya PM degerini yazar
         */

    }
}
