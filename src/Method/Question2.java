package Method;

import Loops.AsalMıBulma;

public class Question2 {
    public static void main(String[] args) {
        //Onceden olusturdugun metodu kullnarak
        // 3 basamaklı sayiların asal olup olmadıklarını yazdır
        for (int i = 100; i <=999 ; i++) {
            //System.out.print(i + " " + ": " +AsalMiDondur.asalMiDondur(i));
            // ya da;
            if (AsalMiDondur.asalMiDondur(i)) { // true ise asal sayiları yazdıracak
                System.out.print(i +" ");
            }
        }
    }
}
