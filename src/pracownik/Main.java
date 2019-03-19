package pracownik;

import java.util.Scanner;

enum Zawod{Koszykarz, Pilkarz, Informatyk, Nauczyciel}

public class Main {

    public static void main(String args[]) {

    }

    Pracownik [] pracownik = new Pracownik [10];

    public static void dodaj_pracownika(Pracownik[] pracownik)
    {
        Scanner klawiatura=new Scanner(System.in);

        if(pracownik.length>Pracownik.liczbaPracownikow)
        {

            System.out.println("Podaj etat (Tester albo Manager): ");
            String etat=klawiatura.nextLine();

            System.out.println("Podaj nazwisko: ");
            String nazwisko=klawiatura.nextLine();
            System.out.println("Podaj pensje: ");
            int pensja=klawiatura.nextInt();
            if(etat.equals("Manager"))
            {
                System.out.println("Podaj dodatek: ");
                int dodatek=klawiatura.nextInt();
                pracownik[Pracownik.liczbaPracownikow]=new Manager(etat,nazwisko,pensja,dodatek);
            }
            else
            {
                pracownik[Pracownik.liczbaPracownikow]=new Tester(etat,nazwisko,pensja);
            }
        }
        else
            System.out.println("Za duzo pracownikow, bo jest ich: "+pracownik.length);
    }

}
