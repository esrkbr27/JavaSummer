package day29_PassByeValueİmmutable;

public class C05_İmmutable {

    public static void main(String[] args) {
        String isim="Mine";

        isim=isim.toUpperCase();
        System.out.println(isim);//MİNE

        isim="Mevlüt";

        for (int i = 0; i < 100; i++) {
            isim+=".";

        }
        System.out.println(isim);
    }
}
