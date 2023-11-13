public class Person {
    String name;
    int height;
    double weight;

    Person(String name) {
        this.name = name;
    }

    Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    void setWeightAndHeight(double weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    double calculateBMI() {
        return weight / Math.pow(height, 2);
    }

    void displayRecord() {
        if (this.calculateBMI() >= 18.5 && this.calculateBMI() <= 24.9) {
            System.out.printf("Your BMI is good - %.2f", this.calculateBMI());
        } else if (this.calculateBMI() < 18.5) {
            System.out.printf("Your BMI is too low - %.2f", this.calculateBMI());
        } else {
            System.out.printf("Your BMI is too high - %.2f", this.calculateBMI());
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("Weronika");
        Person p2 = new Person("Anastazja");
        Person p3 = new Person("Maciej");

        p1.setWeightAndHeight(49.5, 164);
        p2.setWeightAndHeight(48.2, 172);
        p3.setWeightAndHeight(78, 180);

        p1.displayRecord();
        System.out.println();
        p2.displayRecord();
        System.out.println();
        p3.displayRecord();
    }


}
