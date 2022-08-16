package day25_conctructor;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Constructor {
    public static void main(String[] args) {

        C01 obj1 = new C01();
        // c01 = class adi
        // obj1 = objenin adi
        // new = keyword
        // c01() = constructor (yapici)

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        //List<String> keywords = new List<>();
        // List interface'dir constructor yoktur atanamaz

        /*
        Java da bir obje olusturabilmek icin
        mutlaka constructor kullanmalisiniz
         */
        System.out.println(obj1.sayi); //0
        obj1.deneme(); // C01'den deneme method'u calisir
    }
}
