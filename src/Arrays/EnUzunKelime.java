package Arrays;

public class EnUzunKelime {
    public static void main(String[] args) {
        //Soru 6- Verilen String bir array’deki
        // en uzun ve en kisa kelimeleri yazdiran bir method olusturun
        String [] isimler = { "Zehra","Huseyin","Mehmet","Esra","Ali","Ercan","Omer"};
    enUzunEnKisaYazdir(isimler);
}
    public static void enUzunEnKisaYazdir(String[] isimler){
        String enKisaIsim = isimler[0]; // 0. indexteki degeri atadık
        String enUzunisim = isimler[0];// 0. indexteki degeri atadık
        // ikisine de 0. indexteki degeri atadık
        for (int i = 0; i < isimler.length ; i++) {
            // Length = 7 dir. Dizide 7 eleman var
            // isimler.length isimler dizisinin icindeki elemanları teker teker getirir
            //0. indexteki kelime, 1. indexteki kelime, 2. indexteki kelime....6. indexe kadar.böyle devam eder
            if (isimler[i].length() > enUzunisim.length()){ // (i) 0. indexten baslar ve 0. indexteki kelimenin uzunlugu
                //0. indexteki kelimenin uzunlugundan buyuk mudur der. Hayır buyuk degildir aynıdır. Buyuk olanı
                // aradıgımız icin 1. indexteki elemanla karsılastırma yaparız. (i) 1 olur.
                // 1. indexteki (Huseyin)in kelime uzunlugu 0. indekteki (zehra) nın uzunlugundan buyuk mudur.
                // Evet buyuktur. O yüzden enUzunisime Hüseyini koyar Bu dongu böyle devam eder. Huseyinden
                // daha uzun bir isim yoksa enUzunisimde Hüseyin kalır
                enUzunisim = isimler[i];
            }
            if (isimler[i].length() < enKisaIsim.length()){
                enKisaIsim = isimler[i];
            }
        }
        System.out.println("en uzun isim : " + enUzunisim);
        System.out.println("en kisa isim : " + enKisaIsim);
    } // sonradan da isim eklemesi yapabiliriz hata vermez

        }
