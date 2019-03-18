package pracownik;

public abstract class Pracownik {


    String imie;
    String naziwsko;
    int wysEtatu;

    Pracownik(String imie, String naziwsko, int wysEtatu){
        this.imie = imie;
        this.naziwsko = naziwsko;
        this.wysEtatu = wysEtatu;
    }
}
