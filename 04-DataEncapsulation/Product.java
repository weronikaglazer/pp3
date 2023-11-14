public class Product {
    private String name;
    private boolean isVegetarian;

    public String getName() {
        return this.name;
    }

    public boolean getIsVegetarian() {
        return this.isVegetarian;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }

    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        p1.setName("Bread");
        p2.setName("Cheese");

        p1.setIsVegetarian(true);
        p2.setIsVegetarian(true);

        System.out.println(p1.getName() + " " + p1.getIsVegetarian());
        System.out.println(p2.getName() + " " + p2.getIsVegetarian());
    }
}
