package StringBuilder;

public class StringBuilderQuestion4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5 + 7 + "Java" + 4 + 5); //12Java45
        String isim = "Mesut";
        sb.append(isim,2,4); //Mesut kelimeninin 2. ve 3. indexi olan su yu  12Java45 in sonuna ekler. 4. index dahil degildir
        //12Java45su olur
        sb.delete(4,6); //4 dahil 6 dahil degil. 4. ve 5. indexleri silecek. 12Ja45
        System.out.println(sb);//12Ja45
    }
}
