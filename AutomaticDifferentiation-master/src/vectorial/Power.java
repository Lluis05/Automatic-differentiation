package vectorial;

public class Power implements Function {
    private Function func;
    private double exponent;

    public Power(Function func, double exponent) {
        this.func = func;
        this.exponent = exponent;
    }

    @Override
    public DualNumber evaluate(double[] x) {
        DualNumber value = func.evaluate(x);

        int n = value.uprime.length;
        double u = Math.pow(value.u, exponent); //u^k
        double[] uprime = new double[n];
        for(int i = 0; i < n; i++) {
            uprime[i] = exponent * Math.pow(value.u, exponent - 1) * value.uprime[i]; // k * u^(k-1) * u′
        }
        return new  DualNumber(u, uprime);
    }
}
