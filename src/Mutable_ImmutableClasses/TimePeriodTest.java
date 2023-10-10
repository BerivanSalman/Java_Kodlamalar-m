package Mutable_ImmutableClasses;

import java.time.LocalDate;
import java.time.Period;

public class TimePeriodTest {
    public static void main(String[] args) {
        LocalDate dogumTarihi = LocalDate.of(1993,01,28);
        LocalDate bugun = LocalDate.now();
        Period yasim = Period.between(dogumTarihi,bugun);
        System.out.println(yasim); // P30Y7M17D
        System.out.println(yasim.getYears()); // 30
    }
}
