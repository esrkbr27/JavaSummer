package day08_ifElse;

import java.util.Scanner;

public class C02_İfElseStatemen {

    public static void main(String[] args) {
        // Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
        // Not’u harf sistemine cevirip yazdirin.
        // 50’den kucukse “D”,
        // 50 ye esit veya buyuk -60 dan kucukse “C”,
        // 60'a esit veya buyuk-80 'den kucuk “B”,
        // 80'e esit  veya  uzerinde ise “A”
        // gecersiz not girildiginde uyari verelim

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz");

        double not=scan.nextDouble();
        if( not<0 || not>100){
            System.out.println("lütfen gecerli bir not giriniz");

        }else if(not<50){
            System.out.println("D");
        } else if (not < 60) {
            System.out.println("C");
        } else if (not<80){
            System.out.println("B");
        }else {
            System.out.println("A");
        }
        {

        }


        // Problem :  Eylül - 2022 tarihine göre;
        // Okula Kayıt Yaptırmak İsteyen Öğrencinin KAÇ AYLIK olduğunu bularak
        // Okula kayıt yaptırıp - Yaptıramayacağının incelenmesi
        // Öğrecinin Doğduğu Yıl ve Doğduğu ay ayrı ayrı SAYI olarak giriliyor.
        // Öğrencinin yaş olarak kaç Aylık olduğunu ekrana yazdırıyoruz. ( " Öğrenci 75 Aylık"  gibi )
        // Eğer Öğrenci 70 aydan küçükse ==> " Kayıt Yaptıramaz "
        // Eğer Öğrenci 71 - 80(dahil) ay arasında ise  ==> " Veli İsteğine Bağlı Olarak Kayıt Yaptırabilir  "
        // Eğer Öğrenci 81 aydan büyükse ==> "Kayıt Yaptırmalıdır "

        Scanner scanner = new Scanner(System.in);
        System.out.println("ögrencinin dogdugu ayı rakam ile giriniz");
        int ay=scan.nextInt();
        System.out.println("lütfen ögrencinin dogdu yılı giriniz");
        int yıl=scan.nextInt();

        int aylık= (2022-yıl)*12 + (ay-9);
        System.out.println("ögrenciniz :" + aylık + "aylık");

        if(aylık<=70){
            System.out.println("Kayıt yaptıramaz");
        } else if (aylık < 80) {
            System.out.println("Veli istegine göre kayıt yaptırabilir");
        } else if (aylık>80) {
            System.out.println("Kayıt yaptırabilir");
        }else{
            System.out.println("lütfen gecerli bir ay, yıl giriniz");
        }
        {

        }
    }




    }

