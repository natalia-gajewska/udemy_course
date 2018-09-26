package pl.nataliagajewska.udemy;

public class InstrukcjeWarunkowe {
    public static void main(String[] args) {
        /*

        if (WYRAŻENIE)     jeśi wyrażenie jest prawdziwe wykona się instrukcja
        instrukcja;

        else
        instrukcja;
         */

        int a = 5,
                b= 7;
        if (a == b)
            System.out.println("tak"); //wynik nie bedzie wypisany bo a nie jest równe b

        int abc = 2,
                def = 3;

        if (abc == def)
            System.out.println("abc == def");
        else
            System.out.println("abc nie jest równe od def"); // może być też else if

    }
}
