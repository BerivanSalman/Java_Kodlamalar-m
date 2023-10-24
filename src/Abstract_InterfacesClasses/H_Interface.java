package Abstract_InterfacesClasses;

public interface H_Interface {
     /*
        1- Interface'ler full abstraction saglar
        2- full abstraction sagladigi icin abstract yazsak da yazmasak da
           tum method'lar public ve abstract'tir.Bu yüzden;
            Asagıdaki ornekte public ve absract keywordlerini gri yapar.Ayrıca
            hepis zaten public oldugu icin protected vs yazamayız
      */
    public abstract void method1();
    public void method2();
    abstract int method3();
    /*
        3- Interface'de olusturulan her variable
           yazsak da yazmasak da
           public, static ve final'dir.
     */
    public final static int sayi1 = 20;
    //final sayı1 = 30;//final sayıya yeni deger atanamaz
    final int sayi2 = 10;
    static String isim = "Ali Can";

    String method4();
    //void yeniMethod();

    public static void main(String[] args) {


    }
}
