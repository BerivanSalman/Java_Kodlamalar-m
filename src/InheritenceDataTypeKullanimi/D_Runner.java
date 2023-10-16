package InheritenceDataTypeKullanimi;

public class D_Runner {
    public static void main(String[] args) {

        /*
            Bir obje olusturulurken
            Data turu ve constructor ayni class'dan ise
            variable'larin hangi degeri alacagini bulmak icin
            ilgili class'a gidip aramaya baslariz
            parent class'lara dogru aramaya devam ederiz
            ilk buldugumuz yani en guncel olan deger
            gecerli deger olur.

            Java bir objenin data turu olarak
            constructor'in oldugu class
            veya parent class'lari kabul eder. Yani doktoru bazen personel bazen de calısan olarak cağırmak isteyebiliriz

            Eger data turu, constructor'in parent'i ise
            aramaya DATA TURUnun oldugu class'dan baslanir
            parent class'lara dogru aramaya devam edilir
            ilk bulunan deger kullanilir
         */

        C_AvciKuslar kartal1 = new C_AvciKuslar(); //Avcı kuslar classındaki kartallardan bahsediyoruz
        System.out.println(kartal1.hareket); // C Ucarlar
        System.out.println(kartal1.solunum); // B akcigerle nefes alirlar
        System.out.println(kartal1.beslenme); // C Et yerler
        System.out.println(kartal1.cogalma); // B Yumurtayla cogalirlar
        System.out.println(kartal1.omur); // A yasar ve olurler
        System.out.println(kartal1.kanat); // B Kanatlidirlar
        System.out.println(kartal1.gaga); // C Sivri gagalidir
        System.out.println(kartal1.pence); // C pencelidir
        /*
        Eger ozelligi variable olarak olusturduysak guncel
        ozelliklere bakmıyor data turundeki butun objelerle
        ortak ozelliklerine bakar.
         */

        B_Kuslar kartal2 = new C_AvciKuslar(); //Kuslar classındaki kartallardan bahsediyoruz.
        // Kuslar classından aramaya baslar bulamazsa Hayvanlar classına bakar. Avcı kuslar classına inmez
        System.out.println(kartal2.hareket); // A Hareket ederler. Kartal da tum kuslar gibi hareket eder.
        System.out.println(kartal2.solunum); // B akcigerle nefes alirlar. Kartal da tum kuslar gibi solunum yapar
        System.out.println(kartal2.beslenme); // A Beslenirler. Kartal da tum kuslar gibi beslenir
        System.out.println(kartal2.cogalma); // B Yumurtayla cogalirlar. Kartal da tum kuslar gibi cogalır.
        System.out.println(kartal2.omur); // A yasar ve olurler. Kartal da tum kuslar gibi yasar
        System.out.println(kartal2.kanat); // B Kanatlidirlar. Kartal da tum kuslar gibi kanatlıdırlar
        System.out.println(kartal2.gaga); // B gagalidir. Kartal da tum kuslar gibi gagalıdır
        //System.out.println(kartal2.pence); // CTE

        A_Hayvanlar kartal3 = new C_AvciKuslar(); //Hayvanlar classındaki kartallardan bahsediyoruz. Hayvanlar classından aramaya baslar
        System.out.println(kartal3.hareket); // A Hareket ederler. Kartal da butun hayvanlar gibi hareket eder
        System.out.println(kartal3.solunum); // A solunum yaparlar.Kartal da butun hayvanlar gibi solunum yapar
        System.out.println(kartal3.beslenme); // A Beslenirler.Kartal da butun hayvanlar gibi beslenir
        System.out.println(kartal3.cogalma); // A Cogalirlar.Kartal da butun hayvanlar gibi cogalır
        System.out.println(kartal3.omur); // A yasar ve olurler
        //System.out.println(kartal3.kanat); // CTE
        //System.out.println(kartal3.gaga); // CTE
        //System.out.println(kartal3.pence); // CTE
        //
    }

}
