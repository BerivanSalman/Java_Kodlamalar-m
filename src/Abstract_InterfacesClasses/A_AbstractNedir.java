package Abstract_InterfacesClasses;

public class A_AbstractNedir {
    /*
    Child class olmazsa abstract classın bi anlamı olmaz.
    Abstract class icinde tanımlanan method Private olarak tanımlanamaz. Tanımlanırsa biz nasıl kullanacapız onu
    Abstract class ve interface’ler obje olusturmak icin degil, SADECE child class’larini,
 parent’da belirlenen method’lari kendilerine uyarlamaya mecbur etmek icin kullanilir.
Abstraction (soyutluk) bir mecburiyet degil, islerimizi duzenlememize yarayan bir kolayliktir.Beni parent edinmek istiyorsan su su özelliklere uymalısın.
Eger bir class child class’larinda MUTLAKA OLMASI GEREKEN method’lari belirlemek istiyorsa abstraction kullanilir.
Java’da abstraction kullanabilecegimiz iki yapi vardir. Starbucks ı dusun hepsi aynı urunlerı satmak ve kullanmak zorunda
Sıfırdan hazırlamaya gerek yoktur herseyi
1- Abstract Classes (Partial abstraction)==>sunları sunları kullanmak zorundasın ama istemiyorsan bunları kullanmak zorunda olmayabilirsin.
//Kahveyi dondurmayı benden almak zorundasın ama peçeteyi benden almak zorunda degilsin
2- Interfaces(Full abstraction) hicbirseyi dısardan alamazsın
Abstraction daha cok methodlarla ilgileniz.
Abstraction istediğimiz methodları zorlayarak kullandırtmak icin olusturulmustur.
Mesela Yıldız hastanesindeki Personel bilgileri olan insan kaynaklarını dusun. Orda maas, izin, emekli gibi methodlar vardır.
Bu parent clası olan İnsan Kaynakları doktor, hemsire gibi childları bunyesinde bulunan  methodları kullanmaya zorlar

Inheritence kullanarak child classları parent classdaki methodları override etmeye mecbur bırakamazsınız
Kural : Abstract class’lar class olduklari icin constructor’lari vardir ama abstract
class’lardan obje olusturulamaz.Final ve private method’lar override edilemeyecekleri icin, abstract method’lar final veya private olarak tanimlanamaz.
NOT: Abstract class’lar obje olusturmak icin degil, concrete child class’larinin sahip olmasi gereken ozellikleri tanimlamak icin olusturulur.

     */
}
