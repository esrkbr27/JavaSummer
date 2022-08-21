package day17_NestedForLoop;

import java.util.Scanner;

public class C08_whıleLoop {
    public static void main(String[] args) {
        //kullanıcıdan toplamak üzere sayılar alın,sayıların toplamı 500 ü gecince sayıların toplamını ve kac sayı toplan
        //dıgını soyle yazdır:

        // 13 sayi girdiniz ve toplamları: 567

        int toplam=0;
        int sayi=0;
        int sayac=0;

        Scanner scan = new Scanner(System.in);
       while(toplam<500
       ){
           System.out.println("lütfen toplamak için sayı girin.");
           sayi= scan.nextInt();
           toplam+=sayi;
           sayac++;
       }
        System.out.println(sayac+ " sayı girdiniz ve toplamları "+toplam);
    }
}
