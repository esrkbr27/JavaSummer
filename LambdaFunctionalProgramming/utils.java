package LambdaFunctionalProgramming;

import java.util.List;

public class utils {

    public static void ayniSatirdaBosluklaYazdir(Object obj){
        System.out.print(obj+" ");
    }

    public static boolean ciftelemanlarisec(int x){

    return x%2==0;
    }

    public static boolean tekelemanisec(int x){

        return x%2!=0;
    }

    public static int karesinial(int x){

        return x*x;
    }

    public static int küpünüal(int x){

        return x*x*x;
    }

public static double yarisiniAl(double x){

        return x/2.0;
}

public static char sonkarakter(String x){
    return x.charAt(x.length()-1);
}
    public static char ilkkarakter(String x){
        return x.charAt(0);
    }

    public static int rakamlarToplami(int x){
        int toplam=0;
        while(x>0){
            toplam+=x%10;
            x/=10;
        }
        return toplam;
    }
}
