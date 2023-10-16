package Inheritence_ConstructorCall;

    public class C_Corolla extends B_Toyota {
        /*Corolla bir Toyota modelidir. Extends Toyata dememizin sebebi hem Car icindeki hem de
        Toyota icindeki ozelliklere ulasabilmek. Cunku Toyota Car icindeki ozelliklere sahiptir
         */

        String model = "Corolla";
        String uretimYeri = "Turkiye";
        //GrandParenttan model ve uretim yerini guncelledik

        String lastik = "Pirelli Sakarya";
        String aku = "Inci aku";
        String guvenlik = "safe drive";
        // Parenttan da aku, lastik ve guvenligi guncelledik

        String tekerCapi = "19 inc";
        String bagajHacmi = "200 litre";
        /*
        Corolla(){  gizli DEFAULT constructerdır. Diyor ki ben calısmaya baslamadan once git PARENT taki constructor ı getir
            super(); once parent'daki parametresiz cons. calistir
        }
         */

        public static void main(String[] args) {
            C_Corolla corolla1 = new C_Corolla(); //getirmeye en guncel olandan baslar

            System.out.println(corolla1.marka); // T Toyota
            System.out.println(corolla1.model); // Co Corolla
            System.out.println(corolla1.renk); // Car renk atanmamis
            System.out.println(corolla1.yakit); // Car yakit atanmamis
            System.out.println(corolla1.uretimYeri); // Co Turkiye
            System.out.println(corolla1.sanziman); // T otomatik veya manuel
            System.out.println(corolla1.lastik); // Co Pirelli Sakarya
            System.out.println(corolla1.guvenlik); // Co safe drive
            System.out.println(corolla1.aku); // Co Inci aku
            System.out.println(corolla1.tekerCapi); // Co 19 inc
            System.out.println(corolla1.bagajHacmi); // Co 200 litre
            /*
            Bir obje olusturuldugunda ilk deger ataması(initialization)
            mutlaka CONSTRUCTER calısmalıdır. Child classda olusturulan bir objenin  parentclass(lardaki )
            ozellikleri de tasıması icin parent class(lardaki) CONSTRUCTOR larda CALISMALIDIR
             Java bunun icin ozel bir konsept olusturmustur

            Java'nin olusturulan her class'a
            obje olusturulmasina izin vermek icin
            DEFAULT CONSTRUCTOR koydugu gibi,

            AYNI SEKILDE
            extends kullanan her class'da olusturulan
            HER CONSTRUCTOR'in ilk satirina da
            super() koyar.
             */
        }
}
