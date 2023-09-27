package StringManipulations;

public class CharAt {
    public static void main(String[] args) {
        String str ="Java gun gectikce guzellesiyor.";
        // ilk harfi yazdirin
        System.out.println(str.charAt(0)); // J
        System.out.println(str.charAt(4)); // space
        // str'da 31 karakter var. Karekteri saymaya 1 den baslarız
        // son karakter olan .'nin indeksi 30 olur. Indexi saymaya 0 dan baslarız
        // son karakteri yazdirin;
        System.out.println(str.charAt(31 -1)); // .
        // sondan 5.karakteri yazdirin;
        System.out.println(str.charAt(31-5)); // i
        // str'da olmayan bir index'i istersek
        // System.out.println(str.charAt(44)); // StringIndexOutOfBoundsException
    }
}
