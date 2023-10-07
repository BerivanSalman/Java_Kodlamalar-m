package ParametrizedConstructer_ConstructerCall;

public class Question1_Runner {
    public static void main(String[] args) {
        Question1 obj = new Question1("Fatih", 35);
        System.out.println("İsim: " + obj.isim +
                " Yas: " + obj.yas); //İsim: Fatih Yas: 30
        // once main methoduna gidilir. Olusturulan objeye bakılır
        // İsim ve yas parametreleri isteyen bir constructor var mı diye bi bakar.
        // Sonra constructor ın icine girmeden direkt objeyi olusturur
        //İnstance olarak verilmiş olan variablelerin bir kopyasını olusturur.
        //isim = John Doe
        //yas = 40;
        //scopedaki this.isim 'i görünce John Doe yi siler ve isime fatihi koyar.
        //this.yas = 30 ;olarak yazıldıgı icin constructor un parametresinde 35 yazması farketmez
        //Yaşı 30 olarak kabul eder.
    }
}
