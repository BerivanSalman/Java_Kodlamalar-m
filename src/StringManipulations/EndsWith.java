package StringManipulations;

import java.util.Scanner;

public class EndsWith {
    public static void main(String[] args) {
        String str = "Java cok guzel, cok.";
        System.out.println(str.endsWith("cok")); // false: cok. ile biter
        System.out.println(str.endsWith("cok.")); // true
        System.out.println(str.endsWith("")); // true

        // kullanicidan bir mail alin	-
        // mail @ icermiyorsa "gecersiz mail"
        // mail @gmail.com icermiyorsa, "mail gmail olmali"
        // mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var" yazdirin.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen mail adresinizi girin: ");
        String mail = scanner.nextLine();
        if (!mail.contains("@")) {
            System.out.println("Gecersiz mail");
            if (!mail.contains("@gmail.com")) {
                System.out.println("Mail gmail olmalıdır");
            }
            if (!mail.endsWith("@gmail.com")){
                System.out.println("Mailde yazim hatasi var");
            }

        }

    }
}
