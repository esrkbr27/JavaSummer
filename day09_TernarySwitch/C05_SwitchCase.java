package day09_TernarySwitch;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {

        /*
         switch yanina yazilan ( ) neye gore case atayacagimizi gosterir
         Java girilen degere gore case'i bulur ve o satirdan calistirmaya baslar
         break yazisi gorunceye veya switch parantezine kadar devam eder
         if - else if - .... -else yapisinda oldugu gibi
         hic bir sarta uymayanlari default keyword kullanilir
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu giriniz");
        int gunNo=scan.nextInt();

        switch (gunNo) {
            case 1 :
                System.out.println("pazartesi");
                break;
            case 2 :
                System.out.println("sali");
                break;
            case 3 :
                System.out.println("carsamba");
                break;
            case 4 :
                System.out.println("persembe");
                break;
            case 5 :
                System.out.println("cuma");
                break;
            case 6 :
                System.out.println("cumartesi");
                break;
            case 7 :
                System.out.println("pazar");
            default:
                System.out.println("lütfen gecerli bir sayı giriniz");
        }
    }
}
