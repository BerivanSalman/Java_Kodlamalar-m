package NestedIfelse_ternary_switch;

import java.util.Scanner;

public class SwitchcaseMonths {
    public static void main(String[] args) {
        // Kullanicidan bir harf al, alınan harf ile baslayan bir ay varsa yazdırsin.
        // CaseSensitive olmasın
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yazdırmak istediğiniz ay isminin ilk harfini giriniz: ");
        char harf = scanner.next().toUpperCase().charAt(0);
        //Kullanicinin girdigi kelimenin ilk harfini buyuk harf olarak yazdıracak.
        switch (harf){

            case 'O' :
                System.out.println("Ocak");
                break;
            case 'S' :
                System.out.println("Subat");
                break;
            case 'M' :
                System.out.println("Mart veya Mayis");
                break;
            case 'N' :
                System.out.println("Nisan");
                break;
            case 'H' :
                System.out.println("Haziran");
                break;
            case 'T' :
                System.out.println("Temmuz");
                break;
            case 'A' :
                System.out.println("Agustos veya Aralik");
                break;
            case 'E' :
                System.out.println("Eylul veya Ekim");
                break;
            case 'K' :
                System.out.println("Kasim");
                break;
            default:
                System.out.println("Gecersiz harf");

        }

    }
}
