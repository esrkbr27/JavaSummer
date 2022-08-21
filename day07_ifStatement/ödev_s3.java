package day07_ifStatement;

import java.util.Scanner;

public class ödev_s3 {
    public static void main(String[] args) {
        //kullanıcıdan bir tamsayı isteyin tek mi çift mi yazdırın

        Scanner scan= new Scanner (System.in);
        System.out.println("lütfen bir sayı giriniz");
        int sayi=scan.nextInt();
        if (sayi%2==0) {
            System.out.println("girilen sayi : cift");
            if (sayi%2==1) {
                System.out.println("girilen sayi : tek");
            }
        }

    }
}
