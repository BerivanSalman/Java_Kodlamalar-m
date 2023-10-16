package Inheritence_ConstructorCall;

public class Sınıf extends Okul {
    Sınıf( ){ //3. Parent classındaki parametresiz constructor a goturur default constructorın icinde birsey olmadıgı icin geri doner
        //super(); gizli bir super constructor methodu vardır
        System.out.println("Sınıf Constructor"); //4
        super.adresYazdir();//5  parentte aramaya gider
    } //9

    @Override
    public void adresYazdir() { //11
        System.out.println("Sınıf adres"); //12
    } //13

    public static void main(String[] args) { //1
        Sınıf obj = new Sınıf(); //2
        obj.adresYazdir(); //10 obj oldugu classla ilgilidir
    } //14
}
