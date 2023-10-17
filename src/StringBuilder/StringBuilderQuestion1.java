package StringBuilder;

public class StringBuilderQuestion1 {
    public static void main(String[] args) {
        int total = 0;
        StringBuilder letters = new StringBuilder("abcefg");
        total += letters.substring(1,2).length(); // string olarak sadece b'yi verir.Length i 1 dir. String oldugu icin degisim kalıcı olmaz
        total += letters.substring(6,6).length(); //"" getirir. Length 0 dır
        total += letters.substring(6,5).length();// hata verir. Clıstıktan sonra hata verir
        System.out.println(total); //Exception hatası verir
    }
}
