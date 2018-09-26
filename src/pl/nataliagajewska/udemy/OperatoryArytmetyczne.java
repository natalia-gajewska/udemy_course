package pl.nataliagajewska.udemy;

public class OperatoryArytmetyczne {
    public static void main(String[] args) {
        /* OPERATORY DO ZNAKI SŁUŻĄCE DO OPEROWANIA NA ZMIENNYCH

        OPERATORY ARYTMETYCZNE
        + dodawania
        - odejmowanie
        / dzielenie
        * mnożenie

        = przypisywanie wartości
        +=
        -=
        /=
        *=
        %= modulo

        ++ inkrementacja powiększ o 1
        -- dekrementacja pomniejsz o 1

        y++ POST INKREMENTACJA
        Y-- POST dekrementacja


         */

        int a = 5;
        //chcą ją powiększyć o 2

        a+=2; // zamiast pisać a+2

        System.out.println(a); // wynik 7

        int b = 6;
        b++; //od tej pory b jest powiększone o 1

        int c = 12;
        System.out.println(++c); // powiększanie o 1 i wypisanie c
        System.out.println(c++); // wypisanie c ale nie pokazanie powiększenia o 1


    }
}
