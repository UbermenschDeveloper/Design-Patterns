package visitor.visitors;

import visitor.shapes.imp.Circle;
import visitor.shapes.imp.Dot;
import visitor.shapes.imp.Square;

public interface Visitor {
    void visitDot(Dot dot);
    void visitCircle(Circle circle);
    void visitSquare(Square square);
}
