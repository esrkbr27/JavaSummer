package day38_Exceptions;

public class C01_Exceptions {

    public static void main(String[] args) {
        /*
        Bir sorunla karsılasmayı beklediğiniz noktalarda
        if else ile sorunu yakalayıponunla ilgili çözüm üretebilirisniz.

        ama Java sorunu her zaman if else ile çözemeyecegimizden
        java try-catch blokları oluşturmuştur.
         */
        int a=10000;
        int b=500;
 int sayac=1;

 while (sayac<1000){
     /*
     java bir sayıyı 0 a böldüğü zaman hata verir, Aritmetik hata
     bu hatayı yok saymak için try catch kullanacagız.
      */

     if(b==0){
         System.out.println("islem yapılırken payda 0 oldu,dikkat etmelisiniz.");
     }
     else{
         System.out.println(a/b);
     }

     b--;
     sayac++;
 }

    }
}
