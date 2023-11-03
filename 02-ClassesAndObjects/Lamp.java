public class Lamp {
    boolean isOn;

    void switchOn() {
        isOn = true;
    }

    void switchOff() {
        isOn = false;
    }

    void displayState() {
        String state = isOn ? "on" : "off";
        System.out.println("The lamp is " + state);
    }

    public static void main(String[] args) {
        Lamp a = new Lamp();
        Lamp b = new Lamp();

        a.switchOn();
        b.switchOff();
        a.displayState();
        b.displayState();
    }
}
