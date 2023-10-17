package Varargs;

public class VargarsQuestion4 {
    public static void main(String[] args) {

    }
    public int blMethod(boolean b1, boolean... b2){
        return b2.length;
        // return un 2 olması icin blMethod(true, false, true) olması lazım.
        // İlk true yu boolean1 e koyar diğer ikisini de boolean2 ye koyar. [false, true]
        //length i de boylece 2 olur
    }
}
