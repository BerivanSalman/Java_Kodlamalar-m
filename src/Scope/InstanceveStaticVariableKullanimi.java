package Scope;

public class InstanceveStaticVariableKullanimi {
    // Okul uygulamasi yaptigimizi dusunelim
    static String okulIsmi = "Yildiz Koleji";
    static String mudur = "Fikret Zeybek";
    static String okulAdresi = "Cankaya";
    // usttekilerin hepsini static yaptık cunku kisiye gore degismeyen bilgilerdi
    String ogretmenIsmi = "Isim atanmadi";
    String ogretmenAdresi = "Adres girilmedi";
    String ogretmenTel = "Tel girilmedi";
    // usttekileri instance yaptık cunku kisiye gore degisen bilgilerdi
    public static void main(String[] args) {
        // static method icinde static olmayan bir methodu cagıramayız
        // bu method static oldugu icin ogretmenIsmi, ogretmenAdresi ve OgretmenTel variablelerini bu methodun icinde
        // kullanamayız. Kullanabilmemiz icin obje olusturmamız gerek asagidaki gibi;
        InstanceveStaticVariableKullanimi ogr1 = new InstanceveStaticVariableKullanimi();
        System.out.println(ogr1.ogretmenAdresi); // Adres girilmedi
        ogr1.ogretmenIsmi = "Omer";
        ogr1.ogretmenAdresi = "Kizilay";
        // java bir obje olusturdugunda ınstance variablelerin birer kopyasını alır
        System.out.println(ogr1.mudur); // Fikret Zeybek. Normalde ogr1. ya basınca mudur variablesi görunmuyor.
        //Cunku objenin degil classın icindedir ama elimizle mudur yazarsak da java itiraz etmez
        InstanceveStaticVariableKullanimi ogr2 = new InstanceveStaticVariableKullanimi();
        System.out.println(ogr2.ogretmenIsmi); // Isim atanmadi
        ogr2.ogretmenIsmi = "Zeliha";
        InstanceveStaticVariableKullanimi ogr3 = new InstanceveStaticVariableKullanimi();
        System.out.println("=====");
        System.out.println(ogr1.ogretmenIsmi); // Omer
        System.out.println(ogr2.ogretmenIsmi); // Zeliha
        System.out.println(ogr3.ogretmenIsmi); // isim atanmadi
        System.out.println(ogr1.okulIsmi); // Yildiz Koleji //objede okul ismi yok ama classda var gider bulur yazar
        System.out.println(ogr2.okulIsmi); // Yildiz Koleji
        System.out.println(ogr3.okulIsmi); // Yildiz Koleji
        ogr1.okulAdresi = "Yeni Mahalle"; // static bir variableye böyle bir deger atayabiliriz.
        System.out.println(okulAdresi); // Yeni Mahalle
        System.out.println(ogr2.okulAdresi); // Yeni Mahalle
        System.out.println(ogr3.okulAdresi); // Yeni Mahalle
    }
}

