package ParametrizedConstructor_ConstructorCall;

public class ReadConstructer {
    private int sayi; //verilmediği icin java default degerler atar int icin 0
    boolean bl;//verilmediği icin java default degerler atar boolean icin false
     public ReadConstructer(){
         this.sayi= 11;
         this.bl = false;
     }

    public static void main(String[] args) {
        ReadConstructer obj1 = new ReadConstructer();
        System.out.println(obj1.sayi);
    }
}
