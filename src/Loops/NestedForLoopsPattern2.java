package Loops;

import java.util.Scanner;

public class NestedForLoopsPattern2 {
    public static void main(String[] args) {
        /*
            Kullanicidan satir ve sutun sayisini alip
            asagidaki gibi *'lardan olusan bir sekil cizdirin
            1 1 1 1 1
            2 2 2 2 2
            3 3 3 3 3
         */
       Scanner scanner = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int satir= scanner.nextInt();
        System.out.println("Sutun sayisini giriniz");
        int sutun= scanner.nextInt();
        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=sutun ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

        }
}
