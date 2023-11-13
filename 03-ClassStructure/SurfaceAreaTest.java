public class SurfaceAreaTest {
    public static void main(String[] args) {
        System.out.print("Rectangle area (5,2) is ");
        System.out.println(SurfaceArea.rectangle(5,2));
        System.out.print("Triangle area (3,5) is ");
        System.out.println(SurfaceArea.triangle(3,5));
        System.out.print("Cirle area (3) is ");
        System.out.println(SurfaceArea.circle(3));
        System.out.print("Cuboid area (3,4,5) is ");
        System.out.println(SurfaceArea.cuboid(3,4,5));
        System.out.print("Sphere area (5) is ");
        System.out.println(SurfaceArea.sphere(5));
        System.out.print("Cone area (3,9) is ");
        System.out.println(SurfaceArea.cone(3,9));
    }
}