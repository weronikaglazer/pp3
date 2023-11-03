public class Rectangle {
    int width;
    int height; 
    
    void displayInfo() {
        int surface = width * height;
        System.out.printf("Rectangle's dimensions are %dx%d%n", width, height);
        System.out.println("Rectangle's surface is " + surface + "\n");
    }

    public static void main(String[] args) {
        Rectangle a = new Rectangle();
        a.width = 3;
        a.height = 4;

        Rectangle b = new Rectangle();
        b.width = 2;
        b.height = 7;

        a.displayInfo();
        b.displayInfo();

    }
}
