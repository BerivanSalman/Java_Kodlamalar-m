package Arrays;

import java.util.Arrays;

public class ArrayeElemanEklemeMethod {
    public static void main(String[] args) {
        //Soru 7- Verilen bir array’e
        //        istenen bir elemani ekleyip bize donduren bir method yazin,
        //        eski array’e yeni degeri atayin.
        int[] arr1 = {4,5,6,7};
        arr1 = arrayeElemanEkle(arr1,10);
        //System.out.println("arr1'in method call'dan sonraki hali : " + Arrays.toString(arr1)); // [4, 5, 6, 7, 8]
        arr1 = arrayeElemanEkle(arr1,12);
        System.out.println("arr1'in 2.method call'dan sonraki hali : " + Arrays.toString(arr1)); // [4, 5, 6, 7, 8]
    }
    public static int[] arrayeElemanEkle(int[] arr1 , int eklenecekEleman){
        int[] yeniArr= new int[arr1.length+1]; // [0, 0, 0, ...] // yeni bir array olusturuyoruz
        // eski array'deki tum elementleri yeni array'e atayalim
        for (int i = 0; i < arr1.length ; i++) {
            yeniArr[i] = arr1[i];
        }
        // yeni array'in son elementi olarak istenen sayiyi atayalim
        yeniArr[yeniArr.length-1] = eklenecekEleman;
        return yeniArr;
    }
    }

