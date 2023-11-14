public class Point {
    private int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isX() {
        if (this.x == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isY() {
        if (this.y == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "P(" + this.x + "," + this.y + ")";
    }

    public static void main(String[] args) {
        Point p1 = new Point(3, 0);

        System.out.println(p1.isX());
        System.out.println(p1.isY());
        System.out.println(p1.toString());
    }
}
