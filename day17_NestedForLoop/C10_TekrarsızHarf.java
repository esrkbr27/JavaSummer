package day17_NestedForLoop;

public class C10_TekrarsızHarf {
    public static void main(String[] args) {
        //verilen stringdeki kullanılan harfleri tekrarsız olarak yazdırıp, kelimede kullanılan farklı harf
        //sayısını veren bir metod yapalım.

        String input = "taka tuka";
        tekrarsizYap(input);
    }
    public static void tekrarsizYap(String input) {
        String benzersizInput="";
        String islenecekKelime=input.replaceAll("\\W",""); // EmsalEfe
        System.out.print(islenecekKelime.substring(0,1)); // E
        benzersizInput+=islenecekKelime.substring(0,1);  // E
        for (int i = 1; i <islenecekKelime.length() ; i++) {
            if (!benzersizInput.contains(islenecekKelime.substring(i,i+1))){
                System.out.print(", "+ islenecekKelime.substring(i,i+1));
                benzersizInput+=islenecekKelime.substring(i,i+1);
            }
        }
        System.out.println("");
        System.out.println("inpt: " + input);
        System.out.println("benzersiz input : " + benzersizInput);

    }
}