package Inheritence_ConstructorCall;

public class Parent extends GrandParent {
    Parent(){
        //super()
        System.out.println("P parametresiz ");
    }

    Parent(String str){
        this(); //this bu class icindeki parametresiz constructora gorurur yani satır 4 e. Burda super yoktur sadece bir constructor olması yeterlidir
        System.out.println("P String ");
    }

    Parent(int sayi){
        //gizli super() var
        System.out.println("P int ");
    }

    Parent(boolean bl){
        super(false);
        System.out.println("P boolean ");
    }
}
