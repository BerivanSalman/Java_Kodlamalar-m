package Abstract_InterfacesClasses;

public class A_InterfacesFeatures {
    /*
    -Abstract class’lar abstract ve concrete method’lar bulundurabilir (partial abstraction),
    -interface’ler ise sadece abstract method’lar bulundurur (full abstraction)
    -Interface’ler child class’larin uyarlamaya mecbur oldugu abstract method’larin bulundugu bir sablon gibidir.
     -Obje olusturma amaciyla degil child class’lari bicimlendirme amaci tasir. Constructor’lari yoktur, interface’lerden obje olusturulamaz.
    -Interface ozel yapisindan dolayi icinde bulunan variable ve method’larin tamami ayni yapidadir.
    - Tum variable’lar public, static ve final’dir. Bu keywor’ler yazilsa da yazilmasa da farketmez.
    -Tum variable’lar final oldugundan olusturulurken deger atanmasi zorunludur, cunku final variable’larda sonradan deger degistirilemez.
    - Tum method’lar public ve abstract’dir. Bu keywor’ler yazilsa da yazilmasa da farketmez
    -Bir class’dan bir class’i inherit etmek istendiginde extends keyword kullanilir.
    -Class’dan Interface’i inherit etmek icin ise implements keyword kullanilir.
    -Interface’in en buyuk avantaji coklu inheritance’i desteklemesidir.
    -Bir class baska bir class’a extends ile child olup ayni zamanda implements keyword ile aralarinda
    virgul kullanarak birden fazla interface’i de implement edebilir
    -Interface bir cesit yapilacaklar listesi(to do list)dir.
    -Interface’de tamamen abstract method’lar oldugundan ve abstract method’larin body’si olmadigindan
    bir method’un nasil yapilacagini belirlemez
    -Interface mutlaka implement edilecek method’lari belirler, concrete child class’lar o method’u kendilerine
    implement ederken nasil yapacaklarini method body’sinde tanimlarlar.
    -Birden fazla Interface implement edildiginde, bu interface;lerde ayni isimde variable ve method’lar bulunabilir.
    -Java hangisini kullanacagini net bilmelidir.
    - Implement ettigimiz Interface’lerde ayni isimde variable varsa hangisinin kullanilacagini belirtmek icin static yontem yani InterfaceAdi.variableAdi yazilir.
    -Implement ettigimiz Interface’lerde ayni isimde method varsa return type’ina bakilmalidir.
    * Return type’lari ayni ise, ikisinin de body’si olmadigindan hangisinin override edildiginin bir onemi yoktur,
    * Return type’lari farkli ise, override eden method’un return type’i implement ettigi iki method’un return type’i ile
    overriding kurallari cercevesinde uyumlu olmalidir, aksi takdirde java CTE verir, kod calismaz.



     */
}
