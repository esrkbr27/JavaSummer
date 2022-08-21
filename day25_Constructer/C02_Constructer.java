package day25_Constructer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Constructer {
    public static  void main(String[] args) {

        C01          obj1        = new          C01();
        //Class adı  class ismi    keyword       constructor

        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        List<Integer> list = new ArrayList<Integer>();

        /*
        Javada bir obje oluşturmak için
        mutlaka obje oluşturulmalıdır.
         */

        System.out.println(obj1.sayi); //C01 classındakı degerı
        // atanmadıgı için default degeri yazdırır.

        obj1.deneme(); //C01 den deneme method calisir yazdırdı.

    }
}
