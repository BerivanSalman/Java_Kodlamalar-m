package StringBuilder;

public class StringBuilderQuestion2 {
    public static void main(String[] args) {
        StringBuilder strBld = new StringBuilder("ceylan");
        strBld.substring(3); // lan // fakat bir degere atanmadıgı icin kalıcı değildir.
        System.out.println(strBld); //ceylan
        /*
        substring metodunu kullandığınızda, bu metot yeni bir String nesnesi döndürür
        ve orijinal StringBuilder nesnesini değiştirmez.
         Bu nedenle, strBld.substring(3) ifadesiyle döndürülen
          yeni String nesnesi hiçbir değişkene atanmadığı için kaybolur ve kullanılmaz.
         */

    }
}
