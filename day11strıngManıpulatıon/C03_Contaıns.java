package day11strıngManıpulatıon;

import java.util.Scanner;

public class C03_Contaıns {
    public static void main(String[] args) {

        //verilen kelımenın cumlede kullanılıp kullanılmadıgını bıze dondurur.
        //true false olarak dondurur.
           /*
            Soru 1) Kullanicidan email adresini girmesini isteyin,
            mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
            @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
            @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen e mail yazınız");
        String email = scan.nextLine();

        if(!email.contains("@gmail.com")) {
            System.out.println("lütfen  gmail yazınız");
        } else if (email.lastIndexOf("@gmail.com")==(email.length()-10)) {
            System.out.println("gecerli gmaıl gırdınız");

        }else{
            System.out.println("lutfen yazımı kontrol edın");
        }
    }
}
