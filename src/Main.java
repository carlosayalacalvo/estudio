//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String [] args) {
        int a = 3;
        a++; // equivale a = (int)(a+1)

        byte b = 1;
        b++; //equivale b=(byte)(b+1)

        int ejem1 = 2, ejem2;
        ejem2 = ejem1++;  //ejem2 = 2; ejem1=3

        ejem1 = 1;
        ejem2 = ++ejem1; // ejem2 = 2; ejem1 = 2

        Integer int1 = 1;
        var i = int1++; // i sigue siendo Integer

        // =+  -=   *=   /=  %=
        a = 3;
        a += 10; // equivale a=13

        b = 10; //byte
        b=+5; //equivale a b=(byte)(b+5)
        //b = b + 5; //Esto da error, un literal siempre es Int y una operacion con Int siempre retorna Int

        // < , > , <= , >=, ==, !=
        String texto = "hola";
        String texto2 = "hola";
        boolean iguales = (texto == texto2); //true
        boolean iguales2 = (texto.equals(texto2)); //true

        String n1 = new String("hola");
        String n2 = new String("hola");
        boolean n3 = n1 == n2; //false

        boolean sepuede = a < b;
        char cha = 'q';
        boolean sepuede2 = cha<a;
        //boolean nosepuede = a < texto;
        //boolean nosepuede = a < true;

        // && , ||, !
        boolean c = (a<b && a<cha++); //cortocircuito

        // instance of
        if(texto instanceof String) {


        }

        // operadores a nivel de bit  & , | , ^
        int d = 7; //0111
        int e = 10; //1010
        var g = (d&e); //0010

        var f = (d^e); //XOR 1101

        boolean x = true;
        boolean y = false;
        boolean verdadero = (x^y);
        boolean falso = (!x^y);

        //PRIORIDADES
        /**
         * ()
         * ++ --
         * * / %
         * + - !
         * > >= < <=
         * == !=
         * ~
         * &
         * ^
         * |
         * &&
         * ||
         * ?:
         * =  +=  -=   *=  /= %=
         */

        int h = 12;
        int m = 9;
        int l = 4;
        boolean resultado = ((h|m^l)<10&l<5);

        // operador complemento 1
        // ~  cambia ceros por unos y unos por cero
        int u = 5; //00101
        var p = ~u; // 11010;  el numero sumado a 1 con signo invertido = -6
    }
}