package StringBuilder;

public class StringBuilderQuestion3 {
    public static void main(String[] args) {
        StringBuilder strBld = new StringBuilder("ceylan");
        strBld.insert(0, "S");//S yi basa sıkıstır diyor Sceylan olur
        System.out.println(strBld); //Sceylan degisiklik kalıcı oldu
        /*
        insert metodunu kullandığınızda, bu metodun geri döndürdüğü
        StringBuilder nesnesi, orijinal StringBuilder nesnesini değiştirir
         */

    }
}
