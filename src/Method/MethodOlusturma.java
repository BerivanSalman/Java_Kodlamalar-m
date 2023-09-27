package Method;

public class MethodOlusturma {
    public static void main(String[] args) {
        //Faydaları; Tekrar tekrar kullanabilme kolaylıgı ve kodların tekrara düsmemesini saglar;
        //main metodunu nasit ve anlasılır kılar
        // methodlar  islemi yapıp bize birsey dondurmeyıp sadece yazdırma islemi yapabilir void denir
        // ya da islemi yapıp bize dataya uygun bir sonuc dondurur
        String str = "Sevim bak kim gelmis ?";
        str.toUpperCase();
        // method bize bir sonuc donduruyorsa 2 sekilde o sonucu kullanabiliriz
        // sadece o satirda, sonucu gormek istiyorsaniz, kalici bir degisiklik yapmayacakasaniz
        // direk yazdirabiliriz
        System.out.println(str.toLowerCase()); // sevim bak kim gelmis ?
        // veya degisikligin kalici olmasini istiyorsak
        // yeni halini kaydedebiliriz
        String strBuyukharf = str.toUpperCase();
        System.out.println(str); // Sevim bak kim gelmis ?
        System.out.println(strBuyukharf); // SEVIM BAK KIM GELMIS ?
        // Google === google  bug
    }

}
