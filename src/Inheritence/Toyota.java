package Inheritence;
    public class Toyota extends Car{
//Car classındaki tum verilere ulasır
 //Var olan bir variableyi kendimize göre ayarlayabiliriz;
        String marka = "Toyota"; //Toyato classında oldugum icin artık markaya deger atatık.
        String uretimYeri = "Japonya ve Turkiye";  //bunu da kendimize uyarladık
//Yeni özellikler de katabiliriz;
        String sanziman = "otomatik veya manuel";
        String lastik = "Pirelli";
        String guvenlik = "Toyota araclar ekstra guvenlik donanimina sahiptir";
        String aku = "Aku atanmadi";

        /*2 tane inheritten aldık 4 tane de kendimiz ekledik. Ama toplamda
        6 tane ozellik yok. Extends Car yaptıgımız icin Car Parent'ından
        -Model
        -Renk
        Yakıt
        Bunları da otomatikmen alır. Toplam = 9 ozelligi vardır
         */
    }

