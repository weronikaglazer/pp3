public class SurfaceArea {
    static float rectangle(float a, float b){
        return a*b;
    }

    static float triangle(float a, float b) {
        return a*b/2;
    }

    static double circle(float a) {
        return Math.PI*(Math.pow(3, 2));
    }

    static float cuboid(float a, float b, float c) {
        return 2*a*b + 2*b*c + 2*a*c;
    }

    static double sphere(double a) {
        return 4 * Math.PI * Math.pow(a, 2);
    }

    static double cone(double a, double b) {
        return Math.PI * Math.pow(a, 2) + Math.PI * a * b;
    }
}


