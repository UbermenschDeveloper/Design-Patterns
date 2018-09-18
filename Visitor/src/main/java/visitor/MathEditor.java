package visitor;

import visitor.shapes.Shape;
import visitor.shapes.imp.Dot;
import visitor.shapes.imp.Square;

import java.util.ArrayList;
import java.util.List;

public class MathEditor {
    private List<Shape> shapes = new ArrayList<Shape>();

    public MathEditor() {
        this.init();
    }

    public List<Shape> getShapes() {
        return this.shapes;
    }

    private void init() {
        int count = 20;
        this.shapes.addAll(getNewDots(count));
        this.shapes.addAll(getNewCircles(count));
        this.shapes.addAll(getNewSquares(count));
    }

    private List<Shape> getNewDots(int count) {
        List<Shape> dots = new ArrayList<Shape>();

        for (int i = 0; i < count; ++i) {
            dots.add(new Dot());
        }

        return dots;
    }

    private List<Shape> getNewSquares(int count) {
        List<Shape> squares = new ArrayList<Shape>();

        for (int i = 0; i < count; ++i) {
            squares.add(new Square());
        }

        return squares;
    }

    private List<Shape> getNewCircles(int count) {
        List<Shape> circles = new ArrayList<Shape>();

        for (int i = 0; i < count; ++i) {
            circles.add(new Dot());
        }

        return circles;
    }
}
