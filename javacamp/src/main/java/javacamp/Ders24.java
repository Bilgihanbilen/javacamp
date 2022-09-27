package javacamp;

public class Ders24 {

    public static void main(String[] args) {

       sayiBulmaca();


    }

    //camelCasing
    public static void sayiBulmaca(){

        int[] sayilar = new int[]{1, 2, 3, 4, 5, 6, 7, 9, 0};
        int aranacak = 6;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;

            }
        }
        if(varMi){
            mesajVer("Sayı dizide var. " +aranacak);
        }
        else{
            mesajVer("Sayı dizide yok. " + aranacak);
        }
    }

    public static void mesajVer(String mesaj){
        System.out.println(mesaj);

    }

}