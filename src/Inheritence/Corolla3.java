package Inheritence;

    public class Corolla3 extends Toyota2 {
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
        //Tekercapı ve bagajHacmini de yeni özellik olarak ekledik
        public static void main(String[] args) {
            Corolla3 corolla1 = new Corolla3(); //getirmeye en guncel olandan baslar

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


        }
}
