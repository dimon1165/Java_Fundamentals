package learn.java.Patterns.behavioral.Visitor;

/**
 * Created by dvorop on 29.06.2017.
 */
public class Monitor implements ComputePart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
