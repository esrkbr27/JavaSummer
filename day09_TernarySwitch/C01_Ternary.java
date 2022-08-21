package day09_TernarySwitch;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {

        //Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin.

        Scanner scan=new Scanner(System.in);
        double sayi=scan.nextDouble();

        System.out.println(sayi>=0 ? sayi : (-1*sayi));


        int y=1;
        int z=1;
        int a=y<10 ? y++ : z ; // a =1 <10 true oldugundan y++ olur, önce a ya y yi atayıp sonra y nın degerini 1 artırıyoruz
                               //a =1 oldu y=2 oldu

        System.out.println(y+ ","+ z+ ","+ a);

    }
}
