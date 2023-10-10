package Constructor;

public class Car {
    String marka = "Marka atanmamis";
    String model= "Model atanmamis";
    String renk = "Renk atanmamis";
    int yil = 1900;
    int fiyat;
    Car() {
        // bir class'da asagidaki gibi gorunur bir constructor olusturdugumuzda
        // Java default constructor'i siler
        // Bu durumda proje kapsamindaki baska class'larda
        // bu class'in default constructor'ini kullanarak olusturulmus olan objeler
        // CTE verir
        // Bu durumun onune gecmek icin
        // bir class'da gorunur bir parametreli constructor olusturuldugunda
        // DEFAULT constructor yerine de parametresiz ve bos bir cons. olusturulur
    }
    Car(String mrk,String mdl){
        marka = mrk; //arabanın  markası benim mrk diye yolladıgım olsun
        model = mdl; // arabanın  modeli benim mdl diye yolladıgım olsun
    }
    Car (String mrk, String mdl, int yl, int fyt ) {
        marka = mrk;
        model = mdl;
        yil = yl;
        fiyat = fyt;
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
