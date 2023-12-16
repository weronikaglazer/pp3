public class SMS extends Message {
    private String phoneNumber;

    public SMS(String phoneNumber, String text) {
        super(text);
        this.phoneNumber = phoneNumber;
    }


    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public int charNumber() {
        return super.charNumber();
    }


    @Override
    public void send() {
       System.out.println("Sending message: " + getText());
    }


    public static void main(String[] args) {
        SMS sms = new SMS("555444333","Text");
        sms.send();
    }
}
