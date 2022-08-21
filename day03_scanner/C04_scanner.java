package day03_scanner;

import java.util.Scanner;

public class C04_scanner {
    public static void main(String[] args) {
        //kullanıcıdan isimini ve soyismini aralarında birer boşluk bırakarak yazalım.
        // insanlarin dunyasindan kod'larimizin bulundugu class'a deger almak icin
        // Scanner class'ini kullaniriz
        // 1- Scanner objesi olusturalim.

        Scanner scan =new Scanner(System.in);

        //2.kullanıcıya ne istedigimizi söyleyelim.

        System.out.println("lütfen isminizi giriniz");

        // 3- olusturdugumuz scan objesi ile kullanicinin girdigi degeri alip
        //    olusturacagimiz uygun bir variable'a atayalim


        String kullanıcıİsmi= scan.next();

        System.out.println("Isminiz :"+ kullanıcıİsmi);

        System.out.println("lütfen soyisminizi giriniz");

        String kullanıcıSoyismi= scan.next();

        System.out.println("Soyismiz :"+ kullanıcıSoyismi);

        System.out.println("kursumuza kaydınız alınmıştır,teşekkür ederiz");

        System.out.println("Isim - soyisim :"+ kullanıcıİsmi+ " " +kullanıcıSoyismi);



    }
}
