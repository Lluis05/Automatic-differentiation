package scalar;

public class Cos implements Function {
    private Function func;

    public Cos(Function func) {
        this.func = func;
    }

    @Override
    public DualNumber evaluate(DualNumber dn){
        DualNumber value = func.evaluate(dn);

        double u = Math.cos(value.u); //cos(u)
        double uprime = -value.uprime*Math.sin(value.u); // -u' * sin(u)
        return new DualNumber(u,uprime);
    }
}
