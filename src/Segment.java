class Segment {
    private Point a;
    private Point b;

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    double length() {
        return Math.sqrt((a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()));
    }
}
