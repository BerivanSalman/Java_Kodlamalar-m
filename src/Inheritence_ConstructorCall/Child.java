package Inheritence_ConstructorCall;

public class Child extends Parent{
    Child(){
        System.out.println("C parametresiz ");
    }

    Child(String str){
        super(5); //Parentta int parametresi olan constructor a goturur
        System.out.println("C String ");
    }

    Child(int sayi){
        super("a");
        System.out.println("C int ");
    }

    Child(boolean bl){
        super(true);
        System.out.println("C boolean ");
    }

    public static void main(String[] args) {
        Child child4 = new Child(true);
        //GP String
        //GP int
        //GP boolean
        //P boolean
        //C boolean

        Child child3 = new Child(3);
        //GP parametresiz
        //P parametresiz
        //P String
        //C int

        Child child2 = new Child("ali");
        //GP parametresiz
        //P int
        //C String

        Child child1 = new Child();
        //GP parametresiz
        //P parametresiz
        //C parametresiz
    }

    /*
        Biz bir class'da gorunur bir constructor olusturdugumuzda
        default constructor'in silindigi
        GIBI
        eger extends kullanan bir class'daki
        herhangi bir constructor'in ilk satirina
        gorunur bir constructor call yazarsak
        Java default super() siler.
     */
}

