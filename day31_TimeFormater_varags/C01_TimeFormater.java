package day31_TimeFormater_varags;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormater {
    public static void main(String[] args) {
        LocalDateTime tarihsaat= LocalDateTime.now();
        System.out.println("ilk oluşturulan tarih:"+tarihsaat);

        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/M/yy hh:mm a");
        System.out.println(dtf.format(tarihsaat)); //25/7/22 09:46

        DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("d/MMM/yyyy HH:mm a");
        System.out.println(dtf2.format(tarihsaat)); //25/Tem/2022 21:49 ÖS





    }
}
