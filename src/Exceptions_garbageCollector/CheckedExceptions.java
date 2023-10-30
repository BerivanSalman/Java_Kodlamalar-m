package Exceptions_garbageCollector;

import java.io.FileInputStream;

public class CheckedExceptions {
    public static void main(String[] args) throws Exception { //Exception > IOException > FileNotFounException
        /*
            Eger birden fazla exception olusma ihtimali varsa
            ve biz try-catch yerine throws keyword kullanmak istiyorsak
            en genis yakalama kapasitesi olan (en ince elek araligi olan)
            parent exception'i yazmamiz yeterli olacaktir
         */


       FileInputStream fis = new FileInputStream("src/Exceptions/text.txt"); //bu gidecek dosyayı bulacak

        int k=0;
        while((k= fis.read() ) != (-1)) { //senin getirdiğin sayı -1 oluncaya kadar git harfleri getir ben de onu char olarak yazayım
            // Artık harf kalmamıssa -1 doner cunku.
            //read ın altını kırmızı çizer readın ustune gelip add exception to method signitureyi seceriz
            System.out.print((char) k);
        }
        //Bu kod bizim text.txt dosyasının icini okumamıza yardımcı oluyor. Char char okuyor. J yi getirip yazdırır a yı getirip yazdırır


    }
}
