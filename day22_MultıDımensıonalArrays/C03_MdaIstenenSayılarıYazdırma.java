package day22_MultıDımensıonalArrays;

public class C03_MdaIstenenSayılarıYazdırma {
    public static void main(String[] args) {
        /*
        verilen iki katlı bir multi-dimensional arrayde
        outer indexi ve inner indexi aynı olan sayıların toplamını bulunuz.
        int[][] sayilar = {{1, 5, 6, 9}, {2, 5}, {3, 1, 6}};
        [0][0]+[1][1]+ [2][2]+....
         */
        int[][] sayilar = {{1, 5, 6, 9}, {2, 5}, {3, 1, 6}};

        int istenenToplam=0;
        //tüm elementlerin üzerinden gezecegız,2 katlı array varsa 2 loop olusutracagız

        for (int i = 0; i < sayilar.length ; i++) {//outer arryın elementlerine baktık
            for (int j = 0; j <sayilar[i].length ; j++) { //inner arryın elementlerine baktık

                if(i==j) {
                    istenenToplam+=sayilar[i][j];
                }

            }

        }
        System.out.println("istenenToplam: " + istenenToplam);
      //  [0][0]=1  + [1][1]=5 + [2][2]=6  (1+5+6=12)
    }
}
