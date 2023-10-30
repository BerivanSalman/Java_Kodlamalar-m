package Exceptions_garbageCollector;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ParentChildExceptions {

    public static void main(String[] args) {

        /*
            Birden fazla exception olusma ihtimali varsa
            ve bu exception'lar arasinda Parent - Child iliskisi olursa

            once Child, sonra Parent yazilmalidir.

            Tersi yapilirsa
            yani once Parent yazilirsa
            Parent exception'in yakalama kapasitesi daha fazla oldugundan
            tum olasi exception'lari yakalayacak
            ve alttaki child exception'a is kalmayacaktir.
            Boyle yazarsak Java altini cizer
            ve duzeltmemizi ister

         */

        try {
            FileInputStream fis = new FileInputStream("src/Exceptions/text.txt");
            //Bunu yazdıktan sonra FileInputStreamın üzerine geliriz ve more actionsdan surround with try/catch i seceriz

            int k=0;
            while((k= fis.read() ) != (-1)) { //readin altını kırmızı cizer ve ustune gelince 4 tane secenek sunar bize.
                // İlk secenek olan add catch i seceriz.  40. satırdaki catch olusur
                System.out.print((char) k);
            }
// birden fazla catch olusturdugumuzda ilk catcha child exceptionu koymalıyız
        } catch (FileNotFoundException e) {
            System.out.println("Dosya yolu yanlis");
//Exception > IOException > FileNotFoundException. Exception bu ikisinin de parentidir. IOException  da FileNotFoundException ın parentidir
        } catch (IOException e) {

            System.out.println("Dosya okunamiyor");
        }

    }
        }
