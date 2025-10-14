
public class Main{
    public static void main(String[] args){
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


    }
}


