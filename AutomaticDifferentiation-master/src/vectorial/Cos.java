package vectorial;

public class Cos implements Function {
    private Function func;

    public Cos(Function func) {
        this.func = func;
    }

    @Override
    public DualNumber evaluate(double[] x){
        DualNumber value = func.evaluate(x);
        int n = value.uprime.length;
        double[] uprime = new double[n];

        for (int i = 0; i < n; i++) {
            uprime[i] = -value.uprime[i] * Math.sin(value.u);
        }
        double u = Math.cos(value.u); //cos(u)
        return new DualNumber(u,uprime);
    }
}
