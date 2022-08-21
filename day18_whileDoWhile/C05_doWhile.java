package day18_whileDoWhile;

import java.util.Scanner;

public class C05_doWhile {
    public static void main(String[] args) {

/*
Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini soyleyin.
    Kullanici yanlislikla negatif sayi girerse o sayiyi dikkate almayin ve “Negatif sayi giremezsiniz” yazdirip basa donun
    Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini, yanlislikla kac negatif sayi girdigini ve
    girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
 */

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int pozSayiAdedi=0;
        int negSayiAdedi=0;
        int pozSayilarTop=0;

        do{
            System.out.println("lütfen toplamak üzere pozitif tamsayı giriniz");
            sayi= scan.nextInt();
            if(sayi>0){
                pozSayilarTop+=sayi;
                pozSayiAdedi++;
            } else if (sayi<0) {
                negSayiAdedi++;
                System.out.println("negatif sayi giremezsiniz.");

            }//0 ı else ile kontrol etmeye gerek yok bunu while kontrol ediyor.


        }while(sayi!=0); // artırma sartı koymadık ,cunku artırma sartı yok,kullanıcıdan sayıları alıyoruz.

        System.out.println(pozSayiAdedi+" adet pozitif sayi girdiniz, toplamları :"+ pozSayilarTop);
        System.out.println(negSayiAdedi+" adet negatif sayi girdiniz,onlar toplama dahil edilmedi.");
    }
}
