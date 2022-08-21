package day38_Exceptions;

import java.io.FileInputStream;

public class C02_Exceptions {
    public static void main(String[] args) {
        int a=10000;
        int b=500;
        int sayac=1;

        while(sayac<1000){
            /*
            try blogu yapmaya calıştıgımız ama risk oldugunu düşündüğümüz işlemleri
            yazmak için kullanılır.

            catch den sonraki parantez karsılaşmayı beklediğimiz Exception
            türünü javaya söylemek için kullanılır

            catch bloğu ;Javaya söylediğimiz istisnai durum
            gerçekleşirse Java'nın yapmasını istediğimiz işlem

            catch blogunun önündeki paranteze karsılaşmayı beklediğimiz
            exceptionı yazabilir veya her türlü exceptionda devreye
            girmesini istiyorsak tüm exceptionların parentı olan
            Exception yazabiliriz.
                         */

            try {
                System.out.println(a/b);
            } catch (ArithmeticException e) {
                System.out.println("DİKKAATT!..");
            }

            b--;
            sayac++;


    }



    }
}
