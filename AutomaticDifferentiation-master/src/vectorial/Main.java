package vectorial;

public class Main {
    public static void main(String[] args) {
        Function x1 = new Subscript(1, 2); // 2 is number of dimensions
        Function x2 = new Subscript(2, 2);
        Function gamma = new Constant(0.5, 2);
        Function func = new Add(new Multiply(x1, x1), new Multiply(gamma, new Multiply(x2, x2)));
        /* Rosenbrock function
        Function x1 = new Subscript(1, 2);
        Function x2 = new Subscript(2, 2);
        Function gamma = new Constant(1, 2);
        Function sigma = new Constant(-1, 2);
        Function b = new Constant(10, 2);
        Function func = new Add(
                new Multiply(
                        new Add(gamma, new Multiply(sigma, x1)),
                        new Add(gamma, new Multiply(sigma, x1))
                ),
                new Multiply(
                        b,
                        new Multiply(
                                new Add(x2, new Multiply(sigma, new Multiply(x1, x1))),
                                new Add(x2, new Multiply(sigma, new Multiply(x1, x1)))
                        )
                )
        );
         */

        double p[] = new double[] {-0.75, -0.5};

        double h = 1e-1; // tamaño de paso
        int k = 20; // número de pasos


        StringBuilder sb = new StringBuilder();
        sb.append("qt = [");

        for (int t = 0; t < k; t++) {
            DualNumber result = func.evaluate(p);

            if (t > 0) sb.append(", ");
            sb.append(p[0]).append(", ").append(p[1]).append(", ").append(result.u);

            // Actualización: p := p - h * grad
            p[0] -= h * result.uprime[0];
            p[1] -= h * result.uprime[1];
        }

        sb.append("]");
        System.out.println(sb.toString());
    }
}


