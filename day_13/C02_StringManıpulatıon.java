package day_13;

import java.util.Scanner;

public class C02_StringManıpulatıon {
    public static void main(String[] args) {
       /* Kullanicidan bir sifre girmesini isteyin.
                Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
                - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali*/

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen sifrenızı giriniz");
        String sıfre=scan.nextLine();
        int kontrol=0;
        //ilk harf kontrolü
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

        if(kontrol==4){
            System.out.println("sıfre basarı ile tanımlandı");
        }else{
            System.out.println("işlem basarısız,lütfen yeni bir şifre giriniz");
        }

    }
}
