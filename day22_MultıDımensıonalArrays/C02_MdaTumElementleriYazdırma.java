package day22_MultıDımensıonalArrays;

public class C02_MdaTumElementleriYazdırma {
    public static void main(String[] args) {

        //verilen bir MultıDımensıonalArrayIN tum elementlerini yazdıran bir metos yazın

        int[][] sayilar = {{1, 5, 6, 9}, {2, 5}, {3, 1, 6}};
        elementleriYazdırma(sayilar);
    }

    public static void elementleriYazdırma(int[][] sayilar) {

        for (int i = 0; i <sayilar.length;  i++) {//i =0,1,2 degerlerini alır.// outer array
            for (int j = 0; j < sayilar[i].length; j++) { // inner arrayın lengthıne kadar gidcek
                System.out.print(sayilar[i][j]+ " ");

            }

        }


    }
}