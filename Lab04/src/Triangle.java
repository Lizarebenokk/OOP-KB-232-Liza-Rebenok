public class Triangle extends Figure {
    private final Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        if (areaInternal(a, b, c) == 0) {
            throw new IllegalArgumentException("Вироджений трикутник");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double areaInternal(Point a, Point b, Point c) {
        return Math.abs((a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)) / 2.0);
    }

    @Override
    public double area() {
        return areaInternal(a, b, c);
    }

    @Override
    public Point centroid() {
        return new Point((a.x + b.x + c.x) / 3, (a.y + b.y + c.y) / 3);
    }

    @Override
    public String toString() {
        return "Triangle[" + a + " " + b + " " + c + "]";
    }
}
