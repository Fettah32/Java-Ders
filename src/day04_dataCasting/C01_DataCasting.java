package day04_dataCasting;

public class C01_DataCasting {
    public static void main(String[] args) {
        char harf = 'a';
        char yeniHarf = (char) (harf + 1);  // kod bu durumda once sagdaki islemi yapar
        // char yeniHarf=97+1=98
        // char boe variable 98 olamayacagi icin Java hata verir
        System.out.println(yeniHarf);
        /*
        Bazen bir variable'a olusturuldugu data turu disindan deger atanabilir
        Bunlardan bazisini java otomatik olarak kabul eder

        Java eger bu deger atamasinda sorun olusacacagini
        (data kayiplarinin olabilecegi veya data'nin baskalasabilecegi)
        gorurse bu durumda otomatik olarak bu atamayi kabul etmez
        sizden eger bu atamayi istiyorsaniz sorumlulugu almanizi bekler
         */
        int sayi1 = (int) 7.3;
        System.out.println("sayi1 : " + sayi1); // 7
        double sayi2 = 10;
        System.out.println("sayi2 :" + sayi2); // 10.0
        int sayi3 = 'c';
        System.out.println("sayi3 :" + sayi3); // 99
        char harf2 = 98;
        System.out.println("harf2 :" + harf2); // b


    }
}
