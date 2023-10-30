package Exceptions;

import java.io.FileInputStream;

public class CheckedExceptions2 {
    public static void main(String[] args) throws Exception {
        // String sayi = 3; bu exception degildir. Compile Time Errordur
        /*
            Eger birden fazla exception olusma ihtimali varsa
            ve biz try-catch yerine throws keyword kullanmak istiyorsak
            en genis yakalama kapasitesi olan (en ince elek araligi olan)
            parent exception'i yazmamiz yeterli olacaktir
         */

        FileInputStream fis = new FileInputStream("src/Exceptions/text.txt");

        int k = 0;
        while ((k = fis.read()) != (-1)) {
            System.out.print((char) k);
        }
    }
}
