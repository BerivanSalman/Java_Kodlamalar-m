package StringManipulations;

import java.util.Scanner;

public class ReplaceAllQuestion2 {
    public static void main(String[] args) {
        // Kullanicidan isim soyisim ve kart numarasini alip
        // asagidaki sekilde yazdirin
        // Isim soyisim  : S***** G****
        // Kart No : 1234 **** **** ****
        Scanner scanner = new Scanner(System.in);
        System.out.println("Isminizi giriniz");
        String isim = scanner.next();
        System.out.println("Soyisminizi giriniz");
        String soyisim = scanner.next();
        System.out.println("Kart numaranizi giriniz");
        String kartNo = scanner.next();
        String yildizliIsim = isim.substring(0,1).toUpperCase() +
                isim.substring(1).replaceAll("\\w","*");
        String yildizliSoyisim = soyisim.substring(0,1).toUpperCase()+ // (0,1) baslangıc dahil son dahil degil
                soyisim.substring(1).replaceAll("\\w","*");//1. indexten itibaren kalanı yıldız yap
        String yildizliKartNo = kartNo.substring(0,4)+ " **** **** ****";
        System.out.println("Isim soyisim : " + yildizliIsim + " " + yildizliSoyisim);
        System.out.println("Kart No : " + yildizliKartNo);

    }
}
