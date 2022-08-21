package day17_NestedForLoop;

public class C02_nestedForLoop {
    public static void main(String[] args) {

        //verilen sayıya göre carpım tablosu oluşturun.
        /*
        input 3
        1 2 3
        2 4 6
        3 6 9
         */

        int input=4;

        for (int i = 1; i <=input ; i++) { //satırdakı sıralmayı dış  for yapıyor

            for (int j = 1; j <=input ; j++) {

                System.out.print(i*j+" ");
            }
            System.out.println("");

        }
    }
}
