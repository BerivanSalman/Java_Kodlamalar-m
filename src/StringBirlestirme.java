public class StringBirlestirme {
    public static void main(String[] args) {
        // string yanına geldigi variableyi stringlestirir.
        String str = "Java";
        int sayi = 10;
        System.out.println(str + sayi); //Java10 doner. String bir degerdir.

        String aa = "Hello";
        String bb = "World";
        System.out.println(aa + " " + bb);

        String a  = "Hello";
        int b = 2;
        int c = 3;
        System.out.println(a+b+c);//Once string var o yüzden toplama yapmaz
        System.out.println(c+b+a); //5Hello once yanyana olan intleri toplar
        System.out.println(a+ (b+c));//Hello5 once parantez icini yapar
        System.out.println(a+b*c);//Hello6 once carpmayı yapar

        String s1 = "Java";
        String s2 = "Kolaydir";
        String s3 = " ";
        String s4 = "";
        int d = 4;
        int e = 3;
        // sadece verilen variable'lari kullanarak asagida istenen metinleri yazdirin
        // Java Kolaydir 12
        System.out.println(s1+s3+s2+s3+d*e);
        // Java7Kolaydir
        System.out.println(s1+(d+e)+s2); // Java7Kolaydir
        // 43Java
        System.out.println(s4 + d + e + s1); // 43Java
        System.out.println(d + (e + s1)); // 43Java



    }
}
