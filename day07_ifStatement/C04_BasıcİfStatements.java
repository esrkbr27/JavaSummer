package day07_ifStatement;

import java.util.Scanner;

public class C04_BasıcİfStatements {

    public static void main(String[] args) {

        //kullanıcıdan gün ismini alın ve haftaici veya hafta sonu olarak yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir gün ismi giriniz");
     //girilen günü kullanıcı nasıl yazacagını bilmdigimiz için toLowerCase metodunu kullanarak hepsini küçük yazdirmış
        // olacagız.
        String girilenGun= scan.next().toLowerCase();//aldıgını küçük hafe cevir oyle ata.

        if(girilenGun.equals("pazar") || girilenGun.equals("cumartesi")) {
            System.out.println("hafta sonu");
        }

        if(girilenGun.equals("cuma") || girilenGun.equals("perşembe")|| girilenGun.equals("carsamba")||
        girilenGun.equals("salı") || girilenGun.equals("pazartesi")) {

        System.out.println("hafta ici");}

        if(!(girilenGun.equals("cuma") || girilenGun.equals("perşembe")|| girilenGun.equals("carsamba")||
                girilenGun.equals("salı") || girilenGun.equals("pazartesi") ||
                girilenGun.equals("pazar") || girilenGun.equals("cumartesi"))) {

            System.out.println("lütfen gecerli bir gün giriniz");


        }







    }
}
