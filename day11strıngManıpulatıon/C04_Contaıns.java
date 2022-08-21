package day11strıngManıpulatıon;

public class C04_Contaıns {
    public static void main(String[] args) {
         /*
            Soru 2) Kullanicidan bir cumle isteyin.
            Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
            “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
            iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
         */


        String cumle = "Java buyuk, dunya kucuk";

        // requirements'de buyuk harf kucuk harf hassasiyeti hakkinda bir sey soylenmemis
        // ikici olarak da her iki kelimeyi de icerme durumu aciklanmamis
        // bu durumda gorevi bize kim verdiyse ona sormak lazim
        // ek requirements : ikisini de iceriyorsa "Karar ver buyuk mu yazdirayim, kucuk mu ?"
        // case sensitive olmasin

        cumle = cumle.toLowerCase();

        if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());

        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());

        } else if (cumle.contains("kucuk") && cumle.contains("buyuk")) {
            System.out.println("buyuk mu yazdırayım kucuk mu");
        } else {
            System.out.println("cumle kucuk buyuk icermıyor");
        }

        //Kodu yukardakı sekılde yazarsak ilk sart dogru oldugunda onu okur dıger kodlara gırmez,ama bız buyuk kucuk de
        //degerlendırmek istiyoruz. bu nedenle once en sınırlandırıcı basa yazılırsa kodların hepsını okur.

        if (cumle.contains("kucuk") && cumle.contains("buyuk")) {
            System.out.println("Karar ver buyuk mu yazdirayim, kucuk mu ?");
        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());
        } else if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());
        } else {
            System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");
        }
    }

}