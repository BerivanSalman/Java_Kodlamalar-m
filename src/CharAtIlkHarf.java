import java.util.Scanner;

public class CharAtIlkHarf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Kullanıcından ismini soyismini ve yasını alıp şu formatta yazdırın:
        // Girilen bilgiler: B Salman, 30
        System.out.println("Lutfen isminizi giriniz: ");
        char IlkHarf = scanner.nextLine().charAt(0); // ilk harfi alır

        System.out.println("Lutfen soyisminizi giriniz: ");
        String soyad = scanner.next(); // birden fazlaysa nextline deriz

        System.out.println("Lutfen yasınızı giriniz: ");
        double yas = scanner.nextDouble();

        System.out.println("Girilen bilgiler: " + IlkHarf+" "+ soyad + "," + yas);

    }
}
