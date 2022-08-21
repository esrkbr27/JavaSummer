package day07_ifStatement;

import java.util.Scanner;

public class ödev_s2 {
    public static void main(String[] args) {
        //kullanıcıdan gün baş harfini alıp günü yazdır.
         System.out.println("lütfen haftanın günlerinden birinin ilk harfini giriniz");

         Scanner scan = new Scanner(System.in);
        char ilkharf = scan.next().toLowerCase().charAt(0);


        if (ilkharf == 'p') {
            System.out.println(ilkharf + "= " + "pazar,pazartesi,persembe");
        }
       else if (ilkharf == 's') {
            System.out.println(ilkharf + "= " + "salı");
        }

        else if (ilkharf == 'c') {
            System.out.println(ilkharf + "= " + "carsamba,cuma,cumartesi");
        }
        else {
            System.out.println("lütfen gecerli bir harf giriniz");
        }

    }
}
