package pl.nataliagajewska.udemy;

public class InstrukcjeWarunkoweSwitch {
    public static void main(String[] args) {

        /*
        SWITCH (przełącznik)
         */

        int a = 100;
        switch (a)
        {
            case 50:
                System.out.println("a jest równe 50");
                break; //break oznacza wyjście

            case 100:
                    System.out.println("a jest równe 100");
                    break;

                    default:
                        System.out.println("a nie jest równe ani 50 ani 100");
        }
    }
}
