package day17_NestedForLoop;

public class C05_nestedForLoop {
    public static void main(String[] args) {
        //verilen inputa göre yıldızlarda oluşan asagıdaki sekli ouşturun.
        //input=4;
        /*
verilen input'a gore
*'lardan olusan asagıdaki sekli olusturun
*
* *
* * *
* * * *
* * *
* *
*
 */
        //artan kısmı nested for llop ile yapalım.
        int input=4;
        for (int i = 1; i <=input; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println("");

        }
        for (int i = input; i >=1; i--) {
            for (int j = 1; j <= i; j--) {
                System.out.print("* ");

            }
            System.out.println("");


        }

    }
}
