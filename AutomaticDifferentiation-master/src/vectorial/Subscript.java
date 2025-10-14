package vectorial;

public class Subscript implements Function {
    private int index;
    private int numDimensions;
    public Subscript(int index, int numDimensions) {
        this.index = index-1;
        this.numDimensions = numDimensions;
    }
    @Override
    public DualNumber evaluate(double[] x) {
        assert x.length == numDimensions;
        double[] uprime = new double[numDimensions];
        for (int i=0; i<numDimensions; i++) {
            uprime[i] = (i==index) ? 1.0 : 0.0;
        }
        return new DualNumber(x[index], uprime);
    }
}

