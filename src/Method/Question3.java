package Method;

public class Question3 {
    public static void main(String[] args) {
        // 4 basamaklı kac tane asal sayi vardir?
        int sayac = 0;
        for (int i = 1000; i <10000 ; i++) {
            if (AsalMiDondur.asalMiDondur(i)){
                sayac++;
            }
        }
        System.out.println("Asal sayi adedi: " + sayac);
    }

}
