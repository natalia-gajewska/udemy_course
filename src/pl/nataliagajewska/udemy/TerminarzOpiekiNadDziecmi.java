package pl.nataliagajewska.udemy;

public class TerminarzOpiekiNadDziecmi {

    public static void main(String[] args) {

        /*

        -------------------------------------------------------------------------------------------------------------------------------

        Poniedziałek       |    Wtorek           |      Środa          |   Czwartek          |     Piątek          | Sobota i Niedziela

       --------------------------------------------------------------------------------------------------------------------------------

       Natalia zdwozi      | Tomek zawozi        | Natalia zawozi      | Tomek zawozi        | Natalia zawozi      | Wolny Weekend
       dzieci do             dzieci do            dzieci do              dzieci do             dzieci do
       przedszkola           przedszkola          przedszkola            przedszkola           przedszkola

       --------------------------------------------------------------------------------------------------------------------------------

       Opieka popołudniowa | Opieka popołudniowa | Opieka popołudniowa | Opieka popołudniowa | Opieka popołudniowa | Wspólna opieka
       Natalia               Tomek                 Natalia               Tomek                 Natalia

       --------------------------------------------------------------------------------------------------------------------------------

         */

        String [][] terminarzOpieki = new String[3][6];

        terminarzOpieki [0][0] = "Poniedziałek";
        terminarzOpieki [0][1] = "Wtorek";
        terminarzOpieki [0][2] = "Środa";
        terminarzOpieki [0][3] = "Czwartek";
        terminarzOpieki [0][4] = "Piątek";
        terminarzOpieki [0][5] = "Sobota i Niedzia";

        terminarzOpieki [1][0] = "zawozi dzieci do przedszkola";
        terminarzOpieki [1][1] = "zawozi dzieci do przedszkola";
        terminarzOpieki [1][2] = "zawozi dzieci do przedszkola";
        terminarzOpieki [1][3] = "zawozi dzieci do przedszkola";
        terminarzOpieki [1][4] = "zawozi dzieci do przedszkola";
        terminarzOpieki [1][5] = "wolny weekend";

        terminarzOpieki [2][0] = "Opieka popołudniowa";
        terminarzOpieki [2][1] = "Opieka popołudniowa";
        terminarzOpieki [2][2] = "Opieka popołudniowa";
        terminarzOpieki [2][3] = "Opieka popołudniowa";
        terminarzOpieki [2][4] = "Opieka popołudniowa";
        terminarzOpieki [2][5] = "Opieka popołudniowa";

        String zona = "Natalia";
        String maz = "Tomek";

        String spacja = " ";

        System.out.println("W" +spacja+ terminarzOpieki[0][0] + spacja + zona + spacja + terminarzOpieki[1][0]);
        System.out.println(terminarzOpieki[2][0] + spacja + "należy do" + spacja + zona);

        System.out.println("We" +spacja+ terminarzOpieki[0][1] + spacja + maz + spacja + terminarzOpieki[1][1]);
        System.out.println(terminarzOpieki[2][1] + spacja + "należy do" + spacja + zona);

        System.out.println("W" +spacja+ terminarzOpieki[0][2] + spacja + zona + spacja + terminarzOpieki[1][2]);
        System.out.println(terminarzOpieki[2][2] + spacja + "należy do" + spacja + maz);

        System.out.println("W" +spacja+ terminarzOpieki[0][3] + spacja + zona + spacja + terminarzOpieki[1][3]);
        System.out.println(terminarzOpieki[2][3] + spacja + "należy do" + spacja + zona + spacja+ "i"+ spacja + maz);

        System.out.println("W" +spacja+ terminarzOpieki[0][4] + spacja + zona + spacja + terminarzOpieki[1][4]);
        System.out.println(terminarzOpieki[2][4] + spacja + "należy do" + spacja + zona);

        System.out.println("W" +spacja+ terminarzOpieki[0][5] + spacja + "jest" + spacja + terminarzOpieki[1][5]);
        System.out.println(terminarzOpieki[2][5] + spacja + "jest wspólna");

    }
}
