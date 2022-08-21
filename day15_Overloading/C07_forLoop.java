package day15_Overloading;

public class C07_forLoop {
    public static void main(String[] args) {

        //100 den 1 e kadar sınırlar dahil 8 ile bölünebilen sayıları yazdırın.
        for (int i = 100; i >=1; i--) {
            if(i%8==0) {
                System.out.print(i+"c");
            }

        }


    }
}
