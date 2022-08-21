package day03_scanner;

import java.util.Scanner;

public class C09_scannerödev {

    public static void main(String[] args) {

        //Kullanıcıdan iki tamsayı alıp bunların toplamını farkını çarpımını hesaplayın

        System.out.println("lütfen bir sayi giriniz");

        Scanner scan= new Scanner(System.in);

        int sayi1= scan.nextInt();

        System.out.println("lütfen bir sayı daha giriniz");

        int sayi2= scan.nextInt();

        int toplam= sayi1+sayi2;

        System.out.println("girdiginiz sayıların toplamı : "+ toplam);

        int fark= sayi1-sayi2;

        System.out.println("girdiginiz sayıların farkı : " + fark);

        int carpım= sayi1*sayi2;

        System.out.println("girdiginiz sayıların carpımı " + carpım);

        //kullanıcıdan bir kenar uzunluğu alıp karenin çevresini ve alanını hesaplayın.

        System.out.println("lütfen karenin bir kenar uzunluğunu giriniz");

        int kenar= scan.nextInt();

        int cevre= 4* kenar;

        int alan= kenar* kenar;

        System.out.println("karenin cevresi: " + cevre);

        System.out.println("karenin alanı :"+ alan);

        System.out.println("lütfen cemberin yarıcapını giriniz");

   double yarıcap= scan.nextDouble();

      double ccevre=2* 3.14* yarıcap;

      double cemberalan= 3.14* yarıcap*yarıcap;

        System.out.println("cemberin cevresi :" + ccevre);
        System.out.println("cemberin alanı :"+ cemberalan);

        System.out.println("dikdörtgenler prizmasının kısa kenarını giriniz");
        int kısak= scan.nextInt();

        System.out.println("uzun kenarı giriniz");

        int uzunk= scan.nextInt();

        System.out.println("yüksekliğini giriniz");

        int yükseklik= scan.nextInt();

        int dkalan= kısak* uzunk* yükseklik;

        System.out.println("dikdörtgenler prizmasının alanı : "+ dkalan);

    }
}
