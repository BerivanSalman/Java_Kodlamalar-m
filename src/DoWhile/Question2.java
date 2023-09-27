package DoWhile;

public class Question2 {
    public static void main(String[] args) {
        int sayi = 10 ;
        // do-while loop ile verilen sayidan baslayip, birer azaltarak
        // 3'e kadar olan sayilari yazdirin
        do {
            System.out.print(sayi + " ");
            sayi--;
        }while (sayi>3);
        System.out.println("");
        System.out.println("======================");

        sayi = 2; // 2 sayisi while da belirtilen gibi 3 den buyuk olmamasına rağmen yine de calısınca 2 yi yazdırır.
        System.out.println("do while loop ile : ");
        do {
            System.out.print(sayi + " ");
            sayi--;
        }while (sayi>3);
        System.out.println("");
        System.out.println("======================");
        // ayni soruyu while loop ile yapalim
        sayi = 2;
        System.out.println("while loop ile : ");
        while (sayi>3){
            System.out.print(sayi + " ");
            sayi--;
        }
    }
}
