package NestedIfelse_ternary_switch;

public class Ternary {
    public static void main(String[] args) {
        int sayi = 10;
        // verilen sayi 2 nin katıysa sayinin 2 katını yazdırın
        //2 nin kati degilse 5 fazlasını yazdırın
        System.out.println(sayi % 2 == 0 ? sayi*2 : sayi + 5);

        // verilen sayi pozitif ise 3 ile carpın
        //degilse 20 ekleyin
        sayi = sayi > 0 ? sayi*3 : sayi+20;
        System.out.println(sayi);

        // verilen sayi 5 ile bolunuyorsa sayiyi 5 ile carpın
        // bolunemiyorsa 'sayi 5 in katı degildir' yazdirin.
        // bunu ternary de yapamayız ifle yapılır:

        if (sayi % 5 == 0) {
            sayi = sayi*5;
        }else {
            System.out.println("Sayi 5 in kati degildir.");
        }

        // ternary bize sonuc dondurdugu icin ya direkt yazdırmalıyız ya da bir degiskene atamalıyız.
        // Sadece ternary i yazarsak java hata verir.

    }
}
