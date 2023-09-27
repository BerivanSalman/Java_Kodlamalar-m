package StringManipulations;

public class IsEmpty_IsBlank {
    public static void main(String[] args) {
        String str1 = "";
        String str2 = "     ";
        String str3 = "Java";
        System.out.println(str2.isEmpty()); // false   bos mu ?

        System.out.println(str1.isEmpty()); // true icinde space yok yine de true verir

        System.out.println(str3.isEmpty()); // false


    }
}
