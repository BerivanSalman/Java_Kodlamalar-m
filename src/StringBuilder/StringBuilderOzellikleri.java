package StringBuilder;

public class StringBuilderOzellikleri {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(7);
        sb.append("Ali"); //Ali yi ekler
        sb.append("Kemal");
        /*7 kapasitesi oldugu icin Aliyi ekleyince Kemali eklemeye yer yoktur ama
        Stringin kapasitesi icine koyacagımız yazıya gore sekillenir.
        StringBuilder otomatik olarak kemali de ekleyebilecegimiz buyukluge getirir.
        Formulu 2*eski kapasite+2
        //String classından uretilen Stringler immutabledir, yani degistirilemezler
        //StringBuilder classından uretilen bjeler immutabledir
        //StringBuilder ile stringBuffer aynı işi yaparlar ama StringBuffer multi thread yaptıgı icin StringBuilder daha hızlıdır

         */
    }
}
