package InheritenceDataTypeKullanimi;

public class E_Hayvanlar {
    //Butun hayvanlarla ortak ozellikleri soyler ama bunların guncellerini soyler
    protected void hareket(){
        System.out.println("hareket ederler");
    }

    protected void solunum(){
        System.out.println("nefes alirlar");
    }

    protected void beslenme(){

        System.out.println("beslenirler");
    }

    protected void cogalma(){

        System.out.println("cogalirlar");
    }

    protected void omur(){

        System.out.println("yasar ve olurler");
    }
}
