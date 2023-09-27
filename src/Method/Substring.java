package Method;

public class Substring {
    public static void main(String[] args) {
guncelle("john", "black");
    }
    public static void guncelle (String s, String t){
        s = s.substring(0,1).toUpperCase() + t.substring(2); //2. indexten itibaren yazdir
        System.out.println(s); // jack
    }
}
