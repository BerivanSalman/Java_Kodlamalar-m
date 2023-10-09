package ArrayList_ForEachLoop;

import java.util.ArrayList;

public class Question1 {
    public static void main(String[] args) {
        int arr [] = new int[5]; // [0, 0, 0, 0, 0]
        ArrayList<Integer>list = new ArrayList<Integer>();
        for (int i = 1; i <= arr.length ; i++) {
            list.add(i);
        }
        System.out.println(list); //[1, 2, 3, 4, 5]
        //For la listeye ekleme yaptıgı icin köseli parantez var



    }
}
