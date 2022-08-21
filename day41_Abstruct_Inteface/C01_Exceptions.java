package day41_Abstruct_Inteface;

public class C01_Exceptions {
    public static void main(String[] args) {
        try {

            calis();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

    private static void calis() {

        throw new RuntimeException("Çoook çalış");

        /*
        throw ile hata mesajı verdiğimizde
        parametre olarak istediğimiz mesajı verebiliriz.
         */

    }
    }

