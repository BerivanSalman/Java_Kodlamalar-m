package MultiDimensionalArray;

public class TümElementleriToplama {
    public static void main(String[] args) {
        // Verilen bir MDA'deki tum sayilari toplayip, toplami yazdiran bir method olusturun
        int[][] arr = {{1,4,7},{3,5},{1,9,0,8},{2}};
        arraydekiElementleriTopla(arr); // Array'deki tum sayilarin toplami : 40
        arraydekiElementleriTopla(new int[][]{{4,6,7},{1,2}}); //bi daha yukarda eleman tanımlamak istemeden
        // int olusturmak istersek icine new int yazmalıyız. Array'deki tum sayilarin toplami : 20
    }
    public static void arraydekiElementleriTopla(int[][] arr){
        int toplam = 0 ;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                toplam += arr[i][j];
            }
        }
        System.out.println("Array'deki tum sayilarin toplami : " + toplam);
    }
}
