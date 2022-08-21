package day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {

        /*
        Javada eleman aramanın kısa yoludur.ancak bınary searchun calışması için önce arrayın sıralı hale getirilmesi gerekir
        eger sıralama yapmadan bınary search yaparsanız sonucu bulamayabilir vea yanlış bulabilir.
         */

        String [] harfler={"Y","B","D","G","O"};

        String arananHarf="A";

        System.out.println(Arrays.binarySearch(harfler,arananHarf)); //-1
        System.out.println(C03_Contaıns.contains(harfler,arananHarf)); //false
        //Binary search bize aradıgımız elemanın İNDEXini  dondurur.
        //Array sıralı olmadıgı ıcın arama sonucunu dogru bulamayabilir.emın olmak için sort yapmalıyız.

        Arrays.sort(harfler); //burda önce sıralı hale getirdık
        System.out.println(Arrays.toString(harfler)); //sıralı halını yazdırdık.[B, D, G, O, Y]
        System.out.println(Arrays.binarySearch(harfler,arananHarf));



    }
}
