package visitor.shapes.imp;

import visitor.visitors.Visitor;
import visitor.shapes.Shape;

public class Dot implements Shape{
    public void draw() {
        // some drawing code
        System.out.println("Dot was drawn");
    }

    public void move(int x, int y) {
        // some movement
        System.out.println("Dot moved");
    }

    public void accept(Visitor visitor) {
        visitor.visitDot(this);
    }
}
