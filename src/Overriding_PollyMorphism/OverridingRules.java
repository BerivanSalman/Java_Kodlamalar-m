package Overriding_PollyMorphism;

public class OverridingRules {
    //static, final ve private methodlar override edilemez.
    //Final: bu son hali kimse degistirmesin demek oluyor
    //Child classdaki overriding methodun access modifier ı parent
    // classdakinden daha dar olamaz
    /*Parent classdaki methodun return type ı void veya
    primitive ise classda da return type aynı şekilde olmalıdır
     */
    /*
    Parent classdaki methodun return type ı non primitive ise ya aynı olmalı
    ya da Parent-Child iliskisi olmalı. Covariant ata turu: İki data turunun birbiri
    arasında pareent child ilişkisi olması anlamına gelir.IS-A relationship ile
    kontrol edilebilirMesela Object ise diğeri de String olabilir
    String is an object. Arada is a relationship varsa tamamdır
     */
    /* herhangi bir obje icin ya overriding method veya overridden method calisir
   EGER hem cogalırlar hem de yumurtayla cogalırlar diye ikisinin de calismasini isterseniz
   overriding method'un icine super.overriddenMethod() yazabilirsiniz
     */

}
