public class Calculator {
    double segmentLength(Segment segment) {
        return Math.sqrt((segment.a.x - segment.b.x) * (segment.a.x - segment.b.x)
                + (segment.a.y - segment.b.y) * (segment.a.y - segment.b.y));
    }

    boolean buildTriangle(Point point1, Point point2, Point point3) {
        return Math.sqrt(Math.pow((point1.x - point2.x), 2) + Math.pow((point1.y - point2.y), 2))
                + Math.sqrt(Math.pow((point3.x - point2.x), 2) + Math.pow((point3.y - point2.y), 2))
                > Math.sqrt(Math.pow((point1.x - point3.x), 2) + Math.pow((point1.y - point3.y), 2))
                ||
                Math.sqrt(Math.pow((point1.x - point2.x), 2) + Math.pow((point1.y - point2.y), 2))
                        < Math.sqrt(Math.pow((point3.x - point2.x), 2) + Math.pow((point3.y - point2.y), 2))
                        + Math.sqrt(Math.pow((point1.x - point3.x), 2) + Math.pow((point1.y - point3.y), 2))
                ||
                Math.sqrt(Math.pow((point1.x - point2.x), 2) + Math.pow((point1.y - point2.y), 2))
                        + Math.sqrt(Math.pow((point3.x - point1.x), 2) + Math.pow((point3.y - point1.y), 2))
                        > Math.sqrt(Math.pow((point2.x - point3.x), 2) + Math.pow((point2.y - point3.y), 2));
    }
}
