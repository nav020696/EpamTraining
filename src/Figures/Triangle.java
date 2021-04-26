package Figures;

public class Triangle extends Figure {

    Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        return 0.5 * Math.abs(a.getX() * (b.getY() - c.getY()) + b.getX() * (c.getY() - a.getY()) + c.getX() * (a.getY() - b.getY()));
    }

    @Override
    public String pointsToString() {
        return a.toString() + b.toString() + c.toString();
    }

    @Override
    public Point leftmostPoint() {
        double min1 = Math.min(a.getX(), b.getX());
        double min = Math.min(min1, c.getX());
        if (min == a.getX()) {
            return new Point(min, a.getY());
        } else if (min == b.getX()){
            return new Point(min, b.getY());
        }else {
            return new Point(min, c.getY());
        }
    }
}

