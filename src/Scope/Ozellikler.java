package Scope;

public class Ozellikler {
    // hangi satırlarda CTE vardır ve düzeltilmesi gerekir?
    //variablelerin scopları nedir demek nerelerde kullanılır demektir. Mesela butun class scope olabilir
    static String str;
    String tell = "03123454354";
    public static void main(String[] args) {
        Ozellikler obj = new Ozellikler();
        //System.out.println(tell); Merhod static fakat variable instance oldugu icin java kullanmasına izin vermez
        obj.str= "Java ne güzel"; // str static oldugu icin obj uzerinden kullanmamıza gerek
        // yoktu fakat kullansak da java itiraz etmez
        int sayi = 15;
        method2(sayi); // static bir method oldugu icin static main methodunun icinde cagrılabilir
        //method1(); staic olan main methodun icinde static olmayan bir methodu cagıramazsın
    }
    public void method1(){
        tell= "03124324343"; // ikisi de instance oldugu icin kullanilabilir
        String isim = "John Done";
        boolean dogruMu;
        int sayi;
    }
    public static void method2(int sayi){//
        str= str+" "; // static oldugu icin kullanabiliriz
        //tell = tell.substring(1);// method static oldugu icin static olmayan tell i burda kullanamayız
        //int sayi= 10;// aynı scope da aynı isimle 2 kere deklare yapılmaz
    }
}
