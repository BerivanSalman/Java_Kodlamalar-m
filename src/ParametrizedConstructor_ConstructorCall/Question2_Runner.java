package ParametrizedConstructor_ConstructorCall;

public class Question2_Runner {
    public static void main(String[] args) {
        Question2 obj1 = new Question2(); //Hemen parametresiz constructora gider icine girmeden once
        //obje1 i olusturur ve instancede verilen instanceleri kopyalar (İsim: John Doe, yas: 40)
        //Sonra parametresiz constructora girer. İsim Seher olsun yas 38 olsun diyor. Kopyaladıgı verileri bu degerlerle degistirir
        Question2 obj2 = new Question2("Fatih", 35);// Parametreli degeri olan constructer a gider icine girer.
        //this.isim = isim; // burdaki isim Fatih olsun der. This.yas= 30 tanımlandıgı icin 35 yerine 30 yazdırır
        System.out.println("İsim: " + obj1.isim +
                " Yas: " + obj2.yas);//İsim: Seher Yas: 30
}
    }

