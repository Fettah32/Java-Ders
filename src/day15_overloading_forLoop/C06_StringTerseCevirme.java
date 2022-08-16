package day15_overloading_forLoop;

public class C06_StringTerseCevirme {
    public static void main(String[] args) {

        // Input olarak verilen String'i terse cevirip yazdiran birmethod olusturun

        String input= "Java gun gectikce guzellesiyor";

        terstenYazdir(input);
    }

    public static void terstenYazdir(String input) {
        String tersInput= input.substring(input.length()-1);

        for (int i=input.length()-1; i>=0; i--){
            tersInput+=input.substring(i,i+1);
        }
        System.out.println(tersInput);
    }

}
