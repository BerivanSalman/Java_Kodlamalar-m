package Arrays;

public class Question2 {
    public static void main(String[] args) {
        // Verilen String bir array'de
        // istenen harfi iceren elementleri yazdirin
        String [] isimler = { "Huseyin","Mehmet","Esra","Ercan","Omer"};
        String istenenHarf = "a";
        for (int i = 0; i < isimler.length ; i++) {
            if (isimler[i].contains(istenenHarf)){
                System.out.print(isimler[i] + " ");
            }
        }
    }
}
