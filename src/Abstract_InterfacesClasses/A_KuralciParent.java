package Abstract_InterfacesClasses;

import java.util.ArrayList;
import java.util.List;

public abstract class A_KuralciParent {
     /*
        1- bir class'in child class'lari override etmeye zorlayacagi
           method'lari abstract olarak tanimlamasi gerekir
        2- bir class'in abstract method'lar barindirabilmesi icin
           kendisinin de abstract olarak tanimlanmasi gerekir
        3- abstract method'lar child class'larin OVERRIDE etmesi icin olusturulur
           dolayisiyla body'ye ihtiyaclari yoktur.
        4- bir abstract class abstract method'lar barindirdigi gibi
           abstract olmayan (concrete) method'lar da bulundurabilir
           partial abstraction
        5- abstract class'da bulunan concrete method'lar
           child class'lar tarafindan overide EDILMEK ZORUNDA DEGILDIR
        6- abstract class'lar class olduklari icin constructor'lari vardir
           AMMA iclerinde abstract method'lar bulundugundan
           abstract class'lardan OBJE OLUSTURULAMAZ
           //A_KuralciParent obj = new A_KuralciParent();
        // obj.method1();
        7- A_KuralciParent obj = new D_ChildOfKuralciParent(); child sınıfından constructor olusturabiliriz. Cunku
        Child classında artık tum methodlar concrete yapılır
        8- abstract methodu override ettiğimizde I(ımplement) cıkar yan tarafta  uyarlamamız kesin gereklidir.
         Normal methodlarda O çıkar kendimize uyarlayabiliriz

     */

    public abstract void method1(); //abstract methodların body si olmaz. Bodyleri child classdadır
    //resmi gazetedeki bir yazı gibi dusun bunu

    public abstract void method2();

    public abstract void method3();

    public void method4(){
//abstract olmadıgı icin  child da illa kullanılmak zorunda değildir ve body si olmalıdır.
        //Bu illa kullanılmak zorunda olunmadıgı icin buna PARTİAL ABSTRACT denir
    }

    public abstract int method5();

    public static void main(String[] args) {



        List<String > isimler = new ArrayList<>();
    }
}
