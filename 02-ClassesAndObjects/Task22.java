public class Task22 {
    public static void main(String[] args) {
        int speed = 158;

        boolean isValid = speed >= 40 && speed <= 140 ? true : false;
        
        System.out.println("Vehicle speed: " + speed);
        System.out.println("Speed is valid: " + isValid);
    }
}
