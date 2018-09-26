package pl.nataliagajewska.udemy.variables;

public class Table {
    public static void main(String[] args) {

        int[] ints;
        ints = new int[3]; //deklaracja tablicy oraz jej wartości

        ints[0] = 6; //pierwszy element
        ints[1] = 3; //drugi element
        ints[2] = 765; //trzeci element

        System.out.println(ints[0]); //drukowanie konkretnego elementu

        String[] strings = {}; // tablica która ma zero elementów

        String[] strings1 = {"element","element1"};

        System.out.println(strings1[1]);

        System.out.println((ints[1]+ints[2])); // dodawanie na tablicach

        int[] number = {1,12,89};

        System.out.println((number[1]+number[2]));

    }
}
