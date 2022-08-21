package day07_ifStatement;

import java.util.Scanner;

public class ödev_s5 {
    public static void main(String[] args) {
        //kullanıcıdan aldıgınız günleri
        // cuma=kutsal gün   cumartesi.. pazar=..yazdır

        System.out.println("lütfen bir gün giriniz");
        Scanner scan=new Scanner(System.in);
        String gün=scan.next().toLowerCase();


             if (gün.equals("cuma"));{
                System.out.println("Müslümanlar için kutsal gün");
            }
               if (gün.equals("cumartesi")); {
            {
                System.out.println("Yahudiler için kutsal gün");
            }
             if (gün.equals("pazar"));{
                System.out.println("Hristiyanlar için kutsal gün");
            }







        }
    }
}
