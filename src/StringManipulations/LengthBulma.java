package StringManipulations;

public class LengthBulma {
    public static void main(String[] args) {
        // Length 0 dan baslamaz, karakter sayisini verir 1 den baslarız saymaya
        String str1 = "Ahmet Uzunkavaklaraltındayataruyumazoglu";
        System.out.println(str1.length()); // 40
        // son karakteri yazdırmak icin lenghth-1 deriz
        System.out.println(str1.charAt(str1.length()-1));
        // sondan 3. karakteri yazdır:
        System.out.println(str1.charAt(str1.length()-3));

        String str = "Java ogrenen issiz kalma.";
        System.out.println(str.length()); // 26
        // sondan 2.karakteri yazdirin
        // System.out.println(str.charAt(26-2)); // z
        str= "Java";
        System.out.println(str.charAt(str.length()-2)); // v
        // Kodlamada DINAMIK kod yazmak onemlidir
        // Dinamik kod input'dan bilgileri alip,
        // input degisse bile calismaya devam eden kod demektir
        // metnin son karakterini yazdirin
        System.out.println(str.charAt(str.length()-1)); // a
        str= "Java guzeldir.";
        System.out.println(str.charAt(str.length()-1)); // . verir
    }

    }

