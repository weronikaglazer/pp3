public class Smartphone {
    String brand;
    String model;
    String color;
    int memoryInGB;
    int batteryLevel;
    boolean isTurnedOn;

    void switchOnOff() {
        isTurnedOn = !isTurnedOn;
        String isOn = isTurnedOn ? "on" : "off";
        System.out.println("Phone is switched " + isOn);
    }

    void displayInfo() {
        System.out.println("Phone info...");
    }

    void checkBatteryLevel() {
        System.out.println("Battery level is " + batteryLevel + "%");
    }
}
