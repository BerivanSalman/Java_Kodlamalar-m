package WrapperClasses;

public class Wrapper {
    public static void main(String[] args) {
        // non-primitivelerde metotlar vardır kullanılabilir.
        // primitivede hazır metot kullanmak istiyorsak;

        int sayi1 = 20;
        Integer sayi2 = 30;

        sayi1 = sayi2; //boyle yapabiliriz gecislerde sıkıntı yasamaz.

        char chr1 = 'c';
        Character chr2 = chr1;

        Boolean bl = true;
        Short shr = 3;
        Double dbl = 3.5;
        Float flt = 2.3f;

        System.out.println(Integer.MIN_VALUE); // metotları cagırabiliriz artık.

        String str1 = "34";
        String str2 = "45";
        // str1 ve str2 yi matematiksel olarak toplayin.
        System.out.println(str1+str2); //3445
        System.out.println(Integer.parseInt(str1)+ Integer.parseInt(str2)); // 79
// str1 ve str2 sadece sayilardan olustugu icin boyle yapabiliriz

        str1 = "34a";
        str2 = "23";
        //System.out.println(Integer.parseInt(str1)+ Integer.parseInt(str2));// hata verir

        chr1 ='a';
        System.out.println(Character.isDigit(chr1));// false
        System.out.println(Character.isLetter(chr1)); // true

        //Soru: int olarak verilen bir sayiyi String e nasıl ceviririz?

        String metin = 23 + ""; // 23 un yanına hiçbirsey ekleriz
        System.out.println(metin);// 23 doner.



    }
}
