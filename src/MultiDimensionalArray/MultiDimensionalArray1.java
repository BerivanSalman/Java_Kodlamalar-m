package MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray1 {
    public static void main(String[] args) {
        // kac tane parantez varsa onları birer birer ilerlemeliyiz
        //Orn; Yıldız kolejinin 3. sınıflarının 1. şubesindeki ilk öğrenci
        int [] [] arr = {{3, 1, 2, 4},{1, 2}, {3,4,5}, {10}, {2,7}}; //10 sayisini süslü parantezsiz yazamayız.
        // Diğerleri array oldukları icin  onun da array oldugunu belirtmemiz icin yazmamız gerekecek
        System.out.println(arr.length); // 5 elemanlıdır
        System.out.println(arr[3]);//[I@1540e19d. 3 deki elemanları boyle yazdıramayız
        System.out.println(Arrays.toString(arr[3])); // [10] doner
        System.out.println(arr[2].length);//3
        //Ornegin 2. arraydeki 5 elementine ulasmak istiyoruz. 5 sayisi 2. arraydeki 2 numaralı indexteki elemandır
     /* Arrayın icinde bulunan elementlerden birini yazdirmak istersek;
     4 elementi icin--> arr[0] [3]
     2 elementi icin--> arr[1] [1]
     10 elementi icin-->[3] [0]
         System.out.println(arr[0] [3]); //4
      */
        /*Inner Arraylerden birini yazdirmak istersek Arrays.toString() kullanılır
System.out.println(Arrays.toString(arr[1])); //[1, 2] // dısardaki outer arrayin icinde ne varsa onu yazdırır
Arrayi direkt yazdıramadıgımız icin Arrays.toString kullanmamız gerek
         */
        /*Outer arrayi yazdırmak istersek Arrays.deepToString() kullanırız
         */
        System.out.println(Arrays.deepToString(arr)); //[[3, 1, 2, 4], [1, 2], [3, 4, 5], [10], [2, 7]]
    }
    }

