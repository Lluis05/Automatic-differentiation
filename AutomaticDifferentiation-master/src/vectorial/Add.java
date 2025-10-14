package vectorial;

public class Add extends BinaryOperator {
    public Add(Function left, Function right) {
        super(left, right);
    }

    @Override
    public DualNumber evaluate(double x[]){
        DualNumber dn1 = left.evaluate(x);
        DualNumber dn2 = right.evaluate(x);

        int n = dn1.uprime.length;
        double[] uprime = new double[n];

        for (int i = 0; i < n; i++) {
            uprime[i] = dn1.uprime[i] + dn2.uprime[i];
        }
        return new DualNumber(dn1.u + dn2.u, uprime);
    }
}
