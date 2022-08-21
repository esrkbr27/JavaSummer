package day30_Immutable_date;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CO7_Period {
    public static void main(String[] args) {
        //iki tarih arasındakı süreyi bulma

        LocalDate tarih1= LocalDate.of(1989, Month.APRIL,27);
        LocalDate bugun= LocalDate.now();

        Period period= Period.between(bugun, tarih1);
        System.out.println(period);
    }
}
