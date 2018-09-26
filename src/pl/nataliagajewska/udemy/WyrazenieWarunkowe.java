package pl.nataliagajewska.udemy;

public class WyrazenieWarunkowe {
    public static void main(String[] args) {

        /*

        wyrażenie ? tu piszemy co bedzie jak true : co bedzie jak false;

         */

        int x = 5;

        String czyParzysta = x % 2 == 0 ? "parzysta" : "nieparzysta";
        System.out.println(czyParzysta);
    }
}
