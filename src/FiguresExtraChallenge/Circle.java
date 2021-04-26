package FiguresExtraChallenge;

public class Circle extends Figure{

    Point a;
    double radius;
    public Circle(Point a, double radius) {
        this.a = a;
        this.radius = radius;
        area();
    }

    @Override
    public Point centroid() {
        return a;
    }

    @Override
    public boolean isTheSame(Figure figure) {
        if (figure instanceof Circle){
            Circle circle = (Circle) figure;
            boolean inaccuracy1 = Math.abs(circle.a.getX() - a.getX()) < 0.00001;
            boolean inaccuracy2 = Math.abs(circle.a.getY() - a.getY()) < 0.00001;
            boolean inaccuracyRadius = Math.abs(circle.radius - radius) < 0.00001;
            if (inaccuracy1 && inaccuracy2 && inaccuracyRadius){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }

    void area() {
        if (radius <= 0 || a == null){
            throw new IllegalArgumentException();
        }
    }
}
