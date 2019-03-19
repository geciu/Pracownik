package pracownik;
import java.util.ArrayList;

public abstract class Pracownik {


    String imie;
    String nazwisko;
    int wysEtatu;

    public Pracownik(String imie, String naziwsko, int wysEtatu){
        this.imie = imie;
        this.nazwisko = naziwsko;
        this.wysEtatu = wysEtatu;
    }

    public void opis(){
        System.out.println("Pracownik: " + imie + nazwisko + " , Wysokosc etatu: " + wysEtatu);
    }

}
