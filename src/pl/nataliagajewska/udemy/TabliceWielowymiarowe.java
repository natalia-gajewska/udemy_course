package pl.nataliagajewska.udemy;

public class TabliceWielowymiarowe {
    public static void main(String[] args) {
        /*

        ----------------------------------------
        [0][0] |    [0][1]    |   [0][2]
        ----------------------------------------
        [1][0] |    [1][1]    |   [1][2]
        ----------------------------------------
        [2][0] |    [2][1]    |   [2][2]
        ----------------------------------------
        [3][0] |    [3][1]    |   [3][2]
        ----------------------------------------

        TABLICA WIELOWYMIAROWA

         */

        int[][] tablicaWielowymiarowa = new int[4][3]; //4 w pionie, 4 w poziomie

        tablicaWielowymiarowa [0][0] = 12;
        tablicaWielowymiarowa [1][2] = 44;

        System.out.println(tablicaWielowymiarowa[0][0]);

        System.out.println(tablicaWielowymiarowa.length);


        int [][] tab2 =
                {
                        {12,14,18},
                        {13,22,100},
                        {21,21,21}

                };

        System.out.println(tab2[1][1]);




    }
}
