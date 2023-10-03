package Constructer;

public class Car {
    String marka = "Marka atanmamis";
    String model= "Model atanmamis";
    String renk = "Renk atanmamis";
    int yil = 1900;
    int fiyat;
    public Car(){
        // renk = "Kirmizi";
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
    }
    Car(String marka, String model , String renk, int fiyat){
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.fiyat = fiyat;
    }

    // tum instance'lar icin parametre alan bir cons. olusturalim
    public Car(String marka, String model, String renk, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.yil = yil;
        this.fiyat = fiyat;
    }
    // model ve yil parametreleri olsun
    // biz hep toyota satiyoruz ve renkleri de hep mavi
    public Car(String model, int yil) {
        this.model = model;
        this.yil = yil;
        marka = "Toyota";
        renk = "Mavi";
    }
    public String toString() { //yukarıdaki 'Code' den Generate'i sevip toStringi sec deriz
        return " Ozellikler ==>" +
                "marka :'" + marka + '\'' +
                ", model :'" + model + '\'' +
                ", renk :'" + renk + '\'' +
                ", yil :" + yil +
                ", fiyat :" + fiyat ;
        //icindeki gorselle oynama yapabiliriz
    }

}
