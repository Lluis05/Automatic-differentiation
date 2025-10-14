public class X extends Function {
    public X() {
        // void
    }
    public DualNumber evaluate(DualNumber dn) {
        return new DualNumber(dn.u, 1.0);
    }
}
