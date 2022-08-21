package day14_methodCreatıon;

public class C02_methodCreatıon {
    public static void main(String[] args) {
        // verilen 3 basamaklı bir sayının rakamları toplamını yazdıran br method oluşturalım.

   int input=423;

   rakamlarıTopla(input);

        }

    public static void rakamlarıTopla(int input) {

        int birlerBasamagı=0;
        int rakamlarToplamı=0;
        int girilenSayı=input;
        birlerBasamagı=input%10;
        rakamlarToplamı+=birlerBasamagı;
        input/=10;
        birlerBasamagı=input%10;
        rakamlarToplamı+=birlerBasamagı;
        input/=10;
        birlerBasamagı=input%10;
        rakamlarToplamı+=birlerBasamagı;
        input/=10;

        System.out.println("girdiğiniz "+ girilenSayı +" sayısının rakamlar toplamı:"+ rakamlarToplamı);

    }
}

