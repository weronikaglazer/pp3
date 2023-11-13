public class InternetDevice {
    String name;
    boolean connected = false;
    static int connectedDevices = 0;

    InternetDevice(String name) {
        this.name = name;
    }

    void connect() {
        this.connected = true;
    }

    void disconnect() {
        this.connected = false;
    }

    boolean isConnected() {
        return this.connected;
    }

    void displayStatus() {
        System.out.println("Device: " + this.name);
        System.out.println("Connected: " + (this.connected ? "yes" : "no"));
    }

    static void displayConnections() {
        System.out.println("Connected devices: " + connectedDevices);
    }

    public static void main(String[] args) {
        InternetDevice d1 = new InternetDevice("CCTV");
        InternetDevice d2 = new InternetDevice("Playstation");
        InternetDevice d3 = new InternetDevice("Computer");
        InternetDevice d4 = new InternetDevice("TV");
        InternetDevice d5 = new InternetDevice("Phone");

        d1.connect();
        d2.connect();
        d3.connect();

        d4.displayStatus();
        d5.displayStatus();

        InternetDevice.displayConnections();
    }



}
