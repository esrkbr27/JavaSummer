package day16_forLoop;

public class C03_forLoop {
    public static void main(String[] args) {

        //10 ve 30 arasındakı sayıları aynı satırda yazdıralım
        int bas=10;
        int son=30;

        for (int i =bas; i <=son; i++) {
            //10 dab baslayıp 30 a kadar yazdırırken aralarına , koymasını 30 da hiçbir sey koymasını istemiyorum

            if(i<son) { //son sayıya gelene kadar sayının yanına , koy
                System.out.print(i+",");
            } else { //son sayıya gelince sadece sayıyı yazdır.
                System.out.print(i);
            }




        }
    }
}
