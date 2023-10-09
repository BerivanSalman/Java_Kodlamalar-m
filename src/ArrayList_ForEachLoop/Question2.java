package ArrayList_ForEachLoop;

import java.util.ArrayList;

public class Question2 {
    public static void main(String[] args) {
        ArrayList<Character>list = new ArrayList<Character>();
        for (char i = 'a'; i <= 'e'; i++) {
            list.clear(); //once listenin ici bos oldugu icin sil yapmaz. 'a' yı
            // ekledikten sonra onu siler. 'b' yi siler
            list.add(i); //buraya gelince 'a' yı ekler once. Sonra 'b' yi ekler
        }
        System.out.println(list);//[e] en son bu kalır
    }
}
