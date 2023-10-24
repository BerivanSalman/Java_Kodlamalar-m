package Abstract_InterfacesClasses;

public class D_ChildOfKuralciParent extends A_KuralciParent {
    //İcine kuralci parentlarda bulunan methodları implement etmediğimiz zaman 3. satır hata veriyor.
    //Parent classda olan tum  abstract methodları icine koymamız gerek. Public olarak değiştirilirse
    // bu classın icindeki abstract methodlarda puclic olmalıdır
    //Abstract bir class’i parent edinen concrete class’lar, abstract class’da abstract
    // olarak tanimlanmis tum method’lari override etmek zorundadir.

    @Override
    public void method1() {

    }

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


}
