package ParametrizedConstructor_ConstructorCall;

public class ConstructorCall2 {
    ConstructorCall2(){
        this("Java");
        System.out.println("Parametresiz constructor calisti");
    }
    ConstructorCall2(int sayi){
        System.out.println("int parametreli constructor calisti");
    }
    ConstructorCall2(String metin){
        //ConstructorCall(); // Method Call Syntax'i oldugundan Java bu isimde method arar
        this(6); // constructor call syntax'i boyledir
        // constructor adini degil this(istenen parametreler) yazariz
        System.out.println("String parametreli constructor calisti");
    }
    public static void main(String[] args) {
        //ConstructorCall2 obj1 = new ConstructorCall2("A");

        ConstructorCall2 obj2 = new ConstructorCall2();
}
    }
    //Main methodu calısır. Constructor parametresiz oldugu icin 4. satırdaki constructora gider ve constructora girmeden once
//obje olusturur. Instance olmadıgı icin bi deger atayamaz. Scopeun icine girer 5.satırla karsılasır. 5. satır der ki metin parametresi
//alan constructora git. 11. satırdaki metin parametresi alan constructor a gider. Icıne girince 13. satırdaki this(6) yı gorur. Int
// parametresi olan constructora git der. 10. satırdaki constructora gider. ve 9. satırdaki " System.out.println("int parametreli
// constructor calisti");" yazdırır. Sonra geldiği yere doner ve 15. satırdaki "System.out.println("String parametreli
// constructor calisti")" yazdırır. Geldiği yere doner ve 6. satırdaki  "System.out.println("Parametresiz constructor calisti");"
//yazdırır. Geldiği yere geri doner. Ve dongu biter


