package day18_whileDoWhile;

import java.util.Scanner;

public class C04_doWhileLoop {
    public static void main(String[] args) {

        /*
        kullanıcıdan tamsayılar alın,
        kullanıcı cıft sayı girdiği müddetce sayıları yazdır,
        tek sayı girdiğinde işlemi bitir.
         */
        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        //while loopla yaparsak.
        /*
        looplarda kullanacagımız varıablelları looptan önce oluşturmalıyız.
        while loopta, looptan önce oluşturduğumuz bu varıablea atayacagımız degeri iyi düşünmek gerekir.

         */

        while (sayi % 2 == 0) { //burda ilk deger 0 olarak yazılmaz

            System.out.println("lütfen bir sayi giriniz");
            sayi = scan.nextInt();
            //    System.out.println("girilen sayi cift :"+ sayi);//buraya yazarsam sayıyı kontrol etmeden yazar,sonra kontrol eder.
            if (sayi % 2 == 0) {
                System.out.println("girilen sayi cift :" + sayi);
            } else {
                System.out.println("girilen sayi tek, benden bu kadar..");
            }
        }


        /*
        do WhileLoop ile yapacak olursak;ilk atadıgımız degerin hiçbir önemi yok cunku kullanıcıdan alacagız.,
        kodumuz her durumda calışır.
        dezavantajı ilk calıştırma kontrol yapılmadan oldugu için loopun bodysinde yanlış bir işlem yapılmamasına dikkat
        etmek gerekir.
         */

        do {
            System.out.println("lütfen bir sayi giriniz");
            sayi = scan.nextInt();
            //    System.out.println("girilen sayi cift :"+ sayi);//buraya yazarsam sayıyı kontrol etmeden yazar,sonra kontrol eder.
            if (sayi % 2 == 0) {
                System.out.println("girilen sayi cift :" + sayi);
            } else {
                System.out.println("girilen sayi tek, benden bu kadar..");

            }
            ;
        }while (sayi % 2 == 0);
    }
}
