package day07_ifStatement;

public class C03_BasıcIfStatements {
    public static void main(String[] args) {
               /*
        Bir if statement'da { kullanilmazsa
        Java ilk satiri sart ile baglar, sonraki satirlar bagimsiz olur
         */
        int sayi=-23;

        if (sayi>0)
            System.out.println("sayı pozitif");
            System.out.println("sayı pozitif kalacaktır");


        if (sayi%2==0)
            System.out.println("sayi cift");
            System.out.println("sayi cift kalacaktır");



        if (sayi%5==0)
            System.out.println("sayı 5'in katı");


        //burda calıstırdıgımızda konsolda bir sey yazmaması gerekirken "pozitif kalacaktır" ve "cift kalacaktır"yaz
        //dırdı.



    }
}
