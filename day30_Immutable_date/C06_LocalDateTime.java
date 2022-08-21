package day30_Immutable_date;

import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();

        System.out.println(tarihSaat);

        System.out.println(tarihSaat.plusMonths(3).plusHours(100));

        System.out.println(tarihSaat.minusMinutes(100).minusHours(12));

        System.out.println(tarihSaat.getDayOfMonth());

        System.out.println(tarihSaat.toLocalDate());


    }
}
