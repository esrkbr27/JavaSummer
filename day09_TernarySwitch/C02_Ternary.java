package day09_TernarySwitch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        //Soru4 ) Kullanicidan bir sayi alin. Sayi pozitifse “Sayi pozitif” yazdirin, negatifse  sayinin karesini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        double sayi=scan.nextDouble();

        //eger ternary içindeki sounçlar farklı data türlerinde ise atama yapamayız, sadece yazdırırız.


        System.out.println(sayi>0 ? "sayi pozitif" :(sayi*sayi));
    }
}
