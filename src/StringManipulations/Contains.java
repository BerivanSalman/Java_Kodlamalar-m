package StringManipulations;

public class Contains {
    public static void main(String[] args) {
        String str = "Java cok güzel, cok.";
        System.out.println(str.contains("Java")); // true
        System.out.println(str.contains("java")); // false
        System.out.println(str.contains("cok")); // true
        System.out.println(str.contains("av")); // true
        System.out.println(str.contains("a")); // true
        System.out.println(str.contains(" ")); // true
        System.out.println(str.contains("")); // true
    }
}
