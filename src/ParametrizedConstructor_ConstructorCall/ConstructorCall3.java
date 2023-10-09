package ParametrizedConstructor_ConstructorCall;

public class ConstructorCall3 {
    String isim = "John";
    int yas = 40;
    public ConstructorCall3 (){
        isim = "Seher";
    }
    public ConstructorCall3(String isim, int yas){
        this();
        this.yas = yas;
    }

    public static void main(String[] args) {
        ConstructorCall3 obj1 = new ConstructorCall3();
        ConstructorCall3 obj2 = new ConstructorCall3( "Fatih", 35);
        System.out.println("İsim: " +obj1.isim + " Yas: " + obj2.yas); //İsim: Seher Yas: 35

    }
}
