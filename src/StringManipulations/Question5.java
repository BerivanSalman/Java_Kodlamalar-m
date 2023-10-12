package StringManipulations;

public class Question5 {
    public static void main(String[] args) {
        String s= "purr";
        s.toUpperCase();// buyuk harfe cevirir ama sadece bu satırda
        s.trim(); //trim yapar ama sadece bu satırda
        s.substring(1,3);//ur yazdırır ama sadece bu satırda
        s += " two"; // basında bir bosluk var. purr two icine koyar
        System.out.println(s.length());//8

    }
}
