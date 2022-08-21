package day17_NestedForLoop;

import java.util.Scanner;

public class C09_whıleLoop {
    public static void main(String[] args) {
             /* Kullanicidan bir sifre girmesini isteyin.
                Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
                - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali*/

        Scanner scan = new Scanner(System.in);
        String sıfre="";
        boolean sıfreBasarılıMı=false;
        int kontrol=0;

        while(!sıfreBasarılıMı){

            System.out.println("bir sıfre giriniz");
            sıfre= scan.nextLine();
            //4 kontrolü yapalım,her gecen kontrol için kontrol variablenı 1 artıralım
            if(sıfre.charAt(0) >= 'A'&& sıfre.charAt(0) <= 'Z'){
                kontrol++;
            }else{
                System.out.println("ilk harf buyuk harf olmalı");
            }//son harf kontrolü
            if(sıfre.charAt(sıfre.length()-1) >= 'a'&& sıfre.charAt(sıfre.length()-1) <= 'z'){
                kontrol++;
            }else{
                System.out.println("lütfen son harfı kucuk giriniz");
            }//sıfre kontrolü
            if(sıfre.contains(" ")){
                System.out.println("sıfre bosluk içermemeli");
            }else{
                kontrol++;
            }
            if(sıfre.length()>=8){
                kontrol++;
            }else{
                System.out.println("sıfre en az 8 karakter olmalı");
            }

            if(kontrol==4){ //tüm kontrolden gecmiş demektir.
                sıfreBasarılıMı=true;

            }else { //sıfre basarısız ,tekrar basa dönecek, kontrol varaıbl 0 lanmalı,basa dönmeden kontrol varıable bosaltmalı
                kontrol=0;
            }
        }

    }
}
