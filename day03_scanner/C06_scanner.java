package day03_scanner;

import java.util.Scanner;

public class C06_scanner {
    public static void main(String[] args) {

        //kullanıcıdan ismini soy ismini ve yaşını alıp girilen bilgiler = ...

        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen isminizi giriniz");

        String isim= scan.nextLine();
        // string verileri scaenner ile alırken next ve next line kullanılabilir.next ilk boşluğa kadar olan kısmı yani
        //bir kelime alır. next line ise satırın sonuna kadar alır. art arda birden fazla string değer alacaksak next line
        //kullanmalıyız.

        System.out.println("lütfen soyisminizi giriniz");

        String soyisim= scan.nextLine();

        System.out.println("lütfen yaşınızı giriniz");

        double yas= scan.nextDouble();

        System.out.println("girilen bilgiler = "+ isim+""+soyisim+""+ yas);

    }
}
