package StringManipulations;

public class StartsWith {
    public static void main(String[] args) {
        String str = "Java cok güzel, cok";

        System.out.println(str.startsWith("J")); // True
        System.out.println(str.startsWith("a")); // false
        System.out.println(str.startsWith("Java")); // true
        System.out.println(str.startsWith("Java cok güzel, cok")); // true
        System.out.println(str.endsWith("Java cok güzel, cok")); //true
        System.out.println(str.startsWith("")); // true
        System.out.println(str.startsWith("cok",5)); // true
        // 5. index ve sonrasi cok ile mi baslar

    }
}
