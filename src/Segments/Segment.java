package Segments;

public class Segment {

    private Point start, end;

    public Segment(Point start, Point end) {
        if ((start.getX() == end.getX()) && (start.getY() == end.getY())) {
            throw new ArithmeticException("Segment is degenerative");
        } else {
            this.start = start;
            this.end = end;
        }
    }

    public double length() {
        return Math.sqrt(Math.pow(end.getX() - start.getX(), 2) + Math.pow(end.getY() - start.getY(), 2));
    }

    public Point middle() {
        return new Point((start.getX() + end.getX()) / 2, (start.getY() + end.getY()) / 2);
    }

    public Point intersection(Segment another) {
        if ((start.getX() / another.start.getX() == start.getY() / another.start.getY())) {
            return null;
        }

        if (end.getX() < start.getX()){
            Point tmp = start;
            start = end;
            end = tmp;
        }

        if (another.end.getX() < another.start.getX()){
            Point tmp = another.start;
            another.start = another.end;
            another.end = tmp;
        }

        //parameters of segments;
        double a1 = start.getY() - end.getY();
        double b1 = end.getX() - start.getX();
        double a2 = another.start.getY() - another.end.getY();
        double b2 = another.end.getX() - another.start.getX();

        //coordinates of the intersection point
        double d = a1 * b2 - a2 * b1;
        if (d != 0) {
            double c1 = end.getY() * start.getX() - end.getX() * start.getY();
            double c2 = another.end.getY() * another.start.getX() - another.end.getX() * another.start.getY();
            double x = (b1 * c2 - b2 * c1) / d;
            double y = (a2 * c1 - a1 * c2) / d;

            if ((x >= start.getX() && x <=end.getX()) && (x >= another.start.getX() && (x <= another.end.getX()))){
                double p = (x - end.getX())/(start.getX() - end.getX());
                double p2 = p * start.getY() + (1 - p) * end.getY();

                double scale = Math.pow(10, 10);
                double result = Math.ceil(p2 * scale)/scale;
                double result2 = Math.ceil(y * scale)/scale;

                //double.compare попробовать

                boolean res = result == result2;

                if (p>= 0 && p<=1 && res){
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
