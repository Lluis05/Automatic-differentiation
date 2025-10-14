package scalar;

public class Add extends BinaryOperator {
    public Add(Function left, Function right) {
        super(left, right);
    }

    @Override
    public DualNumber evaluate(DualNumber dn){
        DualNumber dn1 = left.evaluate(dn);
        DualNumber dn2 = right.evaluate(dn);

        double u = dn1.u + dn2.u;
        double uprime = dn1.uprime + dn2.uprime;
        return new DualNumber(u, uprime);
    }
}
