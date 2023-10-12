package StringBuilder;

public class StringBuilderMethodsQuestion {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1,"bb").insert(4,"ccc");
        /*
        sb ye aaa yı ekler
        sonra 1. index e bb yi koy der ve abbaa olur
         daha sonra 4.indexe ccc yi koy der ve abbaccca olur
         */
        System.out.println(sb);//abbaccca
    }
}
