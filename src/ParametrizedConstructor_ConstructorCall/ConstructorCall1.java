package ParametrizedConstructor_ConstructorCall;

public class ConstructorCall { //bir constructor icinde iki tane constructor call yapamazsın

    ConstructorCall(){

        System.out.println("Parametresiz constructor calisti");
    }
    ConstructorCall(int sayi){
        System.out.println("int parametreli constructor calisti");
    }
    ConstructorCall(String metin){
        //ConstructorCall(); // Method Call Syntax'i oldugundan Java bu isimde method arar
        this(6); // constructor call syntax'i boyledir
        // constructor adini degil this(istenen parametreler) yazariz
        System.out.println("String parametreli constructor calisti");
    }
    public static void main(String[] args) {
        ConstructorCall obj1 = new ConstructorCall("A");
    }
    //Once main methodunun ici calısır. Metin A'yı alır ve icinde String parametresi veren 12. satırdaki constructora gider.
    //Icıne girmeden once objeyi olusturur. Ama instance olmadıgı icin icine birsey koyamaz. 14. satıra gelir ve this(6) yı gorur
    //Int parametresi olan constructora git der. 9. satıra gider ve ordaki bos inte 6 sayısını koyar. Scopeun icine girer
    //10. satırsaki "System.out.println("int parametreli constructor calisti")" calısır. Sonra geldiği yere donup 16. satırdaki
    //"System.out.println("String parametreli constructor calisti")" calısır.
    /*
    Konsolda;
    int parametreli constructor calisti
   String parametreli constructor calisti
     */
}
