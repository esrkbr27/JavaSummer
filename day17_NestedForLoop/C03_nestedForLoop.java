package day17_NestedForLoop;

public class C03_nestedForLoop {
    public static void main(String[] args) {
        /*
        verilen en ve boy degerine göre * lardan oluşan bir dikdötgen oluşturalım.

        yükseklik;3   boy;4
        * * * *
        ****
        ****

         */

        int yükseklik=4;
        int boy=8;

        for (int i = 1; i <=yükseklik; i++)  {
            for (int j = 1; j <=boy; j++)  {
                System.out.println("* ");

            }
            System.out.println("");

        }
    }
}
