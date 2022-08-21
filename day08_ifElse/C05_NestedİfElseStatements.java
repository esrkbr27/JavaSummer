package day08_ifElse;

import java.util.Scanner;

public class C05_NestedİfElseStatements {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir şifre girin");

        String sifre=scan.nextLine();
        char ilkHarf=sifre.charAt(0);


        if(ilkHarf>='A' && ilkHarf<='Z' ) {
            if (ilkHarf=='A'){
                System.out.println("gecerli sifre");
            } else {
                System.out.println("gecersiz sıfre");
            }

        } else if (ilkHarf>='a' && ilkHarf<='z' ) {
            if(ilkHarf=='a'){
                System.out.println("gecerli sifre");}
            else if (ilkHarf=='z') {
                System.out.println("gecersiz sifre");
            }
        }

         else {
            System.out.println("Lütfen ilk karakter icin sadece harf kullanın");
        }


    }
}
