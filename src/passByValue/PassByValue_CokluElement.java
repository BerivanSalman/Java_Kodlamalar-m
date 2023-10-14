package passByValue;

import java.util.Arrays;
import java.util.Random;

public class PassByValue_CokluElement {
    public static void main(String[] args) {
        //yolcuların degismesi o arabanın degistigini ispatlar mı ;?Hayır
        //yolcular aynı kalsa bile araba degistiyse o benim arabam mı? hayır
        int[] arr = {1,2,3};
        System.out.println("arr ilk hali : " + Arrays.toString(arr)); //[1, 2, 3]
        elemanlari2Artir(arr); //eleman degisikligi kalıcıdır
        System.out.println("elemanlari artir method call'dan sonra arr : " + Arrays.toString(arr)); //[3, 4, 5]
        //arr [] = arrayiDegistir(arr); boyle atama yapamazsın kalıcı olması icin
        System.out.println("array'i degistir method call'dan sonra arr : " + Arrays.toString(arr));//[3, 4, 5]
        // yolcular kalıcı degismiştir araba aynıdır. Arrayi listi kalıcı degistiremezsin
    }
    public static void elemanlari2Artir(int[] arr){
        // array'in tum elementlerini 2 artirip
        // yeni halini yazdirsin
        for (int i = 0; i < arr.length ; i++) {
            arr[i] += 2;
        }
        System.out.println("eleman artir method'unda degistirilen arr : " + Arrays.toString(arr)); //[3, 4, 5]
    }
    public static void arrayiDegistir(int[] arr){
        // yeni 3 elemanli bir array olusturup
        // icine rastgele 100'den kucuk sayilar koyun
        // arr'ye bu yeni degeri atayin
        // ve arr'yi yazdirin
        int[] yeniArr = new int[3];
        Random rnd = new Random();
        for (int i = 0; i < yeniArr.length ; i++) {
            yeniArr[i] = rnd.nextInt(100);
        }
        arr = yeniArr;
        System.out.println("Array'i degistir method'unda arr : " + Arrays.toString(arr));//[67, 92, 33]
    }
    }
