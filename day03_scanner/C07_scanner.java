package day03_scanner;

import java.util.Scanner;

public class C07_scanner {
    public static void main(String[] args) {

        //bir önceki soruyu tek seferde kullanıcıdan tüm bilgileri alarak yapınız.

        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen isminizi, soyisminizi ve yasınızı giriniz \naralarında enter tuşuna basın ");

        // komut cümlesi uzun olunca \n yazarak alta devam edebiliriz.

        String isim=scan.nextLine();
        String soyisim= scan.nextLine();
        int yas=scan.nextInt();

        System.out.println("girilen bilgiler = "+isim+ " "+soyisim+ " " +yas);

    }
}
