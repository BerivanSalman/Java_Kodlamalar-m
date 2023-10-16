package Inheritence_ConstructorCall;

public class GrandParent {
    GrandParent() {
        //Burda super yok cunku extends yok
        System.out.println("GP parametresiz ");
    }

    GrandParent(String str) {
        System.out.println("GP String ");
    }

    GrandParent(int sayi) {
        this("b");
        System.out.println("GP int ");
    }

    GrandParent(boolean bl) {
        this(5);
        System.out.println("GP boolean ");
    }
}
