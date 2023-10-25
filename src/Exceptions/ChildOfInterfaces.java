package Exceptions;

public class ChildOfInterfaces implements InterfaceIstisnaiDurum {
    //InterfaceIstisnaiDurum interfacesine default ve static methodlar olusturdugumuz icin
    //buraya uyarlamak zorunda degiliz. O yüzden class ismi kızarmadı
    public static void main(String[] args) {
        System.out.println(InterfaceIstisnaiDurum.methodIstisna2()); //44
       // InterfaceIstisnaiDurum.methodIstisna() static olmadıgı default oldugu icin static main method icinde onu cağıramayız
        //Sadece obje olusturarak cagırabiliriz
        ChildOfInterfaces obj = new ChildOfInterfaces();
        obj.methodIstisna(); // boyle cagırabildik
    }
}
