package day22_MultıDımensıonalArrays;

import java.util.Arrays;

public class C04_MdaIstenenArrayOluşturma {
    public static void main(String[] args) {

     /*
        Soru 4) Asagidaki multi dimensional array’in ic array’lerindeki tum elemanlarin toplamini birer birer bulan
        ve herbir sonucu yeni bir array’in elemani yapan ve yeni array’i ekrana yazdiran bir program yaziniz
         { {1,2,3}, {4,5}, {6,7} }
      */
     int [][] input=   { {1,2,3}, {4,5}, {6,7} };
     int [] yeniArr=new int[input.length]; //yenı arrayın uzunlugu eskı arrayın inner arrayın lengthıne esit
     int toplam=0;

        for (int i = 0; i < input.length; i++) { //outer arrayde gezer
            for (int j = 0; j < input[i].length; j++) { //inner arrayi gezer.
                toplam += input[i][j];

            }
            yeniArr[i]=toplam;
            toplam=0;

        }
        System.out.println("istenen yenı Array :"+ Arrays.toString(yeniArr));
    }
}
