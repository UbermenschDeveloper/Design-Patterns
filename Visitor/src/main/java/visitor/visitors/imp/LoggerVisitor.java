package visitor.visitors.imp;

import visitor.shapes.imp.Circle;
import visitor.shapes.imp.Dot;
import visitor.shapes.imp.Square;
import visitor.visitors.Visitor;

public class LoggerVisitor implements Visitor {
    public void visitDot(Dot dot) {
        System.out.println("Dot's just been logged!");
    }

    public void visitCircle(Circle circle) {
        System.out.println("Circle's just been logged!");
    }

    public void visitSquare(Square square) {
        System.out.println("Square's just been logged!");
    }
}
