package Iterator_Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class iterator {
    public static void main(String[] args) {

        int[] arr = {3,5,6,2,9,7,4,0,1,3,4,2,5,6,7,2}; //bunu liste cevirelim

        List<Integer> sayilar = new ArrayList<>();
        for (Integer each:arr
        ) {
            sayilar.add(each); //each ın getirdigi sayiyi sayilara ekle
        }
        System.out.println(sayilar); // [3, 5, 6, 2, 9, 7, 4, 0, 1, 3, 4, 2, 5, 6, 7, 2]
        //loop icinde yapılan loop icinde kalır. degisen sayılar ı loop dısında yazdıramayız. Index olmadan for kullanılamaz

        // index kullanmadan sadece cift elementleri yazdirin
        for (Integer each: sayilar
        ) {
            if (each % 2 == 0){
                System.out.print(each + " ");
            }
        }
        System.out.println("");

        // index kullanmadan listenin elementlerini 2 artirin
        for (Integer each : sayilar
        ) {
            each += 2;
        }
        System.out.println(sayilar); // [3, 5, 6, 2, 9, 7, 4, 0, 1, 3, 4, 2, 5, 6, 7, 2]

        // index kullanmadan cift sayilari silin

      Iterator iterator = sayilar.iterator(); //iterator bir interface oldugu icin obje olusturulamaz.
        // Burada sayilar üzerinden obje olustururlur
        //Iteratorda 3 tane method var hasNext, next, remove

        System.out.println(iterator.hasNext()); // true yanda eleman var mı sorusunu true dondurdu.

        System.out.println(iterator.next()); // 3 (burdada madem yan tarafta bi eleman var yana gec deriz)

        System.out.println(iterator.hasNext()); // true yanında eleman var mı var

        iterator.next(); //5
        System.out.println(iterator.next()); // 6 cift oldugu icin sil deriz
        iterator.remove(); // burda 6 yi sil deriz

        System.out.println(sayilar); // [3, 5, 2, 9, 7, 4, 0, 1, 3, 4, 2, 5, 6, 7, 2] index kullanmadan 6 yı silmiş olduk
        //Bunlara tek tek bakmak zaman kaybı sacma olur. O yüzden yanında eleman oldugu
        // sürece ilerlesin demek istiyorsak while kullanırız

        while (iterator.hasNext()){ //bu true dondurdukce next le ilerleyecek
            if (((Integer)iterator.next()) % 2 == 0 ) // % ile iterator obje dondurdugu icin kullanılamaz
                // o yüzden Integara cevirdik
            {
                iterator.remove(); // 0 verirse o sayiyi sil deriz
            }
        }
        System.out.println(sayilar); // [3, 5, 9, 7, 1, 3, 5, 7]
        // ayni listede 5'ten buyuk olan sayilari silin
        // iterator olusturduktan sonra sadece ileri gidebilir
        // onceki olusturdugumuz iterator'a yaninda eleman oldukca iterator.hasNext() == true
        // ileriye git dedigimiz icin, loop'un sonunda iterator en sona ulasti
        // Eger yeniden tum elementleri, bastan itibaren taramak istersek
        // yeni bir iterator olusturmaliyiz

        iterator = sayilar.iterator();

        while (iterator.hasNext()){

            if (((Integer)iterator.next()) >5 )
            {
                iterator.remove();
            }
        }
        System.out.println(sayilar); // [3, 5, 1, 3, 5]

        // loop sonunda iterator yine en sona gitti
        // eger bir daha next() kullanirsak
        // gidecegi eleman kalmadigindan exception firlatir

        // iterator.next(); // NoSuchElementException

    }
}
