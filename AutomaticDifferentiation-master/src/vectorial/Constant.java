package vectorial;

public class Constant implements Function {
    private double value;
    private int numDimensions;

    public Constant(double value, int numDimensions) {
        this.value = value;
        this.numDimensions = numDimensions;
    }

    @Override
    public DualNumber evaluate(double[] x) {
        double[] uprime = new double[numDimensions];
        return new DualNumber(value, uprime);
    }
}
