package Arrays;

import java.util.Arrays;

public class ArrayGiris1 {
    //Java da aynı data türünden birden fazla element barındırabilen yapılardır.
    //Arraydan birsey isterken index degerini de yazmamız gerekiyor
    public static void main(String[] args) {
        int [] arr = new int[5]; // henuz deger atanmadıgı icin java [0, 0, 0, 0, 0] 5 tane 0 yazdirir.
        System.out.println(Arrays.toString(arr)); //[0, 0, 0, 0, 0]
        /*
            Bir array olusturulurken, 2 sey mutlaka deklare edilmelidir
            1- icine konulacak elementlerin data turu
            2- array'in icine konulacak element sayisi (length)
            eger array'i yukardaki gibi olusturursak
            biz hic bir deger atamasi yapmadigimiz icin
            Java default olarak belirledigi degerleri atayacaktir

            Array olusturulduktan sonra,
            olmayan index kullanilarak yeni deger atanmasi/eklenmesi MUMKUN DEGILDIR

            Yani 4 elemanli bir array'e 5.elementi ATAYAMAZSINIZ
            Ayni sekilde, 4 elemani olan bir array'den
            bir elemani silip, eleman sayisini 3'e dusuremezsiniz. 4 kisilik arabayı 7 kisi yapabilir misiniz? hayır
         */
        int[] arr2 = {4,1,7,5}; // length = 4
        System.out.println(arr2[1]); // 1
        System.out.println(arr2[3]); // 5
        System.out.println(arr2[arr2.length-1]); // son elementi yazdirmak istersek 5
        // ilk array'de deger atamasi yapmadik
        System.out.println(arr[0]); // 0 verir
        System.out.println(arr[arr.length-1]);// son elemntini yazdirin 0
        // olmayan index'deki bir elemente ulasmak istersek
        // System.out.println(arr2[5]); // ArrayIndexOutOfBoundsException
        // Olmayan bir index'e atama yapabilir miyiz ?
        // arr2[4] = 8 ; // ArrayIndexOutOfBoundsException
        arr = new int[10];

        arr = new int[20];
    }
    }

