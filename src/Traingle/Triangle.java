package Traingle;

public class Triangle {
    Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        //TODO
        this.a = a;
        this.b = b;
        this.c = c;
        triangleExist(this.a, this.b, this.c);
    }

    public double area() {
        //TODO
        return 0.5 * Math.abs(a.getX() * (b.getY() - c.getY()) + b.getX() * (c.getY() - a.getY()) + c.getX() * (a.getY() - b.getY()));
    }

    public Point centroid() {
        //TODO
        double x = (a.getX() + b.getX() + c.getX()) / 3;
        double y = (a.getY() + b.getY() + c.getY()) / 3;
        return new Point(x, y);
    }

    private void triangleExist(Point a, Point b, Point c) {
        double ab = Math.sqrt((b.getX() - a.getX()) * (b.getX() - a.getX()) + (b.getY() - a.getY()) * (b.getY() - a.getY()));
        double ac = Math.sqrt((c.getX() - a.getX()) * (c.getX() - a.getX()) + (c.getY() - a.getY()) * (c.getY() - a.getY()));
        double bc = Math.sqrt((c.getX() - b.getX()) * (c.getX() - b.getX()) + (c.getY() - b.getY()) * (c.getY() - b.getY()));
        double p = (ab + ac + bc)/2;
        double max1 = Math.max(ab, bc);
        double max = Math.max(max1, ac);
        if (max == p){
            System.out.println("The triangle is degenerative");
            throw new RuntimeException();
        }else{
            if ((max == ab) && (max >= ac + bc)){
                System.out.println("The triangle does not exist");
                throw new ArithmeticException();
            }
            if ((max == bc) && (max >= ac + ab)){
                System.out.println("The triangle does not exist");
                throw new ArithmeticException();
            }
            if ((max == ac) && (max >= bc + ab)){
                System.out.println("The triangle does not exist");
                throw new ArithmeticException();
            }
        }
    }

}
