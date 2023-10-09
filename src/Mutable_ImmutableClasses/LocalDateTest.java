package Mutable_ImmutableClasses;

import java.time.LocalDate;

public class LocalDateTest {
    //Local Date classındaki özellikleri kullanmak icin obje olusturmamız gerek
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.plusWeeks(10)); //10 hafta sonra ne olacak
        System.out.println(localDate.plusMonths(4).plusDays(5));//4 ay 5 gun sonra ne olacak
        System.out.println(localDate.minusYears(3).minusMonths(2).minusDays(2));
        //3 yıl 2 ay once 2 gun  once tarih neydi
        System.out.println(localDate.withMonth(2));
        //Şuanki gecerli tarihin 5. ayını yazdırır.2023 ama 2. ay
        System.out.println(localDate.withDayOfYear(200));
        // yıl 2023 ama 200. günü yazdırır
        System.out.println(localDate.isLeapYear()); //2023 gecmiş bi yıl mı? false or true yazdırır
        LocalDate dogumTarihi = LocalDate.of(1993,02,23);
        LocalDate dogumTarihi2 = LocalDate.of(2000,02,23);
        System.out.println(dogumTarihi.isLeapYear()); //true
        System.out.println(dogumTarihi.isBefore(dogumTarihi2)); //true
        System.out.println(dogumTarihi.isAfter(dogumTarihi2));// false
        System.out.println(localDate.lengthOfYear());//365
        System.out.println(localDate.getMonth());//icinde bulundugumuz ayı getirir. OCTOBER


    }
    }

