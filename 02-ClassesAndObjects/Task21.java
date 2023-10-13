public class Task21 {
    public static void main(String[] args) {
        int centimeters = 164;

        float feet = centimeters * 0.032808f;
        int feetRounded = Math.round(feet);

        float inches = (feet - feetRounded) * 12;
        int inchesRounded = Math.round(inches);

        System.out.println("I am " + centimeters + "cm tall, i.e. " + feetRounded + " feet and " + inchesRounded + " inches.");
    }
}