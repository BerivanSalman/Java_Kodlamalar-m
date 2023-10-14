package Inheritence;

public class Auris extends Toyota{
        public static void main(String[] args) {

        /*
            bir class baska bir class'a extends ile child olursa
            o class ve o class'in parent class'larindaki tum ozelliklere
            OTOMATIK olarak sahip olur

            child class
            isterse parent classlardaki ozellikleri sahiplenir
            isterse o bilgileri gunceller
            isterse de parent class'larda olan ozelliklere ilave olarak
                    kendi spesifik ozelliklerini ekleyebilir

            Child class ne kadar guncelleme yaparsa
            ozellikleri o kadar kendisine uyarlamis olur.

            Ozellikleri kendisine uyarlamazsa
            parent class'in butun child class'lari kapsayan
            DAHA GENEL ozelliklerini sahiplenmis olur

         */

            Auris auris1 = new Auris();
            System.out.println(auris1.marka); // T Toyota
            System.out.println(auris1.model); // Car atanmamis
            System.out.println(auris1.renk); // Car atanmamis
            System.out.println(auris1.yakit); // Car atanmamis
            System.out.println(auris1.uretimYeri); // T Japonya veya Turkiye
            System.out.println(auris1.sanziman); // T otomatik veya manuel
            System.out.println(auris1.lastik); // T Pirelli
            System.out.println(auris1.guvenlik); // T Toyota.....
            System.out.println(auris1.aku); // T Aku atanmadi
        }
}
