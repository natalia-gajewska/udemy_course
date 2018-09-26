package pl.nataliagajewska.udemy;

public class OperatoryRelacyjne {
    public static void main(String[] args) {
        /*
        OPERATOR RELACYJNY - PORÓWNUJE

           == porównanie
           != czy jest różne od siebie
           > większe od
           < mniejsze od
           <= mniejsze lub równe
           >= większe lub równe

        4==4
         */
        boolean isTrue = 4 == 4; //sprawdza
        System.out.println(isTrue);

        boolean isTrue2 = 4 == 12;
        System.out.println(isTrue2); // wynik false bo 4 nie jest równe 12

        System.out.println(4 != 6); // wynik true ponieważ 4 jest różne od 6

        System.out.println( 5 > 5); // wynik false bo 5 nie jest większe o 5
    }
}
