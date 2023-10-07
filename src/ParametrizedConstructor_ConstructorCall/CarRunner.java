package ParametrizedConstructer_ConstructerCall;

public class CarRunner {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println("Car1" + car1); //Car1 Ozellikler ==>marka :'Marka atanmamis', model :'Model atanmamis', renk :'Renk atanmamis', yil :1900, fiyat :0
        car1.marka = "BMW";
        car1.model = "116";
        car1.yil =2010;
        car1.fiyat = 7500;
        System.out.println("Car1" + car1);//Car1 Ozellikler ==>marka :'BMW', model :'116', renk :'Renk atanmamis', yil :2010, fiyat :7500
        //Bu atamayı constructer kendisi yapabilir. Ornegin  marka,model ve renk degerlerini parametre olarak
        //yollayabilecegimiz bir constructor olusturalim.

        Car car2 = new Car("Nissan","Micra","Mavi");
        System.out.println("Car2"+car2);
        // Car2 Ozellikler ==>marka :'Nissan', model :'Micra', renk :'Mavi', yil :1900, fiyat :0

        // marka,model,renk ve fiyat parametreleri olan
        // bir constructor olusturun
        Car car4 = new Car("Peugeot","206","Turuncu",5000);
        System.out.println("Car4"+car4);
        // Car4 Ozellikler ==>marka :'Peugeot', model :'206', renk :'Turuncu', yil :1900, fiyat :5000


    }
}
