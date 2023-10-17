package StringBuilder;

public class StringBuilderQuestion5 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("OCAJP8");
        sb1.subSequence(2,4); //subSequence subStringle aynıdır o yuzden kalıcı degisiklik yapmaz
        sb1.deleteCharAt(3); // degistirir. 3. indexteki harfi siler. OCAP8
        sb1.reverse();// 8PACO
        System.out.println(sb1);// 8PACO
    }
}
