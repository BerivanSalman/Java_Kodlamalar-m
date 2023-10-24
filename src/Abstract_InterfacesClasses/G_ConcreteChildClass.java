package Abstract_InterfacesClasses;

public class G_ConcreteChildClass extends F_AbstractParent {
     /*
    Bir abstract zincirden sonra gelen ILK CONCRETE CLASS

    abstract KALAN TUM METHOD'lari implement ETMEK ZORUNDADIR
    -m1 abstracttı ama Parent classında concrete oldu.
    -m4 zaten concreteydi
    -m2, m3, m5 ve m6 yı abstract oldukları icin implement etmek(concrete yapmak) zorundayiz
    */


    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

    @Override
    public int method5() {
        return 0;
    }

    @Override
    public String method6() {
        return null;
    }

}
