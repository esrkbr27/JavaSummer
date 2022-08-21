package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        /*kullanıcıdan iki sayı alıp bu sayıların çarpımını yazdırın.*/
     // 1. adım
        Scanner scan=new Scanner(System.in);

        //2. adım bilgi ver
        System.out.println("lütfen ilk sayıyı girin");

        //3.adım scan objesini alalım

        double sayi1= scan.nextDouble();

        System.out.println("lütfen 2. sayıyı giriniz");

        double sayi2= scan.nextDouble();

        System.out.println("girilen sayıların çarpımı :" +sayi1*sayi2);



    }
}
