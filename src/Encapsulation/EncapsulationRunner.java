package Encapsulation;

public class EncapsulationRunner {
    public static void main(String[] args) {
    Encapsulation obj = new Encapsulation();
        System.out.println(obj.getGorulebilsin());
    // Bu variable gorulebilir artık ama degistirilemez
        obj.setDegerAtanabilsin("Ali");
        obj.setDegerAtanabilsin("Veli");
        //(System.out.println(obj.setDegerAtanabilsin());Methodu yazdıramaz
    // bizim argument olarak yazdigimiz degerleri atama yapiyor
    // ama bizim gormemize izin vermiyor
    obj.gorulebilirVeDegerAtanabilir = "Deneme";
        System.out.println(obj.gorulebilirVeDegerAtanabilir); // Deneme
    // obj.sayi = 20; private oldugu icin bu bilgiye ulasamayız
    // System.out.println(obj.sayi); ulasamadıgımız icin yazdıramayız da
        obj.setSayi(20); //setle 20 sayısını atarız
        System.out.println(obj.getSayi()); // getle 20 sayısını yazdırabilir
}

}
