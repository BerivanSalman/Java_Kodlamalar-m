package passByValue;

public class PassByValue {
    public static void main(String[] args) {
        // methodlar arası geciste variablenin kendisi degil degeri(value) gider
        int sayi = 20;
        System.out.println("method call oncesi sayi : " + sayi); // 20
        System.out.println("Method return degeri "+sayiDegistir(sayi)); // 25
        System.out.println("method call sonrasi sayi : " + sayi); //  20
        // bu scopeun icinde 5. satırda sayi variablesi var ve degeri 20 dir o yüzden 20 yazdırıyor
        sayi = sayiDegistir(sayi); // degisikligin kalıcı olmasını istiyorsak boyle yaparız
        // bu scopeun icinde 5. satırda sayi variablesi var ve degeri 20 dir bu sayiyi sayiDegistir methoduna götür
        // o methodda degistirsin ve sonucu
        //sayi variablesine atama yap. sayi = 25; olur artık
        System.out.println("atama sonrasi sayi : " + sayi); //  25
    }
    public static int sayiDegistir(int sayi){
        sayi += 5;
        System.out.println("method icinde sayi : " + sayi); // 25
        return sayi; // methodun cagırıldıgı yere dondur demek istiyor
    }
}
