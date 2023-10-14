package AccessModifier;

public class AccessModifiersFeatures {
    public String marka ; //access modifier==> public
    public int yil; //  access modifier==> public

    protected  String renk;
    protected int maxHiz;

    String model; //access modifier==> default aynı zamanda package private de default demektir
    int fiyat; // access modifier==> default
    /*
    Gorunur bir access modifier yoksa Default access modifier gecerlidir
     */
    private String seriNo;
    private int km;
    // Private AccessModifier =  sadece kendi classımızdan kullanabiliriz
    //Default AccessModifier = Sadece classımızdan ve icinde bulundugumuz package dan kullanabiliriz
    //Protected AccessModifier= Sadece classımızdan, icinde bulundugumuz package dan  ve baska classlardaki child classlardan erişilebilir
    //Public AccessModifier= Halka acık
    /*
    AccessModifierle sınırladıgımız bir elemente ulasan onu
    istediği gibi kullanır.
    Deger de atayabilir o degeri alıp kullanadabilir.
    Bu yüzden erişimi ne kadar dar yaparsak o kadar iyi sadece
    mutlaka erismesi gerekenlere
     izin vermeliyiz. Public yapıp herkesin degistirmesine
     kullanmasına izin vermemeliyiz gerekli olmadıkça
     */
    public static void main(String[] args) {


    }
}
