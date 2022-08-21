package day20_Arrays;

import java.util.Arrays;

public class C05_SolaKaydırma {
    public static void main(String[] args) {
/*
Soru 1: Verilen 3 elemanli bir array’in tum elemanlarini
 bir soldaki konuma tasiyacak bir program yazin.
  Ornek; array [1,2, 3] ise
  output [2, 3, 1] olacak.
 */

   int arr[]={1,2,3};
   // ilk degeri sola kaydırınca ilk degeri kaybetmemek için tempe atadık

   int temp=arr[0];

        for (int i = 0; i <arr.length-1; i++) {

            arr[i] = arr[i+1];

        }
       // arr nın son elementi temp olacak
        arr[arr.length-1] = temp;

        System.out.println(Arrays.toString(arr));// [2,3,1]
        //yukarıda degiştiğimiz arrayı ilk durumuna getirmek için saga kaydıralım.
        //son deger olan 1 ı korumak için
        temp=arr[arr.length-1];

        for (int i = arr.length - 1; i > 0;  i--) {
            arr[i]=arr[i-1];

        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr)); //[1, 2, 3]
    }
}
