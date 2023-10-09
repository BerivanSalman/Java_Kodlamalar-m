package Mutable_ImmutableClasses;

public class StringPool {
    public static void main(String[] args) {
        //Basit şekilde olusturulduysa ve metni aynıysa true verir.
        /*
        Basit şekilde olusturulan String objeler icin Java oncelikle String poolu
         kontrol eder.Eger Poolda aynı degere sahip baska bir String varsa
         yeni obje ile eski objenin eferansını ve degerini elestirip eslestirip
        tasarrufta bulunur
         */
        //Poolda olmayanlar basit sekilde olusturulmadıkları icin true vermezler
        String str1 = "Java"; //string poola atar
        String str2 = "java";
        String str3 = "Java";//1 dekiyle aynı string poola atar
        String str4 = new String("Java" );
        String str5 = "Ja" + "va"; //1 dekiyle aynı string poola atar
        String str6 = "Ja";
        String str7 = "va";
        String str8 = str6+str7;
        // equals() sadece metne bakar
        // == ise hem metne hem de referansa bakar
        System.out.println(str1 == str2); // false
        System.out.println(str1 == str3); // true
        System.out.println(str1 == str4); // false
        System.out.println(str1 == str5); // true
        System.out.println(str1 == str8); // false
        System.out.println(str1 == "Java"); // true
    }
}
