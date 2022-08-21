package day08_ifElse;

import java.util.Scanner;

public class C03_NestedİfElse {
    public static void main(String[] args) {
        /*emeklilik kontrolü yapan bir program yazınız. E erkek, K  kadın değişkeni olarak kabul et.
    kadınlarda sınır 60 erkeklerde 65 yas sınırı, negatif yas veya 80 den büyük yas girilirse hata mesajı ver.*/
Scanner scan=new Scanner (System.in);
        System.out.println("lütfen cinsiyetinizi giriniz");
char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("lütfen yasınızı giriniz");
double yas= scan.nextDouble();
         if (cinsiyet=='E'){
             if (yas<=0 || yas>=80){
                 System.out.println("lütfen gecerli bir yas giriniz");
             } else if (yas<65) {
                 System.out.println("emekli olamazsın");
             }else  {
                 System.out.println("emekli olabilirsin");
             }


         }else if(cinsiyet=='K') {

             if (yas<=0 || yas>=80){
                 System.out.println("lütfen gecerli bir yas giriniz");
             } else if (yas<60) {
                 System.out.println("emekli olamazsın");
             }else  {
                 System.out.println("emekli olabilirsin");
             }
         }else {
             System.out.println("lütfen gecerli bir cinsiyet giriniz");
         }



















    }
}
