package StringManipulations;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        //Soru 1 : Kullanicidan bir cumle alin
        //          - cumlede ev geciyorsa, "home home sweet home" yazdirin
        //          - cumlede is geciyorsa, "calismak guzeldir"
        //          - ikisini de iceriyorsa "Hem ev lazim hem is"// önce ikisini de birden icerene bakmamız lazım
        //          - hicbirini icermiyorsa "cok calisman lazim" yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scanner.nextLine();
        String buyukCumle = cumle.toUpperCase();// boyle ayrı bir degiskende cumleyi uppercase yazdırmak daha kullanıslı
        if (buyukCumle.contains("EV") && buyukCumle.contains("IS")){
            System.out.println("Hem ev lazim hem is"); //isyerimiz dev gibi ikisini de iceriyor
        } else if (buyukCumle.contains("EV")) { //dev kampanya
            System.out.println("home home sweet home");
        } else if (buyukCumle.contains("IS")) {
            System.out.println("calismak guzeldir");
        }else {
            System.out.println("cok calisman lazim");
        }
    }
}
