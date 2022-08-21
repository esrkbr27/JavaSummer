package day41_Abstruct_Inteface;

public abstract class EToyota extends DAraba {


    @Override
    protected void motor() {
        System.out.println("Toyota arabalar, cevreci motor kullanır.");

    }
    /*
    Parent classtakı standart belirleyici metotlar
    (abstract metotlar) ın tamamı child class
    tarafından override edilmelidir.

    concrete metotların override edilme mecburiyeti
    yoktur,istersek override ederiz istemezsek etmeyiz.

    Aslında Toyota classı da obje üretebilecegimiz
    bir class değildir.Bu durumda eger proje tasarımı yapıyorsanız
    Toyota classını da abstract yapmanız güzel olur.

     */




}
