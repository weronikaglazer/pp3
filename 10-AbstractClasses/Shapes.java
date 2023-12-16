class Rectangle extends Shape {
    int a = 4;

    public double area(){
        return a*a;
    }

    public double perimeter() {
        return 4*a;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(r.area());
        System.out.println(r.perimeter());
    }
}

class Triangle extends Shape {
    int a = 4;
    int h = 7;
    int b = 6;
    int c = 9;

    public double area(){
        return a*h/2;
    }

    public double perimeter() {
        return a+b+c;
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.println(t.area());
        System.out.println(t.perimeter());
    }
}

class Circle extends Shape {
    int r = 4;

    public double area(){
        return r*r*Math.PI;
    }

    public double perimeter() {
        return 2*Math.PI*r;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.area());
        System.out.println(c.perimeter());
    }
}

abstract class Shape {
    public abstract double area();
    public abstract double perimeter();
}