package vectorial;

public class Square implements Function {

    private Function function;
    public Square(Function funct) {
        this.function = funct;
    }

    @Override
    public DualNumber evaluate(double[] x) {
        DualNumber value = function.evaluate(x);

        int n = value.uprime.length;
        double[] uprime = new double[n];
        double u = value.u * value.u;

        for(int i = 0; i < n; i++){
            uprime[i] = 2.0 * value.u * value.uprime[i];
        }

        return  new DualNumber(u, uprime);
    }
}
