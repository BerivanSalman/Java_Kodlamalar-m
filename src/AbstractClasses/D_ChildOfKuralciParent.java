package AbstractClasses;

public class D_ChildOfKuralciParent extends A_KuralciParent {
    //İcine kuralci parentlarda bulunan methodları implement etmediğimiz zaman 3. satır hata veriyor.
    //Parent classda olan tum methodları icine koymamız gerek
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
