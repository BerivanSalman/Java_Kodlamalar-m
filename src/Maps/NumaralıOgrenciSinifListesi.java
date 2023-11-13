package Maps;

import java.util.Map;

public class NumaralıOgrenciSinifListesi {
    public static void main(String[] args) {

        // verilen siniftaki ogrencilerin
        // numara, isim, soyisim ve subelerini yazdiran bir method olusturun

        Map<Integer,String> ogrenciMap = MapMethodDepo.okulMapDondur();

        System.out.println(ogrenciMap.get(103)); // Ali-Cem-11-K-TM
        //Get = biz ona key veririz o da bize String valueleri getirir. Key ile valueleri cagırıp hem key i hem de value i yazdırabilirz
        // key'leri bir bir ele alip
        // o key'e ait value'yu inceleriz
        // sinif uygunsa key ve valuden'den istenen bolumleri yazdiririz

        MapMethodDepo.numaraliSinifOgrenciListesiYazdir(ogrenciMap, "11"); //"11" i string olarak yazdık cunku o bir stringin parcasıdır
    }
}
