package FiguresExtraChallenge;

public class Triangle extends Figure{

    Point a, b, c;

    public Triangle(Point a, Point b,Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        triangleExist(a, b, c);
        area();
    }

    @Override
    public Point centroid() {
        double x = (a.getX() + b.getX() + c.getX()) / 3;
        double y = (a.getY() + b.getY() + c.getY()) / 3;
        return new Point(x, y);
    }

    @Override
    public boolean isTheSame(Figure figure) {
        if (figure instanceof Triangle){
            Triangle triangle = (Triangle) figure;
            this.arrangement();
            triangle.arrangement();
            boolean result1 = a.getX() == triangle.a.getX() && a.getY() == triangle.a.getY();
            boolean result2 = b.getX() == triangle.b.getX() && b.getY() == triangle.b.getY();
            boolean result3 = c.getX() == triangle.c.getX() && c.getY() == triangle.c.getY();
            return result1 && result2 && result3;
        }else {
            return false;
        }
    }

    private void triangleExist(Point a, Point b, Point c) {
        if (a == null || b == null || c == null){
            throw new IllegalArgumentException();
        }
        double ab = Math.sqrt(Math.pow(b.getX() -  a.getX(),2) + Math.pow(b.getY() - a.getY(), 2));
        double ac = Math.sqrt(Math.pow(c.getX() -  a.getX(),2) + Math.pow(c.getY() - a.getY(), 2));
        double bc = Math.sqrt(Math.pow(c.getX() -  b.getX(),2) + Math.pow(c.getY() - b.getY(), 2));
        double p = (ab + ac + bc)/2; //half-meter
        double max1 = Math.max(ab, bc);
        double max = Math.max(max1, ac);
        if (max == p){
            throw new IllegalArgumentException("The triangle is degenerative");
        }
    }

    double area() {
        double result = 0.5 * Math.abs(a.getX() * (b.getY() - c.getY()) + b.getX() * (c.getY() - a.getY()) + c.getX() * (a.getY() - b.getY()));
        if (result<= 0){
            throw new IllegalArgumentException("The triangle has zero area");
        }else {
            return result;
        }
    }

    void arrangement(){
        Point[] coordinatesX = {a, b, c, };
        for (int i = 0; i < coordinatesX.length-1; i++) {
            for (int j = i+1; j < coordinatesX.length ; j++) {
                if (coordinatesX[i].getX() > coordinatesX[j].getX()){
                    Point tmp = coordinatesX[i];
                    coordinatesX[i] = coordinatesX[j];
                    coordinatesX[j] = tmp;
                }
            }
        }
        a = coordinatesX[0];
        b = coordinatesX[1];
        c = coordinatesX[2];
    }
}

