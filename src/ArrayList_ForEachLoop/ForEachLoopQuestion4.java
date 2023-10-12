package ArrayList_ForEachLoop;

public class ForEachLoopQuestion4 {
    public static void main(String[] args) {
        int arr [][] = {{1,2,3}, {4}, {5,6}};
        for (int [] w :arr){
            System.out.print(w.length+ " "); // getirdigi inner arraylerin length ini yazdırır
            //3,1,2
        }
        System.out.println(arr.length); //3
    }


}
