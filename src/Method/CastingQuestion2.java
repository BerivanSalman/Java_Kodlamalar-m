package Method;

public class CastingQuestion2 {
    public static void main(String[] args) {
method1(2,3);
    }
    public static void method1 (float a, int b){ //float int ten buyuk oldugundan casting yapabilir.
        System.out.println("Good"); // bu methodu kullanırsa 1 casting islemi yapar
    }
    public  static void method1 (double a, double b){ // double int degerleri casting yapabilir
        System.out.println("Bad");// bu methodu kullanırsa 2 casting islemi yapar.
    }
    //bu yüzden java 1 casting islemi yapacagı methodu tercih eder
}
