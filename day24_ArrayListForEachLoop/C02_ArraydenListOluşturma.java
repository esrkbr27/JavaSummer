package day24_ArrayListForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydenListOluşturma {
    public static void main(String[] args) {

        /*
        içinde 200 tane 1000 den küçük pozotıf tamsayı olan bir list oluşturun.
        kullanıcıdan bir sayı isteyip listede var olup olmadıgını kullanıcıya yazdırın.(Tahmin Oyunu)
         */

        //önce rastgele sayılardan oluşan bir listeyi javaya ürettiriyoruz.Bunun için
        // Random classını oluşturyoruz.
        Random rnd = new Random();//Random classı 0-1 arasında sayı üretir.
                                  //Random bound ıstedıgımız sınıra kadar sayi üretir.

        int sayi=0;
        List<Integer> sayilistesi=new ArrayList<Integer>();


        while(sayilistesi.size()<200){
            sayi= rnd.nextInt(1000);//buyuklugu en fazla 1000 olan sayı üretecek

            if(!sayilistesi.contains(sayi)){
                sayilistesi.add(sayi);
            }

        }
        System.out.println(sayilistesi);

        //sayıyı kaç kere de bulacagını bilmıyoruz, o yuzden while kullanacagız

        boolean bildiMi=false;
        int tahmınSayısı=1;
        Scanner scan= new Scanner(System.in);

        while(!bildiMi){//while false oldugu müddetce calışacak,ama while içi true olunca
            // döngü calışacagı için ! basına koyduk

            System.out.println("Lütfen bir sayı tahmınınde bulunun");
            sayi=scan.nextInt();

            if(sayilistesi.contains(sayi)){
                System.out.println("tebrikler" + tahmınSayısı +" adet tahmınde listeden bir sayı buldunuz.");
                bildiMi=true; //true olunca döngü burda durucak,çünkü whilein içi false olup döngü duracak.
            }else{
                System.out.println(tahmınSayısı+" adet sayı soyledınız ama hıc bırı listede yok");
                tahmınSayısı++;
            }
        }

    }
}
