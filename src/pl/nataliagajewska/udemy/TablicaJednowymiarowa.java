package pl.nataliagajewska.udemy;

public class TablicaJednowymiarowa {
    public static void main(String[] args) {

        /*

        Tablice tworzymy wtedy gdy potrzebujemy większej ilości zmiennych przechować w tzw kontenerze

         */

        int [] tablica = new int[5];             //deklaracja tablicy i nazwy oraz zarezerwowanie miejsca


        tablica[0] = 1;
        tablica[1] = 22;
        tablica[2] = 33;
        tablica[3] = 75;
        tablica[4] = 100;

        System.out.println(tablica[0]);



        int[] tablica2 = {1,12,33,45,100};   // tablica od razu z wartościami

        System.out.println(tablica2[2]);

        // jak sprawdzić długość tablicy

        System.out.println(tablica.length);
        System.out.println(tablica2.length);

        System.out.println(tablica[tablica.length-1]); //sprawdzanie OSTATNIEGO elementu pierwszej tablicy



    }

}
