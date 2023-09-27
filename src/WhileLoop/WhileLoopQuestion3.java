package WhileLoop;

public class WhileLoopQuestion3 {
    public static void main(String[] args) {
        int carpim = 1;
        int sayi = 1;
        while (sayi<5){
            carpim = carpim * sayi;
            carpim++;
            // sayiyi burda artırmadıgı icin sayi hep 1 kalıyor
        }
        System.out.println(carpim); // sonsuz dongu olusur
    }
}
