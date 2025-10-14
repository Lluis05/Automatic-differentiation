package scalar;

public class Main{
    public static void main(String[] args){
        // f(x) = sin(pi/2 + x^2)
        Function halfPi = new Constant(Math.PI / 2.0);
        Function x = new X();              // identidad: X(x) = x
        Function x2 = new Square(x);       // x^2
        Function inner = new Add(halfPi, x2);
        Function f = new Sin(inner);

        double x0 = 4.0;

        // Valores "True" (analíticos)
        double fTrue = Math.sin(Math.PI / 2.0 + x0 * x0);
        double fPrimeTrue = 2.0 * x0 * Math.cos(Math.PI / 2.0 + x0 * x0);

        // Valores "Computed" (automática) usando dual numbers
        DualNumber res = f.evaluate(new DualNumber(x0, 1.0));

        // Encabezado como en la diapositiva
        System.out.println("sin(pi/2 + x^2), x0 = " + x0);

        System.out.println("True");
        System.out.println("f(" + x0 + ") = " + fTrue);
        System.out.println("f'(" + x0 + ") = " + fPrimeTrue);

        System.out.println("Computed");
        System.out.println("f(" + x0 + ") = " + res.u);
        System.out.println("f'(" + x0 + ") = " + res.uprime);

        System.out.println("error value " + Math.abs(fTrue - res.u));
        System.out.println("error derivative " + Math.abs(fPrimeTrue - res.uprime));

        /* old main
        // Definimos la función f(x) = sin(pi/2 + x^2)
        Function halfPi = new Constant(Math.PI / 2.0);
        Function x = new X();
        Function x2 = new Square(x);
        Function inner = new Add(halfPi, x2);
        Function f = new Sin(inner);

        // Evaluamos f en x0 = 4.0
        double x0 = 4.0;
        DualNumber result = f.evaluate(new DualNumber(x0, 1.0));

        System.out.println("f(x) = sin(pi/2 + x^2)");
        System.out.println("x0 = " + x0);
        System.out.println("f(x0) = " + result.u);
        System.out.println("f'(x0) [automática] = " + result.uprime);
        System.out.println();
        */


    }
}


