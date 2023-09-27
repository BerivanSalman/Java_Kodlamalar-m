package DataCasting;

import java.util.Scanner;

public class AsciiSoru {
    public static void main(String[] args) {
        // kullanıcıdan bir char alip ascii table da o karakterden sonra gelen 3 karakteri yazdır
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ascii tabledan bir karakter giriniz: ");
        char a = scanner.next().charAt(0); // next char olmadıgı icin bunu yazıyoruz
        /*
        char data turundeki bir degeri matematiksel bir isleme sokarsak ve ya
        sayisal bir data turune atama yapmak istersek ASCİİ TABLE'daki degeri ile isleme girer
         */
        //t girersek
        System.out.println("Girilen karakterden 1 sonraki: " + (a+1));//117
        System.out.println("Girilen karakterden 2 sonraki: " + (a+2));//118
        System.out.println("Girilen karakterden 3 sonraki: " + (a+3));//119

        //char olarak istersek de ;
        // t girersek
        System.out.println("Girilen karakterden 1 sonraki: " +(char) (a+1));//u
        System.out.println("Girilen karakterden 2 sonraki: " +(char) (a+2));//v
        System.out.println("Girilen karakterden 3 sonraki: " +(char) (a+3));//w

        char chr1 = '1';
        char chr2 = '2';
        System.out.println(chr1+chr2); // 49+50 = 99

    }
}
