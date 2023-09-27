package StringManipulations;

public class replace {
    public static void main(String[] args) {
        String text = "Can, Cananlara gitmek icin can atiyor";
        System.out.println(text.replace("Can","Turk")); //Turk, Turkanlara gitmek icin can atiyor.
        // replace case sensitive oldugu icin 5. kelime olan can ı degistirmez
        String str = "Java candir";
        System.out.println(str.replace('a', 'q')); // Jqvq cqndir
        System.out.println(str.replace("Java", "Tava")); // Tava candir
        System.out.println(str.replace("Java", "X")); // X candir
        System.out.println(str.replace("x", "y")); // Java candir
        System.out.println(str.replace("a", "e").replace("i", "a"));
        // Jeve cendar
        System.out.println(str.replace("i", "a").replace("a", "e"));
        // Jeve cender
        // degisecek metin sadece ilk deger icin degissin diyorsak
        // replace() yerine replaceFirst() kullanilir
        System.out.println(str.replaceFirst("a", "x")); // Jxva candir
        // regex : regular expressions : belirlenmis kisaltmalar
        // ilk harfi * yapalim
        System.out.println(str.replaceFirst("\\w", "*"));// *ava candir
        // varsa ilk string icindeki ilk rakami + yapalim
        str = "Java 44Candir";
        System.out.println(str.replaceFirst("\\d", "+")); // Java +4Candir
/* Regex Expressions:
     \\s: space          \\S: space olmayan hersey i yok eder
     \\s+ : yanyana birden fazla space
     \\d: digits (numbers)       \\D: digits olmayan hersey
     \\//w: harf, rakam veya _    \\W: har, rakam ve _ olmayan hersey
 */
    }
}
