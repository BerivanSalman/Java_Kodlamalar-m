package Constructer;

public class ConstructerOzellikleri {
    //Methodlara benzerler ama return typeları yoktur
    //İsimleri mutlaka class ismi ile aynı olmalıdır. Ve buyuk
    // harfle baslar
    //Static olarak tanımlanamazlar
    //Method overloadingde oldugu gibi signaturesi farklı olmak
    // sartıyla bir sürü constructerlar olusturulabilir
    //Bir constructer calısmadan bir obje olusturulup
    // ilk deger ataması yapılamaz.
    //Aynı classı kullanarak farklı constructerlarla ilk olusturulma ozellikleri farklı olan objeler uretebiliriz
    //Eger objemizin standart ürünlerden olusmasını istemiyorsak
    //parametreli constructerlar kullanırız



    //Bana triko üret. Hicbir özellik belirtilmemiş, standart ürün yollarız
    //YildizTriko(); // parametresiz

    //Bana mavi triko üret. Tamam mavi olmasını saglarım ama diger ozellikleri kendimizde var olanlardan kullanırız
    //YildizTriko("mavi");

    //Bana mavi ve bogazlı yaka triko uret
    //YıldizTriko("mavi", "bogazlı");

    //Kendi ürünümüzü ne kadar spesifiklestirmek istiyorsak basta soylemeliyiz

}
