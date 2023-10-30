package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions1 {
    public CheckedExceptions1() throws FileNotFoundException { // bu riskin farkındayız biz yolumuzdan eminiz sen calısmana bak exceptionu fırlat ve yoluna devam et
    //Java daha kodları yazarken tehlike kokuları alır ve hata verir
        /*
            Checked exceptions daha cok dosya okuma
            veya dosyaya bilgi kaydetme ile ilgilidir
            javada bu islemlere input/output dendiginden
            exception olarak IOException ve child class'lari olusturulmustur
         */

        String dosyaYolu =" Exceptions/text.txt";
        /*Javanın bu dosyayı bulabilmesi icin FileInputScream olustururuz. Bunu şu sekilde olustururuz; text.txt ye gidip sag
        click yapınca Copy Path/Referenceyi seceriz. Path From Content Root u seceriz.  Bunu  21.satırdaki new FileInputStream ın
        icine yapıstırabilirz. Yapıstırınca altını kırmızı cizer ya  sen okuyabilecegim dosya var diyorsun ama ya yoksa diye
         */
    FileInputStream fis = new FileInputStream(dosyaYolu); //java uyardı ya yoksa der
        //FileInputStreamın uzerine geldiğimizde cıkan seyden more actions secip add exceptions to method signature yi seceriz.Bunu
        // secince 7. satırdaki kod ortaya cıkar

        /*
            Unhandled exception: java.io.FileNotFoundException
            CheckedExceptions kod calismadan riskli olan kodlarda bizi uyarir
            Bu konuda inisiyatif bizdedir

            1- istersek bu satiri try-catch ile handle eder ve
               exception olussa da yoluna devam etmesini saglariz
            2- veya exception olustugunda kodun durmasini istiyorsak
               sadece altindaki kirmizi cizginin gitmesini ve calismasini istiyorsak
               method deklarasyonunun yanina
               bu riskin farkinda oldugumuzu ve bu method'un
               belirtilen exception'i firlatabilecegini yazariz
         */

    }
}
