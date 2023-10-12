package Mutable_ImmutableClasses;

public class StringPoolQuestion {
    public static void main(String[] args) {
        String s = "Hello"; //s havuzda
        String t = new String(s); //basit yontemle olusturulmadıgı icin havuzda degildir
        if ("Hello".equals(s)) System.out.print("one"); //equals da havuza bakmaya gerek yok hello hello ysa direkt yazar
        if (t == s) System.out.println("two"); //s havuzda ama t havuzda degildir == bu durumda false verir
        if (t.equals(s)) System.out.print(" three"); //equals da havuza bakmaya gerek yok hello hello ysa direkt yazar
        if ("Hello" == s) System.out.print(" four"); // ikisi de havuzda calısır burası
        if ("Hello" == t) System.out.println("five"); //hello havuzda ama t havuzda olmadıgı icin yazdırmaz
        // konsoldaki cıktı :one three four
    }
}
