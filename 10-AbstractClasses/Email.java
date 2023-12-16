public class Email extends Message {
    private String address;
    private String subject;


    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    public Email(String address, String subject, String text) {
        super(text);
        this.address = address;
        this.subject = subject;
    }

    public void send() {
        System.out.println("Sending email...");
        System.out.println("To: "+ getAddress());
        System.out.println("Subject: " + getSubject());
        System.out.println("Content: " + getText());
    }

    public static void main(String[] args) {
        Email mail = new Email("test@email.com", "Subject", "Hello");
        mail.send();
    }
}
