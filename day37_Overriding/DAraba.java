package day37_Overriding;

public class DAraba {

    private void yakit(){
        System.out.println("Tüm arabalar yakıt kullanır.");
        /*
        parent classtan override edilmesini istemediğiniz
        metotları private, static,final yaparsanız,child classlar
        bunlara hıcbir şekilde ulaşamaz,override edemez.
         */
    }

    void marka(){
        System.out.println("Tüm arabaların markası vardır.");
    }

    void motor(){
        System.out.println("Tüm arabaların motoru vardır.");
    }
}
