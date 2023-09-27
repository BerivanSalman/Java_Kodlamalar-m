package Method;

public class Method {
    public static void main(String[] args) {
        toplama(2,3); // void oldugu icin bunun sonucunu yazdırır
        System.out.println("-----------------------");
        topla(2,3); // void olmadıgı icin hesaplamayı yapar ama yazdırmaz. Sout yok cunku
        System.out.println("--------------------");
        int sonuc =topla(2,3);
        System.out.println(sonuc);
    }
    public static void toplama(int sayi1, int sayi2){
        System.out.println(sayi1+sayi2);//a101
    }
    public static int topla(int sayi1,int sayi2){
        int toplama =sayi1+sayi2;//bim
        return toplama;
    }
}
