package visitor;

import visitor.shapes.Shape;
import visitor.shapes.imp.Circle;
import visitor.shapes.imp.Dot;
import visitor.shapes.imp.Square;
import visitor.visitors.Visitor;
import visitor.visitors.imp.LoggerVisitor;
import visitor.visitors.imp.SwearingVisitor;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Visitor swearingVisitor = new SwearingVisitor();
        MathEditor mathEditor = new MathEditor();


        List<Shape> shapes = mathEditor.getShapes();

        for (Shape shape: shapes) {
            shape.accept(swearingVisitor);
        }
    }


}
