package vectorial;

public class Square implements Function {

    private Function func;
    public Square(Function func) {
        this.func = func;
    }

    @Override
    public DualNumber evaluate(double[] x) {
        DualNumber value = func.evaluate(x);

        int n = value.uprime.length;
        double[] uprime = new double[n];
        double u = value.u * value.u;

        for(int i = 0; i < n; i++){
            uprime[i] = 2.0 * value.u * value.uprime[i];
        }

        return  new DualNumber(u, uprime);
    }
}
