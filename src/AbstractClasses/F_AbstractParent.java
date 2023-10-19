package AbstractClasses;

public abstract class  F_AbstractParent extends E_AbstractGrandParent {
      /*
        Abstract olan child class'lardan da OBJE OLUSTURULAMAYACAGI icin
        child olsalar da parent'larindaki abstract method'lari
        UYARLAMAK ZORUNDA KALMAZLAR

        Abstract parent - child arasindaki iliski
        normal inheritance kullanan parent - child class'lar gibidir
        YANI isterse uyarlar, istemezse uyarlamaz
     */

    public void method1(){ //method1 burda concrete yapıldı body si var
        System.out.println("GP'daki abstract method1 P'da concrete yapildi");
    }

    public void method4(){ //isterse bu class parent inde olmayan hem abstract hem de concrete  methodlar ekleyebilir
        System.out.println("P'daki concrete method4");
    }

    public abstract int method5();

    public abstract String method6();

}
