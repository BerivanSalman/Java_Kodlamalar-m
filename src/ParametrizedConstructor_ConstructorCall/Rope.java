package ParametrizedConstructor_ConstructorCall;

public class Rope {
    public static void swing(){
        System.out.print("swing ");
    }
    public void climb(){
        System.out.print("climb ");
    }
    public static void play(){
        swing();
        //climb();
    }
    public static void main(String[] args) {
        Rope rope = new Rope();
        rope.play();
        Rope rope2 = null; // constructor olusturulmamıs
        rope2.play(); //Play static oldugu icin obje olusturulmasına gerek kalmadan play methoduna ulasıp calıstırabilirim diyor
       // rope2.climb(); climb static olmadıgı icin ulasamaz.NullPointerException verir
    }
    //ilk olarak main methoduna girer ve default constructorda rope adında obje olusturur. Instance olmadığı icin icine
    // birsey koyamıyoruz. Hemen alttaki play methodunu calıstır der. 10. satırdaki play methoduna gidip icine girince
    // 5. satırdaki swing methoduna git der. İcindeki System.out.print("swing "); bunu yazdırır.
}
