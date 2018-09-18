package visitor.visitors.imp;

import visitor.shapes.imp.Circle;
import visitor.shapes.imp.Dot;
import visitor.shapes.imp.Square;
import visitor.visitors.Visitor;

public class SwearingVisitor implements Visitor {
    public void visitDot(Dot dot) {
        System.out.println("That's a fucking dot!");
    }

    public void visitCircle(Circle circle) {
        System.out.println("That's a fucking circle!");
    }

    public void visitSquare(Square square) {
        System.out.println("That's a fucking square!");
    }
}
