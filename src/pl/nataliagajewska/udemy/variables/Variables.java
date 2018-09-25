package pl.nataliagajewska.udemy.variables;

public class Variables {
    public static void main(String[] args) {

        int x = 52+87; //int - typ zmiennej, x- nazwa zmiennej, = przypisanie
        byte b = 127; // od 127 do -128
        short c = Short.MAX_VALUE; // max value stała - 32767 , -32768 (ctrl)
        long l = Long.MAX_VALUE;
        float f = Float.MAX_VALUE;

        double d = 0.1; //zmiennoprzecinkowe

        char u = 'm'; //przechowywanie pojedyńczych liter

        String str = "Natalia"; //zmienna tekstowa

        boolean boo = true; //lub false

        System.out.println(str);
        System.out.println(boo);

        int a = 25;
        int z = 30;
        int az = a+z; // dodawania
        int mn = a*z; // mnożenie
        double dz = 10;
        double yw = 3;
        double abc = dz/yw; // dzielenie dla zmiennoprzecinkowych
        System.out.println(az);
        System.out.println(mn);
        System.out.println(abc);

        // MODULO czyli reszta z dzielenia %

        int m = 20;
        int mm = 6;
        int mod = m%mm;

        System.out.println(mod); // 20/6=18 - zostaje 2 czyli modulo

        //..................................//

        //dekrementacja czyli zwiększenie o 1 (++)

        int aaa = 20;
        int bbb = 30;
        int ccc = 40;


        System.out.println(aaa++);
        System.out.println(aaa);
        System.out.println(bbb--);
        System.out.println(bbb);

        System.out.println(++ccc); // <-- lepiej tak

        //.....................//

        m = m+5;
        System.out.println(m); // -> można zmieniać zmienne





    }

}
