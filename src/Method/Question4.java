package Method;

public class Question4 {
    public static void main(String[] args) {
        go();
        go(12); //int deger yok ama castingle double cevirebilir
        go(5 >=5);

    }
    public static void go(){
        System.out.println("Bad");
    }
    public static void go (double i) {
        System.out.println("Good");
    }
    public static void go (boolean b){
        if (b){ // true ise bu calısır
            System.out.println("The best");
        }
        else {// false sa bu calısır
            System.out.println("The worst");
        }
    }
}
