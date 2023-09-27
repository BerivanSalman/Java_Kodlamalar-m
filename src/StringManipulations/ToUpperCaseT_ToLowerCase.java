package StringManipulations;

import java.util.Locale;

public class ToUpperCaseT_ToLowerCase {
    public static void main(String[] args) {
        String str = "Java Candir";
        System.out.println(str.toUpperCase()); //JAVA CANDIR
        System.out.println(str); //Java Candir
        //Kalıcı degisiklik olsun istiyorsak atama yapmamiz gerek.Mesela;
        str = str.toUpperCase();
        System.out.println(str); //JAVA CANDIR

        str = "JAVA CANDIR";
        //Kucuk harfe donusturelim ancak I harfini türkçe karakterdeki ı olarak yazdıralım
        System.out.println(str.toLowerCase(Locale.forLanguageTag("TR"))); //java candır

    }
}
