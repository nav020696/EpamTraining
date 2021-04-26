package Segments;

public class Main {
    public static void main(String[] args) {

        {
            Segment segment = new Segment(new Point(2, 0), new Point(0, 2));
            Point midpoint = segment.middle();

            System.out.println(midpoint.getX());
            System.out.println(midpoint.getY());

        }

    }

}
