package StringManipulations;

public class IndexOf {
    public static void main(String[] args) {
        // sadece indexOf da -1 doner
        //String icerisinde aradıgımız bir string ya da degerin hangi indexte gectigini söyler
        String str = "Java cok guzel, cok.";
        System.out.println(str.indexOf('a')); // 1
        // buldugu ilk a nın index degerini verir.
        System.out.println(str.indexOf('a', 2)); //3
        // 2.indexten sonra a arar
        System.out.println(str.indexOf("cok"));// 5
        System.out.println(str.indexOf("zel")); //11

        String str2 = "Java cok zevkli, her ders Java gibi olsa";
        // strdeki ilk 3 'a' harfinin indexlerini yazdırın;
        int ilkIndex = str2.indexOf('e');
        System.out.println("İlk index: " + ilkIndex);
        int ikinciIndex = str2.indexOf('a',ilkIndex+1); // ilk index dersek ordan baslayacagı icin hep ordakini yazdırı
        System.out.println("İkinci index: " + ikinciIndex);
        int ucuncuIndex = str2.indexOf('a',ikinciIndex+1);
        System.out.println("Ucuncu index: " + ucuncuIndex);
        // eger aradıgımız harf yoksa -1 doner
        System.out.println(str2.indexOf('q')); // -1

        String str3 = "Java candir, Selenium heyecan.";
        // str Selenium iceriyor mu ?
        System.out.println(str.contains("Selenium")); // true
        // str Selenium ile mi bitiyor ?
        System.out.println(str.endsWith("Selenium")); // false
        // str Selenium ile mi basliyor ?
        System.out.println(str.startsWith("Selenium")); // false
        // Peki bu Selenium nerede ?
        System.out.println(str.indexOf("Selenium")); // 13
        // olmayan bir metin aratilirsa
        System.out.println(str.indexOf("x")); // -1
        System.out.println(str.indexOf('q')); // -1
        System.out.println(str.indexOf("a")); // 1
        // contains() kullanmadan str'in java icerip icermedigini yazdirin
        if (str.indexOf("java") == -1){
            System.out.println("false");
        }else{
            System.out.println("true");
        }
        // str'daki ilk a harfinin index'ini yazdirin
        System.out.println(str.indexOf("a")); // 1
        // str'daki ikinci a harfinin index'ini yazdirin
        System.out.println(str.indexOf("a", 2)); // 3- 2. indexten arama yapmaya baslar
        // str'daki 3. a harfinin index'ini yazdirin
        System.out.println(str.indexOf("a",4)); // 6
        // str'da 4. a varsa index'ini yazdirin
        // yoksa "str sadece 3 tane a iceriyor" yazdirin
        if (str.indexOf("a",7) == -1){
            System.out.println("str sadece 3 tane a iceriyor");
        }else{
            System.out.println("4. a'nin index'i : " + str.indexOf("a",7));
        } // 4. a'nin index'i : 27
        // str'da 5. a varsa index'ini yazdirin
        // yoksa "str sadece 4 tane a iceriyor" yazdirin
        if (str.indexOf("a",28) == -1){
            System.out.println("str sadece 4 tane a iceriyor");
        }else{
            System.out.println("5. a'nin index'i : " + str.indexOf("a",28));
        }

    }
}
