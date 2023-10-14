package AccessModifier;

public class RunnerAccessModifiers {
    public static void main(String[] args) {
        //Aynı packagede oldukları icin Protected, public and default
        // olunca goredebiliyorum deger de atayabiliyorum.
        //Child olan class default ve private olan degerlere ulasamaz.Public ve protected e ulasabilir
        AccessModifiers.marka = "Opel";
        AccessModifiers.yil = 2023;
        AccessModifiers.renk = "Kirmizi";
        AccessModifiers.maxHiz = 230;
        AccessModifiers.model = "Astra";
        AccessModifiers.fiyat = 2000;
        // C02_AccessModifier.seriNo = "123"; //Private oldugu icin bilgiye ulasamam
        // C02_AccessModifier.km = 120000;//Private oldugu icin bilgiye ulasamam
        System.out.println(AccessModifiers.marka);
        System.out.println(AccessModifiers.yil);
        System.out.println(AccessModifiers.renk);
        System.out.println(AccessModifiers.maxHiz);
        System.out.println(AccessModifiers.model);
        System.out.println(AccessModifiers.fiyat);
        // System.out.println(C02_AccessModifier.seriNo);//Private oldugu icin bilgiye ulasamam
        // System.out.println(C02_AccessModifier.km);//Private oldugu icin bilgiye ulasamam
    }
}
