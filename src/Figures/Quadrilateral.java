package Figures;

public class Quadrilateral extends Figure{

    Point a,b,c,d;
    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double area() {
        double tr1S =  0.5 * Math.abs(a.getX() * (b.getY() - c.getY()) + b.getX() * (c.getY() - a.getY()) + c.getX() * (a.getY() - b.getY()));
        double tr2S =  0.5 * Math.abs(a.getX() * (d.getY() - c.getY()) + d.getX() * (c.getY() - a.getY()) + c.getX() * (a.getY() - d.getY()));
        return tr1S + tr2S;
    }

    @Override
    public String pointsToString() {
        return a.toString() + b.toString() + c.toString() + d.toString();
    }

    @Override
    public Point leftmostPoint() {
        double min1 = Math.min(a.getX(), b.getX());
        double min2 = Math.min(c.getX(), d.getX());
        double min = Math.min(min1, min2);
        if (min == a.getX()) {
            return new Point(min, a.getY());
        } else if (min == b.getX()){
            return new Point(min, b.getY());
        }else if (min == c.getX()){
            return new Point(min, c.getY());
        } else{
            return new Point (min, d.getY());
        }
    }
}

