package day07_ifStatement;

import java.util.Scanner;

public class ödev_s1 { {
        //soru3) kullanıcıdan bir karakter girmesini isteyin ve olup olmadığını kontrol edin.
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char harf= scan.next().charAt(0);
        if ((harf>='a' && harf<='z') || (harf>='A' && harf<='Z')) {
            System.out.println("girilen karakter bir harf");
        }
        else {
            System.out.println("girilen karakter bir harf değil");



        }
    }


}
