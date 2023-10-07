package ParametrizedConstructer_ConstructerCall;

public class Question2 {
    String isim = "John Doe";
    int yas = 40;
     public Question2() {
         isim = "Seher";
         yas = 38;
     }
     public  Question2 (String isim, int yas) {
         this.isim = isim;
         this.yas = 30;
     }
}
