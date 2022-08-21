package day33_Encapsulation;

public class TasıtRunner {
    public static void main(String[] args) {
        Tasıt tasıt1=new Tasıt();

        tasıt1.setTasıtTuru("Tır");

        System.out.println(tasıt1.getTasıtTuru());
    }
}
