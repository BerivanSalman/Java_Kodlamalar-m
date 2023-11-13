package Maps;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<Integer, String> ogrenciMap = new HashMap<>();
        //Keyleri Integer, Valueları String tutar o yuzden maps e oyle yazdık
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");

        System.out.println(ogrenciMap);

        // {
        //    101=Ali-Can-11-H-MF,
        //    102=Veli-Cem-10-K-TM,
        //    103=Ali-Cem-11-K-TM,
        //    104=Ayse-Can-10-H-MF,
        //    105=Sevgi-Cem-11-M-TM,
        //    106=Sevgi-Can-10-K-MF
        //                          }
        System.out.println(ogrenciMap.size()); // 6
        //Virgule kadar olan kısmı sadece bir string olarak kabul eder


        System.out.println(ogrenciMap.keySet());//[101, 102, 103, 104, 105, 106] keyleri yazdırdı. Keylerimiz Integer

        System.out.println(ogrenciMap.values()); //Stringlerden olusan bir collection getirir
        //[Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF]
        //Valueleri dondurdu

        // verilen sube'deki ogrencilerin isim ve soyisimlerini yazdiran bir method olusturun

        MapMethodDepo.subeListesiyazdir(ogrenciMap,"k");
    }
    }

