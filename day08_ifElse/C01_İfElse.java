package day08_ifElse;

import java.util.Scanner;

public class C01_İfElse {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir gün ismi giriniz");

        String gun=scan.next().toLowerCase();

        if (gun.equals("pazartesi")){
            System.out.println("Paz");
        }else if (gun.equals("salı")){
            System.out.println("Sal");

        }else if (gun.equals("carsamba")){
            System.out.println("Car");

        }else if (gun.equals("persembe")) {
            System.out.println("Per");

        }else if (gun.equals("cuma")){
            System.out.println("Cum");

        } else if (gun.equals("cumartesi")){
            System.out.println("Cum");

        }else if (gun.equals("pazar")){
            System.out.println("Paz");
        }else {
            System.out.println("lütfen gecerli bir gün giriniz");
        }





    }


    }

