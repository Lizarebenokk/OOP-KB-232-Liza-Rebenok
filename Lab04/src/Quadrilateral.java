public class Quadrilateral extends Figure {
    private final Point a, b, c, d;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        if (new Triangle(a, b, c).area() + new Triangle(a, c, d).area() == 0) {
            throw new IllegalArgumentException("Вироджений чотирикутник");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double area() {
        return new Triangle(a, b, c).area() + new Triangle(a, c, d).area();
    }

    @Override
    public Point centroid() {
        return new Point((a.x + b.x + c.x + d.x) / 4, (a.y + b.y + c.y + d.y) / 4);
    }

    @Override
    public String toString() {
        return "Quadrilateral[" + a + " " + b + " " + c + " " + d + "]";
    }
}