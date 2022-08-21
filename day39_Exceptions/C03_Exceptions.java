package day39_Exceptions;

public class C03_Exceptions {
    public static void main(String[] args) {

        String str="1234a5";

        int sayi= 0;
        try {
            sayi = Integer.parseInt(str);//str nin içinde String bir karakter oldugu için parseInt metodu hata verir.
        } catch (NumberFormatException e) {//child exception
            System.out.println("yazdıgınız deger sadece rakamlardan oluşmalıdır.");
        }catch (Exception e) {//parent exception
            System.out.println("Öngörülemeyen bir hata oluştu..");
        }


        System.out.println("sayinin karesi : "+sayi*sayi);



        /*
        Kullanıcıdan String olarak bir deger alıyor ve
        bunu int a ceviriyorsak,NumberFormatException ile
        karsılasacagımzı öngörürüz

        NumberFormatException ile karşılasınca
        kodumuzun calışmasına devam etmesini istiyorsak
        try catch ile cevreleriz.

        Eger bilmediğim bir exception daha oluşursa
        kodumun durmasını istemiyorsak bir kere daha catch cümlesi ekleyip
        ona en geniş exceptionı yazabiliriz.
         */
    }
}
