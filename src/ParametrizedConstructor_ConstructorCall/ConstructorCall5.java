package ParametrizedConstructor_ConstructorCall;

public class ConstructorCall5 {
    int x = 1;
    static int y; //deger verilmedigi icin class olusturunca nul olan 0 degerini atar. Y 0 dır.
    //Static classlar 1 kere olusturulur
    ConstructorCall5(int i) {
        x = x + i;
        y = y + i; //ilk callda i 5 oldugu icin  0+5 ten y= 5 olur. İkinci callda i 7 oldugu icin ve y degeri static oldugu icin
        //ilk cağırıldıgında kalıcı olan 5 e 7 degerini atar. 5+7 = 12
    }

    public static void main(String[] args) {
        ConstructorCall5 obj1 = new ConstructorCall5(5);
        System.out.println(obj1.x + " " +obj1.y);
        ConstructorCall5 obj2 = new ConstructorCall5(7);
        System.out.println(obj2.x+" "+obj2.y);
    }

}
