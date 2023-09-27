package Method;

public class AsalSayiBulma {
    public static void main(String[] args) {
        // Verilen pozitif bir tamsayinin
        // asal olup olmadigini kontol edip
        // asal ise true, asal degil ise false yazdiran bir method olusturun
        asalMiyazdir(45); // false
        asalMiyazdir(9876542); // false
        asalMiyazdir(5); // true
        asalMiyazdir(97); // true
    }
    public static void asalMiyazdir(int sayi){
        boolean flag = true; //Once asalmıs gibi davranırız. asalsa true yazdırır
        for (int i = 2; i <sayi ; i++) {
            if (sayi % i == 0){
                flag = false; // asal degilse false yazdırır
                break; // eger sayi buyukse java cok ugrasmasın diye ilk bolen sayiyi buldugunda durur
                // ve intellij bosa calısmamıs olur
            }
        }
        System.out.println(flag); // asalsa true, asal degilse false yazdıracak
    }

}
