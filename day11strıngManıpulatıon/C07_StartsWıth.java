package day11strıngManıpulatıon;

public class C07_StartsWıth {
    public static void main(String[] args) {
        String input="Java gun gectıkce guzellesıyor";

        System.out.println(input.startsWith("J"));// TRUE

        System.out.println(input.startsWith("")); // true

        System.out.println(input.startsWith("gun",5));// true, baslangıc noktası dahıl olur.5. index ve
        //sonrası gun ile mi baslıyor ona bakar.
    }
}
