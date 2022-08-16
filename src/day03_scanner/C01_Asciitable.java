package day03_scanner;

public class C01_Asciitable {
    public static void main(String[] args) {
        // 6- Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin

        int sayi=10;
        char harf='a';
        String str= "banan";
        System.out.println(sayi+harf); // 10a degil 107 oldu
        System.out.println(sayi*harf); //
        System.out.println(str+harf); // banana
        System.out.println(harf+2); // 99
        System.out.println(str + sayi + harf); // banan10a

        //char yeniHarf = harf+2


        /*
        1- char data turu isleme girdigi degiskenin turune gore farkli davraabilir
           eger matematiksel isleme girdigi variable sayisal bir degerse sayi gibi davranir
           sayi+harf sayi variable'i int oldugundan harf variable i asci tablosundan 97 degerini kullanır

           char yeniHarf = harf+2;  java once sagdaki islemi yapar, sagda int + char gorunce ascii degerini alir ve sonucu 99
                                    sonra atama islemi yapmaya calisir
                                    char yeniHarf=99
                                    bu atama java acisindan kabul edilebilir degildir

          2-  str+harf); // banana    String variable cok gucludur, hangi data turu ıle ısleme gırerse gırsın
                                     dıger data turunu kendıne benzetir

         */
        // peki..... konsolda variable lari kullanarak 10a gormek istersek nasil yazdirmaliyiz ?

        System.out.println("" + sayi + harf); //10a

        char deger='1';
        System.out.println(deger+harf);// '1' + 'a'= 49+97=146

    }
}
