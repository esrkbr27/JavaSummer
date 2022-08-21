package day41_Abstruct_Inteface;

public abstract class DAraba {

    public static void main(String[] args) {
        /*
        Abstract classta main metot opsiyoneldir.
        Eger  abstract class sadece child classların
        tasımak zorunda oldugu özellikleri belirlemek için
        oluşturulduysa main metota ihtiyaç olmaz
        sadece abstract metotlar olur

        ama bir abstract classta  standart belirlemek
        dısında da metotlar calışabilir.Bu durumda ihityac olursa
        main metot oluşturulabilir.

         */
    }


    abstract  protected void  motor();
    protected abstract void yakit();
    protected abstract void kaportan();
    /*
    Sadece child classların mecburi taşıyacakları
    özellikleri belirleyen metotlar abstract metot olur
    ve  abstract metotların bodysi olmaz.
     */



    public void klima(){

        System.out.println("Bazı arabalarda klima olabilir.");
        /*
        abstract olmayan metotlara "concrete (somut)metot denir.
        abstract bir metotu "abstract" keyword ile belirlemek zorunludur.
        concrete metotlarda bunu deklere etmeye gerek yoktur
        biz sadece abstract ile ilgili konuştugumuzda abstract olmayan
        metotlardan bahsetmek için concrete tabirini kullanırız.
         */
    }
}
