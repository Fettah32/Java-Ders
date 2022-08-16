package day17_nestedForLoop;

import java.util.Scanner;

public class C11_TerstenForLoop {
    public static void main(String[] args) {
        //Kullanicidan bir String isteyin ve Stringi tersine ceviren
        //bir program yazin.
        Scanner scanner = new Scanner(System.in);
        System.out.println("String bir ifade giriniz...");
        String str = scanner.nextLine();

        System.out.println(terstenYazdir(str));
    }
    public static String terstenYazdir(String str) {
        String ters = "";
        for (int i= str.length()-1; i>=0; i--){
            ters += str.substring(i,i+1);
        }
        return ters;
    }
}
