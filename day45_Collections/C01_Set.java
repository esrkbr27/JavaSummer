package day45_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        //verilen bir arraydeki tekrar eden elementleri silip
        //tekrarsız halini araye atayan bir kod yazınız.

        int [] arr={4,5,3,6,8,5,1,9,0,4,2,5,7,9,1,2,5,7,6};

        Set<Integer> tekrarsizset = new HashSet<Integer>();

        for (int each:arr) {
            tekrarsizset.add(each);

        }

        System.out.println(tekrarsizset);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        //yukardaki set hali arraye atmam lazım.

        int[] tekrarsizArr = new int[tekrarsizset.size()];

        System.out.println(Arrays.toString(tekrarsizArr));

        //sette index yapısı olmadıgı için for i kullanmayız.

        int i=0; //kendimiz index oluşturduk.

        for (Integer each:tekrarsizset) {

            tekrarsizArr[i]=each; //
            i++;//indexi burda birer artırdık.

        }

        System.out.println(Arrays.toString(tekrarsizArr));//BU bizim arrayimiz değil,
        //cünkü ref farklı aynı arrye esitlemek için atama yapmamız gerekli

        arr=tekrarsizArr;




    }
}
