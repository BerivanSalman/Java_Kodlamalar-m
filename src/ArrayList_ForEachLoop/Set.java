package ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class Set {
    //Var olanı sil verileni yaz onun yerine
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Can");
        list.add("Ayse");
        list.set(1,"Havva");
        System.out.println(list);//[Ali, Havva, Ayse]

    }
}
