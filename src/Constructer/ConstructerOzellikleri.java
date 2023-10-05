package Constructer;

public class ConstructerOzellikleri {
    //Bir constructer calısmadan bir obje olusturulup
    // ilk deger ataması yapılamaz.
    //Aynı classı kullanarak farklı constructerlarla ilk olusturulma ozellikleri farklı olan objeler uretebiliriz
    //Eger objemizin standart ürünlerden olusmasını istemiyorsak
    //parametreli constructerlar kullanırız

    //Method overloadingde oldugu gibi signaturesi farklı olmak
    // sartıyla bir sürü constructerlar olusturulabilir

    //Bana triko üret. Hicbir özellik belirtilmemiş, standart ürün yollarız
    //YildizTriko(); // parametresiz

    //Bana mavi triko üret. Tamam mavi olmasını saglarım ama diger ozellikleri kendimizde var olanlardan kullanırız
    //YildizTriko("mavi");

    //Bana mavi ve bogazlı yaka triko uret
    //YıldizTriko("mavi", "bogazlı");

    //Kendi ürünümüzü ne kadar spesifiklestirmek istiyorsak basta soylemeliyiz

}
