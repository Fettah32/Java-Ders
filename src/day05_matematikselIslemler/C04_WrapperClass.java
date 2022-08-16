package day05_matematikselIslemler;

public class C04_WrapperClass {
    public static void main(String[] args) {

        String str = "Java Cok Guzel";
        str.toUpperCase();

        int sayi = 10;
        // primitive data turlerinin yaninda method'lar olmaz
        // Java bazi method'lari kullanabilmemiz icin
        // her bir primitive data turu ici bir wrapper class olusturmustur

        Integer sayi2= 10;

        sayi2.byteValue();
    }
}
