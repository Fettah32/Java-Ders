package practice_day08;

public class Q06_TestKeyword {
    /*
   ogrencilerin test sonuclarini degerlendiren Java kodunu method kullanarak yaziniz
   //ogrencilerin cevaplari
   char[][] answers = {
   {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
   {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
   {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
   {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
   {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
   {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
   {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
   {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
   *
   * // cevap anahtari
   char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

   output:
   1 nolu ogrencinin 7 dogru cevabi var.
   2 nolu ogrencinin 6 dogru cevabi var.
      "           "
      "           "
      "           "
   8 nolu ogrencinin 7 dogru cevabi var.
*/
    public static void main(String[] args) {

        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        testSonucu(answers, keys);

    }

    public static void testSonucu(char[][] answers, char[] keys) {


        for (int i = 0; i < answers.length; i++) { // her bir ogrenciye, i --> ogrenci
            int sayac = 0; // her bir ogrencinin dogru cevabini sayacagi icin sayac burada
            for (int j = 0; j < answers[i].length; j++) { // ogrencilerin cevaplarina bakiyor, j --> ogrenci cevaplari
                if (answers[i][j] == keys[j]){ // cevap anahtari ile ogrenci cevaplari karsilastiriliyor
                    sayac++;
                }
            }

            System.out.println(i+1 + " no'lu ogrencinin dogru cevap sayisi : " + sayac);

        }
    }
}
