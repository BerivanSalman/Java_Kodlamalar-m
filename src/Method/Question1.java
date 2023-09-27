package Method;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        //bir onceki classs da olusturulan methodu kullanarak
        // kullanicidan uc basamaklı sayip alın ve asal olup olmadıgını yazdırın
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen uc basamaklı bir sayi giriniz: ");
        int sayi = scanner.nextInt();
        if (sayi <100 || sayi>999){
            System.out.println("Sayi 3 basamaklı değil. 3 basamaklı sayi giriniz!!!");
        }
        else {
            AsalSayiBulma.asalMiyazdir(sayi);
    }
}
}
