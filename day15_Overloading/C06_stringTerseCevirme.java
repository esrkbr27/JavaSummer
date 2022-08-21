package day15_Overloading;

public class C06_stringTerseCevirme {
    public static void main(String[] args) {

        //input olarak verilen Stringi terse cevirip yazdıran bir metod oluşturun.

        String input="Java gun gectıkce guzellesiyor";
        terstenYazdırma(input);
    }

    public static void terstenYazdırma(String input) {

        String tersInput=input.substring(input.length() - 1);

        for (int i = 0; i <input.length()-1; i++) {

        }
    }
}
