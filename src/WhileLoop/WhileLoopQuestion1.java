package WhileLoop;

import Method.AsalMiDondur;

import java.util.Scanner;

public class WhileLoopQuestion1 {
    public static void main(String[] args) {
        // Kullanicidan bir asal sayi girmesini isteyin
        // Kullanici asal sayi girmezse "Bu asal degil, tekrar dene" yazdirin
        // Kullanici asal sayi girdiginde, "islem basarili olarak tamamlandi" yazdirin
        Scanner scanner = new Scanner(System.in);
        int sayi = 6 ; // asal olmayan sıradan bir sayi veriyoruz while icinde sayi degiskenini kullanabilelim diye
        while (!AsalMiDondur.asalMiDondur(sayi)){ // while loop boolean sart false oldugu surece calisir
            // cunku false oldugu sürece yani asal sayi girinceye kadar yeni sayi isteyeceğiz. True olu olmaz dongu biter
            System.out.println("Lutfen asal bir sayi giriniz");
            sayi= scanner.nextInt();
            if (AsalMiDondur.asalMiDondur(sayi)){
                System.out.println("islem basarili olarak tamamlandi");
            }else {
                System.out.println("Bu asal degil, tekrar dene");
            }
        }
        }
    }

