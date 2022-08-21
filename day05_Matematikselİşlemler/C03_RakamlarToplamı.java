package day05_Matematikselİşlemler;

import java.util.Scanner;

public class C03_RakamlarToplamı {
    public static void main(String[] args) {

        //kullanıcıdan 4 basamaklı bir sayı alın ve rakamları toplamını bulun.
        System.out.println("lutfen 4 basamakli pozitif bir sayı giriniz");
        Scanner scan=new Scanner(System.in);

        // girilen sayıyı bir variabla atadık.
        int sayi= scan.nextInt(); //5267



        //birler basamagını bulup rakamlar toplamı kabına koymam gerek
        // rakamlar toplamını bir yerde tutmak için variable oluşturmam lazım.
        //başalngıçta 0 değerini atayarak (etkisiz eleman olduğu için) boş bir kap oluşturmuş oldum
        int birlerbasamagı=0;
        int rakamlartoplamı=0;
        int ilkgirilensayi=sayi;

        //şu anda sayi 5267 bb=0 rt=0

        birlerbasamagı= sayi%10; //şu an 7 yi buldum. birler basamağı= 7
        rakamlartoplamı+=birlerbasamagı; //rakamlartoplamı artık 7 (7+0) oldu.

        sayi/=10; //sayıyı 10 a bölüp sayıya atadım
                  //sayi şu anda 526 oldu.

        birlerbasamagı=sayi%10; // şu an sayi 526 , birler basamağı 526%10= 6 oldu.
        rakamlartoplamı+=birlerbasamagı; // rakamlar toplamı artık (7+6=13)oldu

        sayi/=10; //526/10=52 sayi şu an 52 oldu.
        birlerbasamagı=sayi%10; // 52/10 kalan 2 birler basamağı 2 oldu
        rakamlartoplamı+=birlerbasamagı; //rakamlar top artık (13+2=15) oldu.

        sayi/=10; //sayi= 5 /10=5 sayi=0 oldu
        birlerbasamagı=sayi%10;// birler basamagı 5 oldu
        rakamlartoplamı+=birlerbasamagı; // rakm top= (15+5=20) oldu.

        System.out.println("sayınızın rakamları toplamı : "+ rakamlartoplamı);











    }
}
