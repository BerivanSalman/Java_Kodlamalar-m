package Arrays;

import java.util.Arrays;

public class EqualsArrays {
    public static void main(String[] args) {
        int arr1 [] = {2, 1, 7, 6};
        int arr2 [] = {1, 7, 2, 6};
        System.out.println(Arrays.equals(arr1, arr2));
        // rakamlar aynı ama yerleri farklı oldugu icin false verir

       int arr3 [] = {3, 2, 7, 8, 11};
       int arr4 [] = {7, 3, 2, 8, 11};
       Arrays.sort(arr3);
       Arrays.sort(arr4);
        System.out.println(Arrays.equals(arr3,arr4)); // true
    }
}
