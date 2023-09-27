package StringManipulations;

public class Question2 {
    public static void main(String[] args) {
        //Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        //          input1 : “15.35 €” , input2 : “11.40 €”
        //          output : 26.75 €
        String fiyatStr1 = "15.35 €";
        String fiyatStr2 = "11.40 €";
        System.out.println(fiyatStr1 + fiyatStr2); // 15.30 €11.40 € stringleri yanyana yazdırır
        // O yüzden bu stringleri int e donusturmemiz lazım
        int fiyat1 = Integer.parseInt(fiyatStr1.replaceAll("\\D",""));// sayı dışındaki herseyi kaldırırız
        int fiyat2 = Integer.parseInt(fiyatStr2.replaceAll("\\D",""));
        System.out.println("Toplam fiyat : " + (double)(fiyat1+fiyat2)/100 + " €");

    }
}
