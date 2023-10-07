package Constructer;

public class HemsireRunner {
    public static void main(String[] args) {
        //Hangi classdaki bilgileri kullanmak istiyorsak o classın ismini yazıp obje olusturmalıyız aşağıdaki gibi;
        Hemsire hemsire1 = new Hemsire(); // () constructer ı görür ve Hemşire classına gidip orda var
        // olan instancelerin bir kopyasını objeye yapıstırır . Deger ataması yapılmayanlara null degeri atar
        hemsire1.hemsireAdi = "Esra";
        hemsire1.hemsireAdresi = "Yenimahalle";
        Hemsire hemsire2 = new Hemsire();
        System.out.println(hemsire2.hemsireTel); // null
        new Hemsire();//constructer oldugu icin obje olusturur fakat hic bir variableye atanmamıs yazdırılmamıs da.
        //Ya hemen asagıdaki gibi hemen kullanırız ya da bu olusturulan constructer cope gider.
        System.out.println((new Hemsire().hemsireAdresi)); // null
        // son olusturdugumuz objeyi
        // atama yapmadigimiz icin bir daha kullanamayiz
        // bu tur bos objeler Java'daki Garbage Collector tarafindan toplanip, yok edilir
        Hemsire hemsire3;
        // hemsire3.method1();
        // System.out.println(hemsire3.hemsireAdresi);
        // initialize yapilmadigi icin(obje olusturulmadıgı icin), herhangi bir variable degerini yazdiramaz
    }


}
