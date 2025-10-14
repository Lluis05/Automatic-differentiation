package scalar;

public class Power implements Function {
    private Function func;
    private double exponent;

    public Power(Function func, double exponent) {
        this.func = func;
        this.exponent = exponent;
    }

    @Override
    public DualNumber evaluate(DualNumber dn) {
        DualNumber value = func.evaluate(dn);

        double u = Math.pow(value.u, exponent); //u^k
        double uprime = exponent * Math.pow(value.u, exponent - 1) *  value.uprime; // k * u^(k-1) * u′
        return new  DualNumber(u, uprime);
    }
}
