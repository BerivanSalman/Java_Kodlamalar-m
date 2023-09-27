package Method;

public class CastingQuestion1 {
    public static void main(String[] args) {
method1(1.2,3); //1.2 sonunda f yazmadıgı icin double dır. Double bir degeri float olarak kullanamayacagımız
        // icin( cunku float doubledan kucuktur) direkt double olan methodu tercih ederiz
    }
    public static void method1 (float a, int b){
        System.out.println("Good");
    }
    public  static void method1 (double a, double b){// int i double bir degerde kullanabiliriz double genis cunku
        System.out.println("Bad");
    }
}
