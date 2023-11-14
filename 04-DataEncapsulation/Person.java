public class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        if (this.getAge() >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return this.getName() + ", " + this.getAge();
    }

    public static void main(String[] args) {
        Person person1 = new Person("Frank", 20);
        person1.getAge();
        person1.isAdult();
        person1.setAge(12);
        person1.isAdult();
        person1.toString();
    }




}
