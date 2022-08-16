package practice_day10.okul_proje;

import java.util.Scanner;

public class OgretmenBilgileri {



    String isim;
    String soyisim;
    int yas;
    String brans;
    String tel;

    public OgretmenBilgileri() {
    }

    public OgretmenBilgileri(String isim, String soyisim, int yas, String brans, String tel) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.brans = brans;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "OgretmenBilgileri{" +
                "\nisim='" + isim + '\'' +
                ", \nsoyisim='" + soyisim + '\'' +
                ", \nyas=" + yas +
                ", \nbrans='" + brans + '\'' +
                ", \ntel='" + tel + '\'' +
                '}';
    }
}

