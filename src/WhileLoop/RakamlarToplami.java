package WhileLoop;

import java.util.Scanner;

public class RakamlarToplami {
    public static void main(String[] args) {
        //Soru 2- While loop kullanarak
        //        kullanicidan alinan sayinin rakamlar toplamini bulun.
        /*
        Örnek olarak, kullanıcı 1234 sayısını girdiyse, geciciSayi bu sayının bir kopyası olarak atanır.
         Döngü her bir adımda son basamağı (örneğin, 4) alır, işlem yapar ve sonra bu basamağı
         geciciSayi'dan çıkararak bir sonraki basamağa (örneğin, 123) geçer.
         Bu işlem, tüm rakamlar işlenene kadar devam eder.
         Orijinal sayı olan 1234 üzerinde hiçbir değişiklik yapılmaz ve sonuç doğru bir şekilde hesaplanır.
         Rakamların toplamını bulmak için her bir basamağı ayrı ayrı işlemek gerekmektedir.
         geciciSayi değişkeni, sayının son basamağına kadar işlem yapmayı sağlar.
          Her adımda son basamağı alırız, işlem yaparız, ve sonra bu basamağı sayıdan çıkararak bir sonraki basamağa geçeriz.
          Bu işlemi geciciSayi üzerinde yaparak orijinal sayıyı korumuş oluruz.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen rakamlar toplamini bulmak icin bir sayi giriniz");
        int girilenSayi = scanner.nextInt();
        int rakam = 0;
        int rakamlarToplami = 0;
        int geciciSayi = girilenSayi;//kullanıcının girdiği sayının bir kopyasıdır
        // ve bu kopya üzerinde işlem yapılacaktır. Asıl sayıyı değiştirmemek için kullanılır.
        while (geciciSayi>0){
            rakam = geciciSayi%10;
            rakamlarToplami += rakam;
            geciciSayi /= 10;
        }
        System.out.println(girilenSayi+" sayisinin rakamlar toplami : " + rakamlarToplami);
    }//1234 gecici sayı
    //4 rakam
    // 123 gecici sayı
   //3 rakam
   //12 gecici sayı
   //2 rakam
   //1 gecici sayı
}//while döngüsü, geciciSayi değişkeni sıfırdan büyük olduğu sürece çalışır.
// Bu, sayının her basamağını tek tek işlemek için kullanılır.
//Döngünün içinde, geciciSayi değişkeninin son basamağı rakam değişkenine atanır.
// Bunun için geciciSayi % 10 işlemi kullanılır. Bu işlem, geciciSayi'nin son basamağını alır.
//rakam değişkeni, rakamlarToplami değişkenine eklenir. Bu şekilde her basamağın değeri toplam değişkeninde birikir.
//geciciSayi değişkeninden son basamağı çıkarmak için geciciSayi /= 10 işlemi yapılır.
// Bu, geciciSayi'nin son basamağını kaldırır ve bir sonraki basamağa geçer.
//while döngüsü, geciciSayi sıfır olduğunda sona erer, çünkü artık hiçbir basamağın işlenmemesi gerekir.

