public class Square extends Function {

    private Function function;
    public Square(Function funct) {
        this.function = funct;
    }

    @Override
    public DualNumber evaluate(DualNumber dn) {
        DualNumber value = function.evaluate(dn);

        double u = value.u * value.u;
        double uprime = 2.0 * value.u * value.uprime;

        return  new DualNumber(u, uprime);
    }
}
