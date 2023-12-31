package Method;

public class AsalMiDondur {
    public static void main(String[] args) {
        // Verilen pozitif bir tamsayinin
        // asal sayi olup olmadigini kontrol edip
        // asal ise true, asal degil ise false donduren // yani boolean dondurecek)
        // bir method olusturun
        asalMiDondur(45); // false dondurdu, ama biz kullanmadik.
        // O yüzden calıstırdıgımız zaman bize birsey yazdırmaz.
        // Yazdırmak icin sout un icine koymamız lazım
        System.out.println(asalMiDondur(43)); // true // yazdırmak istiyorsak sout kullanırız
    }
    public static boolean asalMiDondur(int sayi){
        boolean flag = true;
        for (int i = 2; i <sayi ; i++) {
            if (sayi % i == 0){
                flag = false;
                break;
            }
        }
        return flag; // yazdır demiyor sadece sondur diyor o yüzden soutun icine yazmadık
    }
}
