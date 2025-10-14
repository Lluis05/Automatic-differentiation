package scalar;

public class Sin extends Function {
    private Function func;

    public Sin(Function func) {
        this.func = func;
    }

    @Override
    public DualNumber evaluate(DualNumber dn) {
        DualNumber value =  func.evaluate(dn);

        // We apply the sin rule
        double u = Math.sin(value.u);
        double uprime = value.uprime * Math.cos(value.u);

        // return ⟨f(x), f′(x)⟩
        return new DualNumber(u, uprime);
    }
}
