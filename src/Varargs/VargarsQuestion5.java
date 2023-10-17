package Varargs;

public class VargarsQuestion5 {
    public static void main(String[] args) {

    }
    public void methodA(int i, int j, int... k){
        System.out.println(k.length);
    }
    //methodA(1,2,3,4,5); denirse i ye 1, j ye 2, 3,4,5 de k ya konulur. k =[3,4,5]
    //k.length denildiğinde de 3 yazdırır
    //methodA {1,2} dersek de i ye 1, j ye 2 degerini yazar k ya da 0 kalır. [0]
}
