import java.util.Scanner;

public class RakamlarToplami {
    public static void main(String[] args) {
        // kullanicidan 4 basamakli bir tam sayi alin ve rakamlar toplamini yazdirin.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 4 basamakli bir pozitif tam sayi giriniz: ");
        int sayi = scanner.nextInt();

        int birlerBasamagi = 0;
        int rakamlarToplamı = 0;

        birlerBasamagi = sayi % 10; // 5
        rakamlarToplamı += birlerBasamagi; // 0 + 5
        sayi = sayi / 10; // 2415 / 10 = 241

        birlerBasamagi = sayi % 10; // artık sayi 241. 241 % 10 = 1
        rakamlarToplamı += birlerBasamagi; //5+1
        sayi = sayi / 10; // 241/ 10 =24;

        birlerBasamagi = sayi % 10; // 24 % 10 = 4
        rakamlarToplamı += birlerBasamagi; // 5 + 1 + 4
        sayi = sayi / 10; // 24 / 10 = 2

        birlerBasamagi = sayi % 10; // 2 % 10 = 2
        rakamlarToplamı += birlerBasamagi; // 5+1+4+2
        sayi = sayi / 10; // 2/10 = 0

        System.out.println("Verilen sayinin rakamlari toplami: " + rakamlarToplamı);
    }
}
