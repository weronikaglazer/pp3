import java.nio.file.attribute.AclEntry;

public class Computer {
    private int storage;
    private String brand;
    private String operatingSystem;
    private boolean isOn = false;
    private Processor processor;

    Computer(int storage, String brand, String operatingSystem, Processor processor) {
        this.storage = storage;
        this.brand = brand;
        this.operatingSystem = operatingSystem;
        this.processor = processor;
    }

    void switchOnOff() {
        isOn = !isOn;
    }

    String isOn() {
        String isOnString = isOn ? "Computer is on" : "Computer is off";
        return isOnString;
    }

    String openBrowser() {
        return "Browser opened";
    }

    String openFile() {
        return "File opened";
    }

    String runProgram() {
        return "Program is running";
    }

    public static void main(String[] args) {
        Processor proc = new Processor();
        Computer myPC = new Computer(500, "Acer", "Windows", proc);

        myPC.isOn();
        myPC.runProgram();

    }

}