package pl.nataliagajewska.udemy;

public class OperatoryLogiczne {
    public static void main(String[] args) {
        /*

        ! - negacja
        !(true) - false
        !(false) - true

        && - koniunkcja - w tym samym momencie (np. chcemy spprawdzić czy ktoś wpisał hasło i zaakceptował licencję)
        true true = true
        true false = false
        false false = false


        || alternatywa - czyli "lub" "wybór"
        true true - true
        true false - true
        false false - false

         */

        int a = 5;
        int b = 5;
        int c = 7;

        if(a == b && c > b) //sprawdz czy a jest rowne b i w tym samym momencie sprawdz czy c jest większe od b, jeśl tak wydrukuj TAK
            System.out.println("tak");


        System.out.println(a != b || c > 12); // WYNIK FALSE
    }
}
