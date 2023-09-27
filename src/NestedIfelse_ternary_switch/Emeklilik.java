package NestedIfelse_ternary_switch;

import java.util.Scanner;

public class Emeklilik {
    public static void main(String[] args) {
        // kullanicidan yasını ve cinsiyetini alin
        // Kadin 60 yas ve uzeri, erkek 65 yas ve üzeri emekli olabilir.
        // Cinsiyet ve yasını dikkate alarak "Emekli olabilirsin
        // ve ya emekli olmak icin ."...yil daha calisman gerek" yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz E: Erkek K:Kadin");
        char cinsiyet = scanner.next().toUpperCase().charAt(0); // kullanici nasil girerse girsin, buyuk harfe cevirir
        System.out.println("Lutfen yasinizi giriniz");
        double yas = scanner.nextDouble();
        if(yas < 20 || yas >80 || !(cinsiyet == 'E' || cinsiyet == 'K')){
            System.out.println("Girilen bilgilerde hata var");
        } else if (cinsiyet == 'E' && yas >=65){
            System.out.println("Erkek emekli olabilir");
        } else if (cinsiyet == 'E' && yas<65) {
            System.out.println("Erkek emekli olmak icin daha " + (65-yas) + " yil calismalidir.");
        } else if (cinsiyet =='K' && yas >= 60) {
            System.out.println("Kadin emekli olabilir");
        }else {
            System.out.println("Kadin emekli olmak icin daha " + (60-yas) + " yil calismalidir.");
        }
    }
    }

