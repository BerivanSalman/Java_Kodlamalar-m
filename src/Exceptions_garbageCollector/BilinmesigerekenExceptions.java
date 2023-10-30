package Exceptions_garbageCollector;

public class BilinmesigerekenExceptions {
    public static void main(String[] args) {

        String str = "Java Candir";

        // Integer sayi = str ;

        Object obj = str;  // arada parent child iliskisi oldugundan auto widening

        //Integer sayi = (Integer) obj; // arada parent child iliskisi oldugundan explicit narrowing yapilabilir
        // ama sout sayı yazıldıgında ClassCastException verir. Integer sayiya str yi suslesek de atayıp yazdıramayız

// arama sonuc sayisinin 100'den fazla oldugunu test edin
        String aramaSonucuStr = "123";
        Integer aramaSonucuInt = Integer.parseInt(aramaSonucuStr); //dtr ı stringe cevirdik
        //   String aramaSonucuStr = "123a"; olsaydı NumberFormatException verirdi
        if (aramaSonucuInt>100){
            System.out.println("arama sonucu 100'den buyuk, test PASSED");
        }else{
            System.out.println("arama sonucu 100'den buyuk degil, test FAILED");
        }

    }
}
