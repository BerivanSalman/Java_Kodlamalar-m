package MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray2 {
        public static void main(String[] args) {
            int[] arr = {3,6,8,1};
            // arr'nin tum elementlerini yazdirin
            System.out.println(Arrays.toString(arr));//[3, 6, 8, 1]
            for (int i = 0; i < arr.length ; i++) {
                System.out.print(arr[i] + " ");
            } // 3 6 8 1
            System.out.println("");
            int[][] sayilar = {{3,5,6},{2,7},{1,5,8},{1}};
            System.out.println(Arrays.deepToString(sayilar)); // bu arrayi yazdırır
            // sayilar array'indeki tum elementleri yazdirin. İki katlı array oldugu icin iki katlı for loop olustururuz
            for (int i = 0; i < sayilar.length ; i++) { // outer loop outer array'i kontrol eder
                // i = 0 oldugunda sayilar [0] olarak dusunuruz ve icindeki elemaları {3,5,6} getirir.
                // i = 1 oldugunda sayilar [1] olarak dusunuruz ve icindeki elemaları {2,7} getirir
                //i = 3 olana kadar nu böyle devam eder
                for (int j = 0; j < sayilar[i].length ; j++) { // inner loop da inner array'i kontrol edecek
                    //sayilar [0] ın içindeki {3,5,6} bu elemanların hepsine bakar
                    // sayilar [1] ın içindeki {2,7} bu elemanların hepsine bakar
                    System.out.print(sayilar[i][j] + " ");
                }
            } // 3 5 6 2 7 1 5 8 1
        }
    }
