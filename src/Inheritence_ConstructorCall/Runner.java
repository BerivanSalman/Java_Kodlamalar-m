package Inheritence_ConstructorCall;

public class Runner {
        public static void main(String[] args) {

          HerChild child = new HerChild();

            System.out.println(child.sayi); // 25
            System.out.println(child.yas); // 20

            child.method1();// Child method1
            child.method2(); // Parent method2

    }
}
