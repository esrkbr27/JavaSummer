package day07_ifStatement;

import java.util.Scanner;

public class C06_ifElseStatements {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen yasınızı griniz");

        int yas = scan.nextInt();

        if (yas < 65) {
            System.out.println("emekli olamazsın ,calışmalısın" +" "+ (65 - yas) + "yil daha calısmalısın");
        } else {
            System.out.println("emekli olabiirsin");
        }
    }
}
