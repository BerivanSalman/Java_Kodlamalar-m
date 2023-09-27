package StringManipulations;

public class ReplaceAll {
    public static void main(String[] args) {
        // NOT: replaceAll ile char kullanamayız
    String str = "990087J1a5v**&^%$8a +/can809--=7dir_";
    // metindeki sayi ve karakterleri temizleyip
    // sadece harflerden olusan "Java candir" sekline donusturun
    // tum sayilari yok edelim;
    str = str.replaceAll("\\d", ""); //"" hiclik yaparız yani yok eder
    // space'i korumak icin, space yerine bir rakam atayalim
        //  rakama atamadaki amac space i yok etmemek;
    str= str.replaceAll("\\s","5");
    // ozel karakterleri yok edelim;
    str = str.replaceAll("\\W","");
    // W harf,rakam ve _ 'yi degistirmez
    // _'yi de yok etmek istersek alttaki satiri yazabiliriz
    str = str.replaceAll("_" ,"");
    // space yerine yazdigimiz sayiyi, yeniden space yapalim
    str = str.replaceAll("5"," ");
        System.out.println(str);
   }
}
