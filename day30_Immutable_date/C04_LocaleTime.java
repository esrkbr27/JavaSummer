package day30_Immutable_date;

import java.time.LocalTime;

public class C04_LocaleTime {
    public static <LocaleTime> void main(String[] args) throws InterruptedException {
        LocalTime time1=LocalTime.now();
        System.out.println(time1);
        /*
        Bizim oluşturduğumuz date veya time canlı saat veya tarih değildir.
        LocalTime.now() kullandıgımız satırda o ankı tarıh veya saatı alıp
        bizim varıablea store eder.
        time1 variable ın degeri sabittir.
         */

        Thread.sleep(3); //3 saniye bekletir calıstırmayı

        time1=LocalTime.now();
        System.out.println(time1);

        time1.getSecond();
        System.out.println(time1.getSecond());
        System.out.println(time1.plusSeconds(1000000));
        System.out.println(time1.minusMinutes(2000000));


    }
}
