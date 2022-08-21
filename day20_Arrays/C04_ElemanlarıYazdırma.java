package day20_Arrays;

import java.util.Arrays;

public class C04_ElemanlarıYazdırma {
    public static void main(String[] args) {

        int sayilar[]={1,2,3,4,5,6,7};

        // Arrayın tamamını yazdıralım

        System.out.println(Arrays.toString(sayilar));//[1, 2, 3, 4, 5, 6, 7]
        //Arryın tum elemntelrını yazdıralım.

        for (int i = 0; i < sayilar.length; i++) { //tum elementler for loopla yazdırılır.
            System.out.print(sayilar[i]+" "); //1 2 3 4 5 6 7 yazdırır.



        }


    }
}
