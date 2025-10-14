package vectorial;

public abstract class BinaryOperator implements Function{
    protected Function left;
    protected Function right;

    public BinaryOperator(Function left, Function right) {
        this.left = left;
        this.right = right;
    }

}
