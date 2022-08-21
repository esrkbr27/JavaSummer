package day38_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exceptions {
    public static void main(String[] args) {

        /*
        Marketteki tüm ürünleri bir arrayde tuttugumuzu varsayalım
        Kullanıcıya index sorup o indexdekiürünü yazdıran bir
        program hazırlayalım.
        Kullanıcı ürün sayisindan büyük bir index girerse exception
        vermesinin önüne gecelim.

         */

        String[] urunler = {"Nutella", "cokokrem", "süt", "cay", "fındık"};

        Scanner scan;


        int istenenIndex=0;
        boolean kontrol = true;

        while (kontrol) {

            try {//bu kısım risk oldugunu düşündüğümüz yer
                scan=new Scanner(System.in);
                System.out.println("istediğiniz ürünün sira nosunu giriniz.");
                istenenIndex = scan.nextInt();
                kontrol=false;

            } catch (
                    InputMismatchException deneme) {//yakalanacak exception türünü yazdığımız yer,exceptionı içine koyacagımız varıable
                System.out.println("urun indexi için bir tamsayı girmeniz gerekli");//problem yakalandıgında ne yapacagız
              //  System.out.println(deneme);

            }

        /*
        catch blogunun önündeki parantezde exception classının ismi ve yaninda yakalanan
        exceptionı atadıgımız varıbaleın ismi olur.(e)

        Eger yakalanan exception ile ilgili bilgileri
        kullanıcıya vermek isterseniz bu objeyi kullanabilirisniz.
        eger exception ile ilgili kullanıcıya bilgi verme ihityacı
        yoksa "e" kullanılmasa da kod calışır.
         */

            try {
                System.out.println("Aradiginiz urun : " + urunler[istenenIndex-1] );
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Girdiginiz sira listemizde bulunmuyor" +
                        "\nSira numarasi en fazla : " + urunler.length  + " olabilir" );
            }

        }
    }
}