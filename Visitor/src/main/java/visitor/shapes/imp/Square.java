package visitor.shapes.imp;

import visitor.visitors.Visitor;
import visitor.shapes.Shape;

public class Square implements Shape {
    public void draw() {
        // some drawing code
        System.out.println("Circle was drawn");
    }

    public void move(int x, int y) {
        // some movement
        System.out.println("Circle moved");
    }

    public void accept(Visitor visitor) {
        visitor.visitSquare(this);
    }
}
