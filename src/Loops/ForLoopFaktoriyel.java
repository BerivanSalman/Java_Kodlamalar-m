package Loops;

import java.util.Scanner;

public class ForLoopFaktoriyel {
    public static void main(String[] args) {
        // Kullanicidan 20 den kucuk sayı al ve faktoriyelini hesapla
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 20 den kucuk bir sayi giriniz: ");
        int sayi = scanner.nextInt();
        int faktoriyel = 1;

        if (sayi <0 || sayi>20)
        {
            System.out.println("Lütfen 0 dan buyuk, 20 den kucuk bir sayi giriniz!!!");
        }
        else {
        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }
        System.out.println("Sayinin faktoriyeli: " + faktoriyel);
    }
}
    }
