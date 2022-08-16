package day30_immutable_date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {
    public static void main(String[] args) {
        // iki tarih arasindaki sureyi bulma

        LocalDate tarih1 = LocalDate.of(1994,11,30);
        LocalDate bugun = LocalDate.now();

        Period period = Period.between(tarih1, bugun);
        System.out.println(period); // P-27Y-7M-23D

        System.out.println(period.getYears()); // 27
    }
}
