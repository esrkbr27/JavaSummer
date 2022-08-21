package day22_MultıDımensıonalArrays;

import java.util.ArrayList;
import java.util.List;

public class C09_get {
    public static void main(String[] args) {
        List<Integer> sayilar1=new ArrayList<Integer>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        List<String> isimler=new ArrayList<String>();
        isimler.add("Erdal");
        isimler.add("Hakan");
        isimler.add("Enes");

     //get metodu verilen indexdekı degeri bize getirir.
        System.out.println(isimler.get(2));//Enes
        System.out.println(sayilar1.get(1)); //3
    }
}
