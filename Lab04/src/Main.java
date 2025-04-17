public class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle(new Point(2, 0), new Point(4, 0), new Point(2, 3));
        Quadrilateral q = new Quadrilateral(new Point(0, 0), new Point(4, 0), new Point(4, 3), new Point(0, 3));
        Circle c = new Circle(new Point(2, 2), 3);

        System.out.println("--- Трикутник ---");
        System.out.println(t);
        System.out.println("Площа трикутника: " + t.area());
        System.out.println("Центроїд трикутника: " + t.centroid());
        
        System.out.println("\n--- Чотирикутник ---");
        System.out.println(q);
        System.out.println("Площа чотирикутника: " + q.area());
        System.out.println("Центроїд чотирикутника: " + q.centroid());
        
        System.out.println("\n--- Коло ---");
        System.out.println(c);
        System.out.println("Площа кола: " + c.area());
        System.out.println("Центроїд кола: " + c.centroid());

      
    }
}