package day08_ifElse;

import java.util.Scanner;

public class C04_NestedİfElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 4 basamaklı bir sayi giriniz.");
        int sayi = scan.nextInt();

        if (sayi<=1000 || sayi>9999){
            System.out.println("lütfen 4 basamaklı sayi giriniz");

            }else if (sayi%5==0) {
            if (sayi%10==0) {
                System.out.println("5 e bölünen cift sayi");
            }else if (sayi%10==5){
                System.out.println("5 e bölünen tek sayi");


        }else {
                System.out.println("5 e bölünmüyor");
            }
        }
    }
    }


