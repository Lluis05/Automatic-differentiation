package vectorial;

public class DualNumber {
    public double u; //Value
    public double[] uprime; //Vector Derivate

    public DualNumber(double u, double[] uprime) {
        this.u = u;
        this.uprime = uprime;
    }
}
