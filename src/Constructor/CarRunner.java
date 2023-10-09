package Constructor;

public class CarRunner {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.marka); //marka atanmamıs
        System.out.println(car1.yil); //1900
        /* Eger bir classdan obje olusturdugumuzda objenin
        tum ozelliklerini tek bir sout ile yazdırmak istersek o class'a toString()
       olusturmalısınız. Car sınıfına gidip Yukarıdaki 'Code' den Generate'i secip toStringi sec deriz
         */
        //Generate den to string  yaptıktan sonra asagıdaki özelliklere ulasabiliriz;
        System.out.println("Car1 "+ car1); //icinde degerler olmadıgı icin atanmamıs olarak yazdırdı
        // Car1  Ozellikler ==>marka :'Marka atanmamis', model :'Model atanmamis', renk :'Renk atanmamis', yil :1900, fiyat :0
        //icine degerler atarsak;
        car1.marka = "BMW";
        car1.model = "116";
        car1.yil =2010;
        car1.fiyat = 7500;
        System.out.println("Car1"+ car1); //Atanan degerlere ulasabilirz
        // Car1 Ozellikler ==>marka :'BMW', model :'116', renk :'Renk atanmamis', yil :2010, fiyat :7500
        Car car2 = new Car();
        car2.marka = "Toyota";
        car2.model = "Corolla";
        car2.renk = "Kırmızı";
        car2.yil = 2015;
        car2.fiyat = 1000;
        System.out.println("Car2" +car2);//Car2 Ozellikler ==>marka :'Toyota', model :'Corolla', renk :'Kırmızı', yil :2015, fiyat :1000
        //Constructer olusmadan obje olusturmak mumkun degildir.
        //Eger atamayı her seferinde tek tek yapmak istemezsek
        //constructer icinde yapabiliriz.
        Car car4 = new Car("Porsche","Carrera");
        //Burdaki yazılanların islenmesi icin atama yapılması lazım car sınıfında
        System.out.println(car4);
        // Car Ozellikler ==>marka :'Porsche', model :'Carrera', renk :'Renk atanmamis', yil :1900, fiyat :0

        Car car5 = new Car("Citroen","C3");
        System.out.println("Car5 : "+car5);
        // C07_Car Ozellikler ==>marka :'Citroen', model :'C3', renk :'Renk atanmamis', yil :1900, fiyat :0
       // marka, model, yil, fiyat olan araclar uretmek istiyoruz

        Car car6 = new Car("Honda","Jazz",2016,7000);
        System.out.println("Car6 " + car6 );
        // Car6  Ozellikler ==>marka :'Honda', model :'Jazz', renk :'Renk atanmamis', yil :2016, fiyat :7000
    }
}
