package day16_forLoop;

public class C02_forLoopHatalar {
    public static void main(String[] args) {

        //

        //for (int i = 0; i>-10; i++) { //sayılar arttıkça sınırdan uzaklaşıyoruz.Başlangıctan bitişe dogru yaklaşmazsa
            // sonsuz loop oluşur.

      //  }

        // eger ilk deger için bile bitiş sartı saglanmıyorsa for loop calışır ama loop bodysi hiç bir zaman
        //devreye girmez.
         for (int i = 0; i >5; i++) {
             System.out.println(i);
             // for loop calışır, kod calışır ama for loop body devreye girmez.
         }

    }
}
