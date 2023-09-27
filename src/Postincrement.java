public class Postincrement {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;
        System.out.println("a: " + a + "b: " + b);
        // a ve b 11 doner.Once a nın degerini artırır b ye atar.
        int c = 10;
        int d = c++;
        System.out.println("c: " + c + " d: " + d);
        // c = 11 d = 10 doner. Once atama yapar sonra c nin degerini artırır.
        int sayi = 10;
        System.out.println(sayi --); // 10 doner. Once sayıyı yazdırır sonra sayiyi azaltır.
        System.out.println(sayi); // 9 doner.

        int sayii = 20;
        System.out.println(--sayii);// 19 doner. Once azaltır sonra yazdirir
        System.out.println(sayii); // 19 doner

        int sayiii = 40;
        ++sayiii;
        System.out.println(sayiii); //41 yazdirir.

    }
}
