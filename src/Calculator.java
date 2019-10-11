public class Calculator {
    double segmentLength(Segment segment) {
        return Math.sqrt((segment.getA().getX() - segment.getB().getX()) * (segment.getA().getX()
                - segment.getB().getX()) + (segment.getA().getY() - segment.getB().getY())
                * (segment.getA().getY() - segment.getB().getY()));
    }

    boolean buildTriangle(Point point1, Point point2, Point point3) {
        double sideA = Math.sqrt(Math.pow((point1.getX() - point2.getX()), 2)
                + Math.pow(point1.getY() - point2.getY(), 2));
        double sideB = Math.sqrt(Math.pow((point3.getX() - point2.getX()), 2)
                + Math.pow(point1.getX() - point2.getX(), 2));
        double sideC = Math.sqrt(Math.pow((point1.getX() - point3.getX()), 2)
                + Math.pow((point1.getY() - point3.getY()), 2));
        return sideA + sideB > sideC || sideA + sideC > sideB || sideB + sideC > sideA;
    }
}
