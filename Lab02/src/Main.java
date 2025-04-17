public class Main {
    public static void main(String[] args) {
        System.out.println("--- Line ---");
        Line l1 = new Line(1, 1);
        Line l2 = new Line(-1, 3);
        System.out.println("Перетин: " + l1.intersection(l2)); // (1.0;2.0)

        System.out.println("\n--- Segment ---");
        Segment s1 = new Segment(new Point(0, 0), new Point(2, 2));
        Segment s2 = new Segment(new Point(0, 2), new Point(2, 0));
        System.out.println("Довжина: " + s1.length());
        System.out.println("Середина: " + s1.middle());
        System.out.println("Перетин: " + s1.intersection(s2)); // (1.0;1.0)

        System.out.println("\n--- Triangle ---");
        Triangle t = new Triangle(new Point(0, 0), new Point(4, 0), new Point(2, 3));
        System.out.println("Площа: " + t.area());
        System.out.println("Центроїд: " + t.centroid()); // (2.0;1.0)
    }
}