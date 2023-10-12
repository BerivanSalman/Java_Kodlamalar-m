package Varargs;

public class VarargsQuestion3 {
    public static void main(String[] args) { //main methoda girince 11. satıra yonlendirir
        new VarargsQuestion3().nameIt(1,"java");

        VarargsQuestion3 obj = new VarargsQuestion3();
        obj.nameIt(2,"java","guzeldir");  //a ya 2 b ye de java ve guzeldir degerlerini atar

    }
    public void nameIt(int a, String... b){  // burda a ya 1 degerini String arrayine(array dememizin
        // sebebi birden fazla urun alması) java degerini atar. Sout yapınca;
        System.out.println(b[b.length-a]+ " "); //b.length 1 dir cunku java tek bir elemandır. a degeri de 1 di.
        //1-1 = 0 be b[0] olur. b[0] indexindeki eleman javadır ve konsola java yazdırır. Sonra 7. satıra gider
        //8.satırın sout u : b.length = 2, a =2   2-2 = 0   ve b[0] olur ve b[0] indexindeki eleman javadır ve konsola java yazdırır
    }
}
