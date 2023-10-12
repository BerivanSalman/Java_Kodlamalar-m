package ArrayList_ForEachLoop;

public class ForEachLoopQuestion2 {
    public static void main(String[] args) {
        int arr[] ={1,3,5};
        int x = 0;
        for (int each:arr) { // arr ye gidip her bir elemanı getir
            x = x + each*each; // teker teker getirip çarpma ve toplamayı yaptırır
        }
        System.out.println(x); //35
    }
}
