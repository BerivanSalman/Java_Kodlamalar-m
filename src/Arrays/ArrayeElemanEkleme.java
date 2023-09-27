package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayeElemanEkleme {
    public static void main(String[] args) {
        int[] arr = {3,4,5,3};
        // Kullanicidan bir deger alip, array'e ekleyin
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen array'e eklemek icin bir tamsayi giriniz");
        int eklenecekSayi = scanner.nextInt();
        arr = ArrayeElemanEklemeMethod.arrayeElemanEkle(arr,eklenecekSayi); //dizimizin adını ve eklenecek sayı
        // olarak tanımladıgımız degiskeni yazarız icine
        System.out.println("Array'in yeni hali : " + Arrays.toString(arr));
    }
}
