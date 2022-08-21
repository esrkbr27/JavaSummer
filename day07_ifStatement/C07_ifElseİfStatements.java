package day07_ifStatement;

import java.util.Scanner;

public class C07_ifElseİfStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen yasınızı griniz");

        int yas = scan.nextInt();

        if (yas<0) {
            System.out.println("lütfen gecerli bir yas giriniz");
        } else if (yas<65) {
            System.out.println("emekli olamazsın, " + (65 - yas) + "yıl daha calışmalısın");
        } else {
            System.out.println("emekli olabilirsin");

        {

        }
    }


    }
}
