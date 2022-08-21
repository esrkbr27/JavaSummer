package day40_final;

public abstract class C_Abstroctor {

    void toplama(){
        System.out.println("Bu metot toplama yapar.");
    }

     abstract void carpma();

    abstract void bölme();

 //   abstract void cıkarmar(){

    //}
    /*
    Bir metoton basına abstract yazarsanız
    bu metotun chıld classlar için bir standart oldugunu
   deklere etmiş olurusunuz ve metot bodysine ihtiyaç duymaz.
     */
}
