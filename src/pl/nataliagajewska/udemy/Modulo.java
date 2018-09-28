package pl.nataliagajewska.udemy;

public class Modulo { //reszta  z dzielenia
    public static void main(String[] args) {

        int a,b,c;
        a = 10;
        b = 25;
        c = b % a;

        System.out.println("b % a =" + c  ); // 5
        System.out.println("a % 3 =" + a % 3); // 1
        c = a * b;
        System.out.println("(a*b) %120 =" + c % 120); // 10

    }
}
