package day16_forLoop;

import java.util.Scanner;

public class C05_forLoop {
    public static void main(String[] args) {

        /*Soru 10 ) Kullanicidan iki sayi isteyin.
Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
sonucu yazdiran bir method yaziniz

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen başlangıc ve bitiş degerlerini pozıtıf tamsayı olarak girin");
        int bas= scan.nextInt();
        int bitis=scan.nextInt();

        aralariTopla(bas,bitis);
    }

    public static void aralariTopla(int bas, int bitis) {//sadce sonucu yazdırmak istediği için void yaptık
        int Toplam=0;
        if(bas<=bitis){ //kullanıcının önce bas. mı yoksa bitiş rakamını mı girdiğini kontrol ettık.
            for(int i=bas;i<=bitis;i++){
                Toplam+=i;
            }

        }else {
            for(int i=bitis;i<=bas;i++){
                Toplam+=i;

            }
        }
        System.out.println("aradakı sayıların toplam: " + Toplam);
    }
}
