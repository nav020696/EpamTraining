package FiguresExtraChallenge;

public class Quadrilateral extends Figure{

    Point a,b,c,d;
    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        exist();
    }

    @Override
    public Point centroid() {
        Triangle triangle1 = new Triangle(a,b,c);
        Triangle triangle2 = new Triangle(a,d,c);
        double area1 = triangle1.area();
        double area2 = triangle2.area();
        Point centroid1 = triangle1.centroid();
        Point centroid2 = triangle2.centroid();

        double x = (area1 * centroid1.getX() + area2 * centroid2.getX())/(area1 + area2);
        double y = (area1 * centroid1.getY() + area2 * centroid2.getY())/(area1 + area2);
        return new Point(x,y);
    }

    @Override
    public boolean isTheSame(Figure figure) {
        if (figure instanceof Quadrilateral){
            Quadrilateral quadrilateral = (Quadrilateral) figure;
            this.arrangement();
            quadrilateral.arrangement();
            boolean result1 = Math.abs(quadrilateral.a.getX() - a.getX()) < 0.0001 && Math.abs(quadrilateral.a.getY() - a.getY()) < 0.0001;
            boolean result2 = Math.abs(quadrilateral.b.getX() - b.getX()) < 0.0001 && Math.abs(quadrilateral.b.getY() - b.getY()) < 0.0001;
            boolean result3 = Math.abs(quadrilateral.c.getX() - c.getX()) < 0.0001 && Math.abs(quadrilateral.c.getY() - c.getY()) < 0.0001;
            boolean result4 = Math.abs(quadrilateral.d.getX() - d.getX()) < 0.0001 && Math.abs(quadrilateral.d.getY() - d.getY()) < 0.0001;
            return result1 && result2 && result3 && result4;
        }else {
            return false;
        }
    }

    void exist() {
        if (a == null || b == null || c == null || d == null){
            throw new IllegalArgumentException();
        }
        Point o = intersectionOfDiagonals();
        if (o == null){
            throw new IllegalArgumentException();
        }
        Triangle tr1 = new Triangle(a, b, o);
        Triangle tr2 = new Triangle(b, c, o);
        Triangle tr3 = new Triangle(c, d, o);
        Triangle tr4 = new Triangle(d, a, o);
    }

    void arrangement(){
        Point[] coordinatesX = {a, b, c, d};
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
        d = coordinatesX[3];
    }

    Point intersectionOfDiagonals(){
        if ((a.getX() / b.getX() == a.getY() / b.getY()) && a.getX() != 0 && a.getY() != 0 && b.getX() !=0 && b.getY()!=0 ) {
            return null;
        }

        if (c.getX() < a.getX()){
            Point tmp = a;
            a = c;
            c = tmp;
        }

        if (d.getX() < b.getX()){
            Point tmp = b;
            b = d;
            d = tmp;
        }

        //parameters of segments;
        double a1 = a.getY() - c.getY();
        double b1 = c.getX() - a.getX();
        double a2 = b.getY() - d.getY();
        double b2 = d.getX() - b.getX();

        //coordinates of the intersection point
        double q = a1 * b2 - a2 * b1;
        if (q != 0) {
            double c1 = c.getY() * a.getX() - c.getX() * a.getY();
            double c2 = d.getY() * b.getX() - d.getX() * b.getY();
            double x = (b1 * c2 - b2 * c1) / q;
            double y = (a2 * c1 - a1 * c2) / q;

            if ((x >= a.getX() && x <=c.getX()) && (x >= b.getX() && (x <= d.getX()))){
                double p = (x - c.getX())/(a.getX() - c.getX());
                double p2 = p * a.getY() + (1 - p) * c.getY();

                boolean res1 = Math.abs(p2-y) < 0.0001;

                if (p>= 0 && p<=1 && res1){
                    return new Point(x,y);
                }else{
                    return null;
                }
            }else {
                return null;
            }

        } else {
            return null;
        }
    }
}

