package day04_dataCasting;

public class C02_DataCasting {
    public static void main(String[] args) {

        int sayi1= 23;
        int sayi2= 5;
        System.out.println(sayi1/sayi2); // 4.6 olmasi beklenir ama 4 ikisi de int oldugundan sonucu int olarak kabul edip yazdirir

        System.out.println(25*7/3); // 58.666.. --> 58

        double sayi3= 5;
        System.out.println(sayi1/sayi3); // 4.6   Iki variable'in data turu degisik oldugunda
                                         // daha kapsamli olani data turu olarak kabul eder
    }
}
