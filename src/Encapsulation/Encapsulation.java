package Encapsulation;

public class Encapsulation {
    //yukardaki code'dan generate i secip getter ı seciyoruz ve hangisinin gorulmesini istiyorsak onu seciyoruz
    public String getGorulebilsin() { // private olan forulebilsin variablesi runner da gorulebilir oluyor artık
        return gorulebilsin; //degerini bize dondurur
    }

    //yukardaki code'dan generate i secip setter ı seciyoruz ve hangisinin
    public void setDegerAtanabilsin(String degerAtanabilsin) {
        this.degerAtanabilsin = degerAtanabilsin;
    }

    private String gorulebilsin = "Bu variable gorulebilir ama degistirilemez"; //private oldugu icin runner dan ulasamıyoruz.Ulasabilmek icin getter kullanırız
    private String degerAtanabilsin = "Bu variable'a deger atanabilir ama atanmis deger gorunemez";//private oldugu icin runner dan ulasamıyoruz.Ulasabilmek icin getter kullanırız
    public String gorulebilirVeDegerAtanabilir = "Bu variable'a hem deger atanabilir hem de degeri gorulebilir";

    private int sayi = 10;

    /* Yukarda code den generate'e basınca ordan getter ve setter ı
    seciyoruz ve int secenegını seciyoruz. Asagıda goruldugu gibi int i get ve set olarak
    olusturuyor
     */
    public int getSayi() {
        return sayi;
    }

    public void setSayi(int sayi) {
        this.sayi = sayi;
        // int i boyle yapınca public den farkı kalmaz
        /*
        Bir projede calisirken
        en onemli konulardan birisi de
        class uyelerine kimlerin ulasabileceginin ve degistirebileceginin belirlenmesidir
        Bu sinirlamayi en kolay olarak access modifier ile yapabiliriz
        Access modifier ile bir variable'a ulasabilirseniz
        o variable hem deger atayabilir
                   hem de degerini okuyup kullanabilirsiniz
        Gercek hayatta degerleri gorme(read) ve yeni deger atayabilme (write)
        YETKILERININ AYRILMASI istenebilir. Ornegin: Rapor olusturulduktan sonra izin verilen
        kullanıcılar raporu gorebilmeli ancak veriler uzerinde degisiklik yapamamalı
        Yekileri ayirmak istiyorsaniz
        1- oncelikle access modifierı Private yaparak  erisimi engelleyin
        2- istenen yetkiyi saglayan getter ve/veya setter method'u olusturun
     */

    }
}

