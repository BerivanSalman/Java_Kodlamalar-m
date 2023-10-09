package Arrays;

import java.util.ArrayList;

public class Remove {
    // Eger List sayilardan olusuyorsa
    // remove(2) yazdigimizda 2'nin element mi yoksa index mi olacagini netlestirmek gerekir
    // Java bu durumu netlestirmek icin
    // sayilardan olusan list'lerde yazilan sayiyi INDEX olarak kabul eder
    // list.remove(9) bu 9. indexteki elemanı sil demektir
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list.remove(2)); //2.indexteki C yi siler
        // ve C yi sildigi icin C yi getirir
        System.out.println(list.remove("C"));//Artık C kalmadıgı icin false yazar
    }
}
