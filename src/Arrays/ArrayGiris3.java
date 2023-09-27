package Arrays;

public class ArrayGiris3 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        System.out.println(arr.length); //5 verir
        //burdaki length metod degil uzunlugu tutan bir variabledir. O yüzden sonunda () yok

        int [] dizi = {1, 3, 8, 23, 99};
        System.out.println(dizi[2]); //8
        dizi[2] = 10; // böyle atama yaparak degerini degistirebiliriz
        System.out.println(dizi[2]); //10

    }
}
