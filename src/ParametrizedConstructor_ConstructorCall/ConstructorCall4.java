package ParametrizedConstructor_ConstructorCall;

public class ConstructorCall4 {
    String isim = "John";
    int yas = 40;
     public ConstructorCall4 (){
         isim = "Seher";
         System.out.println("İsim: " + isim);
     }
     public ConstructorCall4(String isim){
         this();
         this.yas =30;
         System.out.println("İsim: " +isim);
     }
     public ConstructorCall4(String isim, int yas) {
         this ("Murat");
         this.yas = 45;
     }

    public static void main(String[] args) {
        ConstructorCall4 obj1 = new ConstructorCall4("Esra");
        ConstructorCall4 obj2 = new ConstructorCall4("Fatih", 35);
    }
    /* konsol çıktısı;
 İsim: Seher
İsim: Esra
İsim: Seher
İsim: Murat
     */

}
