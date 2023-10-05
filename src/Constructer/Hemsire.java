package Constructer;

public class Hemsire {
    //Burayi runnder classının istediği zaman kullanabilecegi bir depo gibi düşün
    static String hastaneAdi = "Yildiz Hastanesi" ;
    static String hastaneAdresi = "Cankaya";
    static String bashekimIsmi = "Ali Murtaza" ;
    //Yukardaki bilgiler degismeyen bilgiler oldukları icin static tanımladık
    String hemsireAdi;
    String hemsireAdresi;
    String hemsireTel;
    // Yukardaki bilgiler herkes icin farklı oldugu icin atama yapmadık ve instancelerdir
    public void method1(){
        System.out.println("Hemsire class'indan method1 calisti");
    }

}
