package day36_İnheritanceDataTypeKullanımı;

import java.util.ArrayList;

public class CMemur extends BMuhasebe {

    int saatUcreti=12;
    int gunlukMesai=9;

    protected void maas(){
        System.out.println("Memurlar : "+(30*saatUcreti*gunlukMesai)+ "maas alır.");
    }

    protected void ozelSigorta(){
        System.out.println("Memurlar %60 indirimli özel sigorta yaptırabilir");
    }

    public static void main(String[] args) {
        CMemur mmr1= new CMemur();

        System.out.println(mmr1.gunlukMesai);//bu classta gunlukMesai var 9
        System.out.println(mmr1.saatUcreti);// bu classta saatUcreti var 12

        mmr1.maas();//Memurlar : 3240maas alır.
        mmr1.ozelSigorta();//Memurlar %60 indirimli özel sigorta yaptırabilir
        mmr1.sigorta();//bu classta bu metot yok, parenta gider

        System.out.println(mmr1.isim);//ismi APersonelden alır.
        System.out.println(mmr1.soyisim);//soyismi APersonelden alır.
        System.out.println(mmr1.departman);//departman APersonelden alır.

        BMuhasebe mhsb1=new BMuhasebe();
        /*

        String str="Murat"; //String aynı zamanda bir classtır
        ArrayList<Integer> list=new ArrayList<Integer>();//Array aynı zamanda bir classtır
        Integer sayi=20;

         her ne kadar memur classının içinde olsak da
        oluşturdugumuz obje muhasebe classındandır

        cunku data type ve const BMuhasebe
        BMuhasebe classı da obje oluşturulabilen bir classtır
         aynı zamanda bir data türüdür.

         ***obje oluşturdugumuz her class, aynı zamanda bir data türüdür.***



         */

        System.out.println(mhsb1.gunlukMesai);// 8 Muhasebeden aldı
        System.out.println(mhsb1.saatUcreti);// 10 Muhasebeden aldı

        mhsb1.maas();//Calısanlarımız : ...
        mhsb1.ozelSigorta();//Muhasebe classından
        mhsb1.sigorta();// parenta gider

        System.out.println(mhsb1.isim);//ismi APersonelden alır.
        System.out.println(mhsb1.soyisim);//soyismi APersonelden alır.
        System.out.println(mhsb1.departman);//departman AP


    }
}
