package day30_Immutable_date;

import java.time.LocalDate;
import java.time.Month;

public class C03_Date {
    public static void main(String[] args) {

        LocalDate tarih= LocalDate.now();
        /*
        bir obje oluşturdugumuzda new keywordu kullandık.
        bazen new yerine bir metotla oluşturabiliriz.
        burda localDate.now() metodu ile oluşturduk


         */

        System.out.println(tarih); //2022-07-23
        System.out.println(tarih.getDayOfYear()); // bugun yılın 204.günü
        System.out.println(tarih.getDayOfWeek()); //SATURDAY
        System.out.println(tarih.getMonthValue());//7
        System.out.println(tarih.isLeapYear()); // "is" ile baslayan metotlar true veya false döndürür.
                                                //artık yıl mı

        LocalDate tarih2=LocalDate.of(2001,5,15);//2001-05-15
        System.out.println(tarih2);

        LocalDate tarih3=LocalDate.of(1989, Month.APRIL,27);
        System.out.println(tarih3);

        System.out.println(tarih.plusDays(100));//100 GÜN SONRAKI TARİH
        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(9));//2027-11-01

        System.out.println(tarih.minusWeeks(20));//20 hafta önce2022-03-05
        System.out.println(tarih.minusWeeks(45).minusMonths(3).minusDays(23));

        System.out.println(tarih.isAfter(tarih2));

        //iki farklı dogum gunu girildiginde hangısının daha buyuk aldugunu bulunuz.
        //tarih2 ve tarih3 u karsılastır.

        if(tarih2.isAfter(tarih3)) {
            System.out.println(tarih3+"tarıhınde dogan daha buyuk");
        } else if (tarih2.isBefore(tarih3)) {
            System.out.println(tarih2+"tarıhınde dogan daha buyuk");
        }else{
            System.out.println("iki tarih biribiri ile aynı");
        }


    }
}
