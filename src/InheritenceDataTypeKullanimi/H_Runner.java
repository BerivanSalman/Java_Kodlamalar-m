package InheritenceDataTypeKullanimi;

public class H_Runner {
    public static void main(String[] args) {
         /*

           Ozellikler method olarak olusturulmussa

                -constructor ve data turu ayni ise
                 o class'dan aramaya baslayip, parent class'lara dogru devam ederiz
                 ilk buldugumuz method calistirilir

                 -constructor ve data turu ayni degil ise
                  data turu olan class'dan aramaya baslayip, parent class'lara dogru devam ederiz
                  eger method bulunursa, hemen calistirilmaz
                  o method'un constructor olan class'a kadar daha gunceli var mi kontrol edilir
                  daha guncel varsa guncel olan calisir

                   aramaya basladigimiz class'da ve parent class'larinda method bulunamazsa
                   child class'lara donulmez, guncel var mi bakilmaz
                   CTE olusur
                   Tavuk da tum hayvanlar gibi hareket eder demek istiyorsak
                   variable olustururuz. Tavuk da tum hayvanlar gibi hareker ederler
                   hem de hareket olarak yururler demek istiyorsak method olustururuz

         */

        G_AvciKuslar kartal4 = new G_AvciKuslar(); //obje constructer neresiyse ordadır
             //(Data Turu)                    (Constructor)

        kartal4.hareket(); // G Ucarlar
        kartal4.solunum(); // F Akcigerle
        kartal4.beslenme(); // G Et yerler
        kartal4.cogalma(); // F Yumurtayla cogalirlar
        kartal4.omur(); // E yasar ve olurler
        kartal4.kanat(); // F kanatlidir
        kartal4.gaga(); // G sivri gagalidir
        kartal4.pence(); // G pencelidirler

        //Data Turuyle Constructor farklı olursa;

        F_Kuslar kartal5 = new G_AvciKuslar();
        kartal5.hareket(); // G Ucarlar (Kuslar classından baslar aramaya bulamazsa diğer sınıflarda olan en guncel halini yazdırır
        kartal5.solunum(); // F Akcigerle
        kartal5.beslenme(); // G Et yerler
        kartal5.cogalma(); // F Yumurtayla cogalirlar
        kartal5.omur(); // E yasar ve olurler
        kartal5.kanat(); // F kanatlidir
        kartal5.gaga(); // G sivri gagalidir
        //kartal5.pence(); // CTE
        //Ok yukarı gosteriyorsa en guncel method odur.Ok aşagı gösteriyorsa en gunceli gösteren yukarı oklu olan methoda gideriz


        E_Hayvanlar kartal6 = new G_AvciKuslar();
        kartal6.hareket(); // G Ucarlar
        kartal6.solunum(); // F Akcigerle
        kartal6.beslenme(); // G Et yerler
        kartal6.cogalma(); // F Yumurtayla cogalirlar
        kartal6.omur(); // E yasar ve olurler
        //kartal6.kanat(); // CTE Aramaya hayvanlar sınıfından baslıyor ve hayvanlar sınıfında yoksa CTE veriyor
        //kartal6.gaga(); //CTE Aramaya hayvanlar sınıfından baslıyor ve hayvanlar sınıfında yoksa CTE veriyor
        //kartal6.pence(); // CTE Aramaya hayvanlar sınıfından baslıyor ve hayvanlar sınıfında yoksa CTE veriyor


        F_Kuslar kus1 = new F_Kuslar();
        // data turu ve constructor ayni olunca
        // kuslara gidip ilk buldugumu kullanirim daha gunceli var mı yok mu bakmam
        //Kus sınıfından basladıgımız icin zaten Avci kuslar classına hic bakmayız. Orası yoktur .
        //Sadece Kuslar ve Hayvanlar sınıfına bakarız

        kus1.hareket(); // E Hareket ederler
        kus1.solunum(); // F Akcigerle
        kus1.beslenme(); // E Beslenirler
        kus1.cogalma(); // F Yumurtayla cogalirlar
        kus1.omur(); // E yasar ve olurler
        kus1.kanat(); // F kanatlidir
        kus1.gaga(); // F gagalidir
        // kus1.pence(); // CTE


        E_Hayvanlar kus2 = new F_Kuslar();
        //Data turuyle constructor aynı degildir. Boyle olunca Kus icin Avcı kuslara hic bakmaz.
        // Data turu hayvanlar oldugu ici aramaya hayvanlardan baslar ve Avcı kuslara bakmadan en guncel nerdeyse onu yazdırır
        kus2.hareket(); // E Hareket ederler
        kus2.solunum(); // F Akcigerle
        kus2.beslenme(); // E Beslenirler
        kus2.cogalma(); // F Yumurtayla cogalirlar
        kus2.omur(); // E yasar ve olurler
        //kus2.kanat(); // CTE Aramaya hayvanlar sınıfından baslıyor ve hayvanlar sınıfında yoksa CTE veriyor
        //kus2.gaga(); // CTE Aramaya hayvanlar sınıfından baslıyor ve hayvanlar sınıfında yoksa CTE veriyor
        //kus2.pence(); // CTE Aramaya hayvanlar sınıfından baslıyor ve hayvanlar sınıfında yoksa CTE veriyor

        E_Hayvanlar hayvanlar1 = new E_Hayvanlar();
        //Data tipi ve Constructor aynı. Kuslar ve Avcı kuslara hic bakmayız.
        // Hayvanlar classından baslarız onun icinde bulursa yazdırır bulamazsa CTE verir.
        hayvanlar1.hareket(); // E Hareket ederler
        hayvanlar1.solunum(); // E solunum yaparlar
        hayvanlar1.beslenme(); // E Beslenirler
        hayvanlar1.cogalma(); // E cogalirlar
        hayvanlar1.omur(); // E yasar ve olurler
        //hayvanlar1.kanat(); // CTE
        //hayvanlar1.gaga(); // CTE
        //hayvanlar1.pence(); // CTE
    }
}
