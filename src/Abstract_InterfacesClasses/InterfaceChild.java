package Abstract_InterfacesClasses;

public interface InterfaceChild  extends H_Interface {
     /*
        Bir interface baska bir interface'e child olabilir mi ?

        extends keyword kullanarak OLUR

        bir interface baska bir concrete class veya abstract class'a CHILD OLAMAZ
     */
    /*
    public class  K_ChildOfInterfaces extends ZorlamaSevmeyenParent implements H_Interface, J_Interface {
    extends deyip bi class da secebiliriz
     bir class istedigi kadar interface'i implement edebilir

     Bir class sadece 1 class'a extends edebilir
     AMA istedigi kadar interface'i IMPLEMENT edebilir. Bu buyuk bir avantajdır. Interface
      kullanarak bulundurulması gereken ozellikleri koyarak ihtiyacımız oldugunda o paketi alabiliriz
  */
    /*
    method1 her ikisinde olsa da, ikisi de void oldugundan
    hangisini implement ettigimizin bir onemi yok.
       // birden fazla interface'i implement ettigimizde
        // birden fazla interface'de ayni isimde method varsa
        // EGER return type'lari ayni ise sorun yok,
        // ama return type'lar farkli ise bir karar vermemiz gerekir
        //  - ya iki interface'den birini implement etmekten vazgececegiz
        //  - veya mumkunse o interface'lerde degistirme yapacagiz
          // interface'lerdeki tum variable'lar final oldugundan, sonradan deger atanamaz
     */

}
