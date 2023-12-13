public class Publisher {
    private String city;
    private String name;

    public Publisher(String name, String city) {
        this.city = city;
        this.name = name;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
