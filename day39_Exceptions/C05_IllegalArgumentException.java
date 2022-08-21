package day39_Exceptions;

import java.util.Scanner;

public class C05_IllegalArgumentException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Yasinizi Giriniz...: ");
        int yas = scan.nextInt();

        try {
            if(yas < 0) {
                /*
                Bazen kendimiz kod yazarken exveption fırlatmasını isteriz
                Bu durumda "throw new IllegalStateException" keywordu ile
                istediğimiz satırda exception fırlatıp kodu durdurabiliriz

                 */
                throw new IllegalArgumentException();//java.lang.IllegalArgumentException

            }
            else{
                System.out.println("Yasinizi Giriniz");
                yas = scan.nextInt();
            }
        } catch (IllegalArgumentException e) {
               e.printStackTrace();//at day39_Exceptions.C05_IllegalArgumentException.main(C05_IllegalArgumentException.java:19)
            System.err.println("yas 0 dan küçük olamaz.");//yas 0 dan küçük olamaz.
            //System.err.println(") yazınca istediğimiz hata mesajını kırmız yazılı olarak verebiliriz.

        }
    }
}
