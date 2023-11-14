public class DrivingLicence {
    private String name, surname, address, postalCode, city;
    private int licenceNumber, yearOfIssue;
    private char licenceCategory;

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Surname: " + this.surname);
        System.out.println("Address: " + this.address);
        System.out.println("Postal code: " + this.postalCode);
        System.out.println("City: " + this.city);
        System.out.println("License number: " + this.licenceNumber);
        System.out.println("Year of issue: " + this.yearOfIssue);
        System.out.println("Driving Category: " + this.licenceCategory);
    }

    public void setName(String name) {
        String firstLetter = "";
        String restOfName = "";

        firstLetter += name.charAt(0);
        restOfName = name.substring(1);

        this.name = String.join("", firstLetter.toUpperCase(), restOfName.toLowerCase());
    }

    public String getName() {
        return this.name;
    }

    public void setYearOfIssue(int year) {
        if (year >= 1980 && year <= 2023) {
            this.yearOfIssue = year;
        }
    }

    

    public static void main(String[] args) {        
        DrivingLicence dl = new DrivingLicence();        
        dl.setName("Mark");
        dl.display(); 
    } 
}