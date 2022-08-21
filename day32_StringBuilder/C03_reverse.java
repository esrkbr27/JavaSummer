package day32_StringBuilder;

public class C03_reverse {
    public static void main(String[] args) {
        /*
        verilen bir ınputu tersine cevirip bize döndüren metodun adıdır..
         */

        String input="Hey gidi for loop günleri";

        String tersinput=tersineCevir(input);
        System.out.println(tersinput);
    }

    public static String tersineCevir(String input) {
        /*
        String metodunda reverse metodu yok,StringBuilder da var.
        String i StringBuildera cast etmemız lazım.
         */

        StringBuilder sb = new StringBuilder(input);


        return   sb.reverse().toString();//irelnüg pool rof idig yeH
        //toString metodu StringBuilder I StringE CEVİRDİ.

    }
}
