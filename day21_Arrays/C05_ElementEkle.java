package day21_Arrays;

import java.util.Arrays;

public class C05_ElementEkle {
    public static void main(String[] args) {
       // Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun

        String [] sınıfList= {"Ali Can","Nida Yucedal","Musa Yaman"};
      //  String [] sınıfList= {"Ali Can","Nida Yucedal","Musa Yaman","Esra"}; bu sekılde arraye element eklemeyı
        //java kabul etmıyor.bunun için yeni bir array oluşturmam lazım
        String eklenecekİsim="Murat Babayıgıt";

        sınıfList=elemanekle(sınıfList,eklenecekİsim);
        System.out.println(Arrays.toString(sınıfList));


    }


    public static String[] elemanekle(String[] sınıfList, String eklenecekİsim) {
        //var olan bir arrayın uzunlugu degısmez,ancak eskı arrayın elemanları kopyalanabilir.
        //eskı listeden 1 eleman fazla uzunlukta yenı bir liste oluşturdum
        String[] yeniSınıfListesi=new String[sınıfList.length+1]; //su halıyle[null,null] yazdırır.
        for (int i = 0; i <sınıfList.length; i++) {
            yeniSınıfListesi[i]=sınıfList[i]; //eskı listedekı isimleri buraya tasıdı.son eklenen hariç

        }
        //son ındexe eklenecek ismi ekledik.
        yeniSınıfListesi[yeniSınıfListesi.length-1] = eklenecekİsim;


        return yeniSınıfListesi;
    }
}
