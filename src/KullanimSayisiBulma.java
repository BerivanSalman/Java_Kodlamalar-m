public class KullanimSayisiBulma {
    public static void main(String[] args) {
        /*
        Kullanicidan bir cumle ve bir harf isteyin
        Verilen cumle ve harfe gore asagidaki cumlelerden
        uygun olanı yazdırın
        1-Cumle harfi icermiyor.
        2-Cumlede harf sadece 1 kere kullanılmıs
        2-Cumlede harf birden fazla kullanılmıs
         */
        String str = "Java ogrendikce guzellesiyor";
        String arananHarf = "a";
        // once aranan harfin ilk kullanimini bulalim;
        int ilkIndex = str.indexOf(arananHarf);
        System.out.println("Aranan harfin ilk indexi: " +ilkIndex);

        // aranan harfin 2. indexini bulalim;
        int ikinciIndex = str.indexOf(arananHarf,ilkIndex+1);
        System.out.println("Aranan harfin ikinci indexi: " +ikinciIndex);
        if (ilkIndex == -1) {
            System.out.println("Cümle harfi icermiyor");
        } else if (ikinciIndex == -1) {
            System.out.println("Cumlede harf sadece bir kere kullanilmis");
        }else {
            System.out.println("Cümlede harf birden fazla kullanilmis");
        }


    }
}
