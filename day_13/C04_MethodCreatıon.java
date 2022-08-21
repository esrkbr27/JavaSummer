package day_13;

public class C04_MethodCreatıon {
    public static void main(String[] args) {
// input oalrak verilen iki integerı toplayıp sonucunu yazdıran bir method oluşturun.

        int input1=20;
        int input2=20;

        //method 4 adımda oluşturulur.
        //1.adım method call
       //2.adım argument eklenmesi gerekıyorsa ekleyelım// eger methodun return type ı voidden farklı olacak ıse
        // bir varıable oluşturup method callu asıgn edelım.
       topla(input1, input2);

    }

    public static void topla(int input1, int input2) {

        //3.adım method deklarasyonunda değiştirilmesi gereken bölümleri değiştir.
        // (acces modıfıer veya return type degiştirebilirz)
        //Eger return type void dısında bir şey ise return keywordu ve dönecek degeri hesaplamalıyız.

        System.out.println("girilen iki sayının toplamı :"+(input1+input2));
    }

}
