package Overriding_PollyMorphism;

public class PollyMorphism {
    //Aynı isimdeki bir methodu farklı farklı sonuclar uretecek sekilde kullanabiliriz
    /*- Overloading static pollymorphism
    ==>Aynı classda aynı isimde farklı signaturelara sahip methodlar
     olusturmaktadır. Overloading olmasi icin ismin ayni olmasi gerekir,
     dolayisiyla farkli method’lar olusturabilmek icin
     parametre sayisi, farkli data turu kullanimi ve/veya
     farkli data turundeki parametrelerin siralamasi degistirilebilir.
     Java bu methodlardan hangisinin kullanilacagina, method call sirasinda kullandigimiz argument’lere gore karar verir.
     - Argument’ler ile parametrelerin %100 ortustugu method varsa onu kullanir.
     - %100 ortusen method bulamazsa casting ile kullanabilecegi method’lara bakar.
     - Casting ile kullanabilecegi method sayisi birden fazla ise en az casting yaparak kullanabilecegini tercih eder.
    /- Overriding dinamik pollymorphism;
    -Mutlaka farklı classlarda olmalı ve inheritence olup Parent-Child ilişkisi olmalı
    -Overriding icin parent ve child class’lar birlikte dusunulmeli, objenin data turu ve constructor’i farkli olmalidir
    -Overriding icin parent ve child class’lardaki method’lar ayni isim ve signature’a sahip olmalidir.

     */
}
