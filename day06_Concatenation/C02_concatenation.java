package day06_Concatenation;

public class C02_concatenation {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Güzeldir";
        int sayi1=5;
        int sayi2=4;

        System.out.println(str1+ " "+str2+ " "+sayi1+sayi2);//Java Güzeldir 54

        System.out.println(str1 + " "+ str2 +" "+(sayi1+sayi2));//Java Güzeldir 9 (" "boşluk ifadeleri string yapmaz ama
        // hiçlik "" başta olursa string yapar.

        System.out.println(sayi1+sayi2+ " "+ str1);// 9 JAva

        // "" hiçlik başa konursa tüm ifadeyi string yapar.

        System.out.println(""+sayi1+ sayi2+ " "+str2);// 54 Güzeldir

      //Concat işlemini + ile değil, String metodu ile yaparsak aşagıdaki gibidir.

        System.out.println(str1.concat(str2));; //JavaGüzeldir
        System.out.println(str1.concat(" ").concat(str2));


    }
}
