package StringManipulations;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        //Soru 6 : Kullanicidan bir String alin,
        //         String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
        //         String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String girilenMetin = scanner.nextLine();

        int uzunluk = girilenMetin.length();
        String yeniHal =""; // sonradan kullanmak icin simdilik boyle bir atama yaptık

        if (uzunluk % 2 == 0){ // uzunluk cift ise

            yeniHal = girilenMetin.substring(0,uzunluk/2) + // Uzunluk 6'ysa 6/2 = 3'tur. 3 ü dahil etmez 0,1, ve 2. indexleri yazdırır
                    ":)"+
                    girilenMetin.substring(uzunluk/2); //uzunluk/2 den sonrasını yazdır
            // Uzunluk 6 ysa 6/2 = 3. 3ten sonrasını yazdırır 3 u de dahil ederek

        }else { // uzunluk tek ise +1 ekleriz
            yeniHal = girilenMetin.substring(0,uzunluk/2)+
                    ":(" +
                    girilenMetin.substring((uzunluk+1)/2);
            // uzunluk 5 se uzunluk+1 deyince uzunluk 6 olur ve 6/2 = 3
            //3. indexten itibaren yazdırmaya baslar gülücükten sonraki tarafı
        }
        System.out.println(girilenMetin+ " yazdiniz ve ben onu degistirdim : " +yeniHal);
    }

}
