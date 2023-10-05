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
