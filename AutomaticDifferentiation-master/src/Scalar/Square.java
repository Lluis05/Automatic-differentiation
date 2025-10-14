package scalar;

public class Square implements Function {

    private Function func;
    public Square(Function func) {
        this.func = func;
    }

    @Override
    public DualNumber evaluate(DualNumber dn) {
        DualNumber value = func.evaluate(dn);

        double u = value.u * value.u;
        double uprime = 2.0 * value.u * value.uprime;

        return  new DualNumber(u, uprime);
    }
}
