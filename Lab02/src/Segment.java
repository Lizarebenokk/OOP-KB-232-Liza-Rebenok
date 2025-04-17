public class Segment {
    private Point start, end;
    public Segment(Point start, Point end) {
        if (start.x == end.x && start.y == end.y) {
            throw new IllegalArgumentException("Вироджений сегмент");
        }
        this.start = start;
        this.end = end;
    }
    public double length() {
        return Math.sqrt(Math.pow(end.x - start.x, 2) + Math.pow(end.y - start.y, 2));
    }
    public Point middle() {
        return new Point((start.x + end.x) / 2, (start.y + end.y) / 2);
    }
    public Point intersection(Segment another) {
        Line l1 = new Line((end.y - start.y) / (end.x - start.x),
                           start.y - ((end.y - start.y) / (end.x - start.x)) * start.x);
        Line l2 = new Line((another.end.y - another.start.y) / (another.end.x - another.start.x),
                           another.start.y - ((another.end.y - another.start.y) / (another.end.x - another.start.x)) * another.start.x);
        Point p = l1.intersection(l2);
        if (p == null) return null;
        if (Math.min(start.x, end.x) <= p.x && p.x <= Math.max(start.x, end.x) &&
            Math.min(start.y, end.y) <= p.y && p.y <= Math.max(start.y, end.y) &&
            Math.min(another.start.x, another.end.x) <= p.x && p.x <= Math.max(another.start.x, another.end.x) &&
            Math.min(another.start.y, another.end.y) <= p.y && p.y <= Math.max(another.start.y, another.end.y)) {
            return p;
        }
        return null;
    }
}