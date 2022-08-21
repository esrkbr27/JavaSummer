package day14_methodCreatıon;

import java.util.Scanner;

public class C05_methodCreatıon {
    //kullanıcıdan şehir ismini ve doğum tarihini alıp, Şehir ismini programımızda büyük harf olarak
    // tarihi ise 2022-06-30 şeklinde kullanmak istiyoruz.bunu bize döndüren bir method oluşturun.
    public static void main(String[] args) {

        //Eger bir classın içerisinde herhangi bir hesaplama yapıp bunu da kalıcı olarak saklamak istersek
        //kodumuzu sade ve anlaşılır tutmak için işlemi bir methodda yapıp sounucunu main metoda döndürebiliriz.
        //Bu durumda return type ı void olmayan bir methodun sounucunu main metodda bir variabla atama yaprsak
        //programın geri kalanında bu yeni dili kullanabiliriz.
        String sehir=sehirAl(); // sehir al metodunu buraya tanımladık,içine birşey yazmadık,metodun içinde kullanıcıdan
                                // alacagız.

        String tarih= tarihAl(); // tarih al metodunu buraya tanımladık

        System.out.println("Girdiğiniz şehir: " + sehir);
        System.out.println("Girdiğiniz tarih: " + tarih);


    }




    public static String sehirAl() {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen sehir adı giriniz");
       String sehirAdı=scan.next().toUpperCase();
       return sehirAdı;
    }

   ;

    public static String tarihAl() {
        String tarih="";
        Scanner scan=new Scanner(System.in);
        System.out.println("yıl giriniz");
        int yıl=scan.nextInt();

        if (yıl<1900 && yıl>2100){
            tarih=yıl+"-";
        }else{
            System.out.println("yıl için gecerli(1900-2100) bir sayı yazınız");
        }

        System.out.println("kaçıncı ay oldugunu tamsayı olarak yazınız");
        int ay=scan.nextInt();
        if(ay<=0 || ay>12){
            System.out.println("ay no 1-12 arasında olmalıdır.");
        } else if (ay<10) {
            tarih=tarih+"0"+ay+"-";

        }else{
            tarih=tarih+ay+"-";
        }

        System.out.println("lütfen ayın kaçıncı günü oldugunu tamsayı olarak giriniz");
        int gun=scan.nextInt();
        if(gun<=0|| gun>31){
            System.out.println("gün olarak 1-31 arasında sayı girmelidir");
        } else if (gun<10) {
            tarih=tarih+"0"+gun;

        }else{
            tarih=tarih+gun;
        }
        return tarih;
    }

}
