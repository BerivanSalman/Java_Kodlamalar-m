package ArrayList_ForEachLoop;

public class ForEachLoopQuestion3 {
    public static void main(String[] args) {
        int arr[] [] = {{1,2}, {3}, {4,5,6}};
        int sum = 0;
        for (int[] each : arr) { // arr ye gidip her bir inner array i  getirir. once {1,2} yi, sonra {3}, sonra da {4,5,6} yı getirir
            for (int z : each) {// z de each deki her bir int i getirecek. Mesela once 1 i sonra 2 yi sonra 3 u....getirir
                sum = sum+z;
            }
        }
        System.out.println(sum); //21
    }
}
