package day14_methodCreatıon;

import day_13.C04_MethodCreatıon;

public class C01_MethodCreatıon {
    public static void main(String[] args) {
        // input olarak verilen 4 harfli bir stringi
        // tersten yazdiran bir method olusturalim

        String input="Esma";

        terstenYazdır(input);

        //Bir classda oluşturdugumuz bir metodu başka bir klasta kullanabiliriz
        //C04 yazınca oluşturdugumuz metod cıkıyor.
        C04_MethodCreatıon.topla(1,90);



    }


    public static void terstenYazdır(String input){
        String tersInput=input.substring(3)+
                         input.substring(2,3)+
                         input.substring(1,2)+
                         input.substring(0,1);

        System.out.println("Verilen kelimenin tersten yazılışı: "+ tersInput);


    }
}
