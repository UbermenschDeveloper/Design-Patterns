package visitor.shapes;

import visitor.visitors.Visitor;

public interface Shape {
    void draw();

    void move(int x, int y);

    void accept(Visitor visitor);
}
