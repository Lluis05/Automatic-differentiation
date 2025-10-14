package vectorial;

public class Multiply extends BinaryOperator {
    public Multiply(Function func1, Function func2) {

        super(func1, func2);
    }
    @Override
    public DualNumber evaluate(double[] x) {
        DualNumber dn1 = left.evaluate(x);
        DualNumber dn2 = right.evaluate(x);
        int num_dimensions = dn1.uprime.length;
        double[] uprime = new double[num_dimensions];
        for (int i=0; i<num_dimensions ; i++) {
            uprime[i] = (dn1.uprime[i] * dn2.u) + (dn1.u * dn2.uprime[i]);
        }
        return new DualNumber(dn1.u * dn2.u, uprime);
    }
}
