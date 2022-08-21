package day07_ifStatement;

import java.util.Scanner;

public class ödev_s4 {
    public static void main(String[] args) {
        //kullanıcıdan dikdörtgen kenar uzunlugu al diktötgenin kare olup olmadıgını söyle

        System.out.println("lütfen dikdötgenin bir kenarını girin");

        Scanner scan=new Scanner(System.in);
        int kenar1=scan.nextInt();

        System.out.println("lütfen dikdötgenin diğer kenarını girin");
        int kenar2=scan.nextInt();

        if(kenar1==kenar2) {
            System.out.println("bu dikdötgen karedir.");
        }
        else {
            System.out.println("bu dikdötgen kare değildir.");
        }
    }
}
