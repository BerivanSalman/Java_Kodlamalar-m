package Loops;

import java.util.Scanner;

public class AsalMıBulma {
    public static void main(String[] args) {
        //Kullanicidan pozitif bir tamsayi alin, sayinin asal olup olmadigini yazdırın
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayi giriniz: ");
        int sayi = scanner.nextInt();
        for (int i = 2; i <sayi-1 ; i++) {
            if (sayi%i == 0)
            {
                System.out.println("Sayi asal değildir.");
                break;
            }
            else {
                System.out.println("Sayi asaldir");
                break;
            }
        }
    }
}
