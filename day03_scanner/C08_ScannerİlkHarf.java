package day03_scanner;

import java.util.Scanner;

public class C08_ScannerİlkHarf {

    public static void main(String[] args) {

        //kullanıcıdan aldığınız ismin ilk harfini büyük olarak yazınız.
         /*
          Java Scanner class'inda nextChar() method'u yoktur
          bunun yerine String olarak ilk kelimeyi alip
          onun da ilk harfini alabiliriz
         */


        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");

        char ilkharf=scan.next().toUpperCase().charAt(0); //next den sonra nokta koyunca char at gelir büyük harf istedi
        //ğimiz için upper case seçtik, sonra ilk harf için char 0 seçtik.

        System.out.println("ismin ilk harfi :"+ ilkharf);

    }
}
