package ParametrizedConstructer_ConstructerCall;

public class Car {
    String marka = "Marka atanmamis";
    String model= "Model atanmamis";
    String renk = "Renk atanmamis";
    int yil = 1900;
    int fiyat;
    public Car(){
        // renk = "Kırmızı"; parametresiz constructer olusturan tüm arabalar standart olarak kırmızı cıkar.
        //Musteri özellikle renk istemediyse rengi kırmızı üretiriz
          /*
            default constructor ile parametresiz constructor'in en buyuk farki
            default cons.'in body'si bos iken
            parametresiz cons.'lara kod yazilabilir
            bu durumda yapilan atamalar tum araclar icin standart olarak uygulanir
         */
    }
    public Car(String mrk , String mdl ,String rnk){
        marka = mrk;
        model = mdl;
        renk = rnk;
        //Parametre isimleri ile instance variable isimleri
        //aynı degilse bu scopedaki gibi atama direkt yapılabilir
    }
    Car(String marka, String model , String renk, int fiyat){
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.fiyat = fiyat;
        //Parametre isimleri ile nstance variable isimleri aynı olursa
        //atama yaparken scope problemi yasarız
        //Java diyor ki bu scope daki variableyi degilde
        // yukarda instance olarak verilen degerleri kullanmak
        // istiyorsan this. yaz basına anlayım der ve hemen yukardekinin
        // rengine burunur
    }
    // tum instance'lar icin parametre alan bir cons. olusturalim.
    //Bunların hepsini elimizle yazmak yerine ustteki
    // code bolumunden 'Generate'ye basıp Constructer'ı secip
    // istediğimiz parametreleri secebiliriz
    public Car(String marka, String model, String renk, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.yil = yil;
        this.fiyat = fiyat;
    }


    public String toString() { //yukarıdaki 'Code' den Generate'i secip toStringi sec deriz
        return " Ozellikler ==>" +
                "marka :'" + marka + '\'' +
                ", model :'" + model + '\'' +
                ", renk :'" + renk + '\'' +
                ", yil :" + yil +
                ", fiyat :" + fiyat ;
        //icindeki gorselle oynama yapabiliriz
    }
}
