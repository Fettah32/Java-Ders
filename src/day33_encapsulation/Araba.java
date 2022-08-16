package day33_encapsulation;

public class Araba {

    String marka = "Marka belirtilmedi"; // markanin access modifier'i default access modifier oldugundan
                                        // package icerisinden kullanilanilir
    private String model = "Model belirtilmedi";
    private String yakit = "Elektrikli"; // tum arabalar elektrikli ise bu variable'in degistirilmemesi lazim
    // private yaptigimiz model ve yakit variable'larina erisimi yetkilendirelim
    // model'e deger atanabilsin ama gorulemesin (setter)
    // yakit ise gorulebilsin ama yeni deger atanamasin istiyor (getter)

    public void setModel(String model) {
        this.model = model;
    }


    public String getYakit() {
        return yakit;
    }
}
