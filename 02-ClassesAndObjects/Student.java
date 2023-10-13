public class Student {
    String name;
    int age;
    int studentID;
    boolean isStudentIDValid;
    int semesterNumber;
    double averageGrade;


    void sayHello() {
        System.out.println("Hello from " + name);
    }

    void displayName() {
        System.out.println("My name is " + name);
    }

    void displayAge() {
        System.out.println("My age is " + age);
    }

    void displayInfo() {
        System.out.println("Name: " + name + "\n" + "Semester Number: " + semesterNumber + "\n" + "Average grade: " + averageGrade);
    }

    void changeStudentIDStatus() {
        isStudentIDValid = !isStudentIDValid;
    }

    void displayStudentID() {
        System.out.println("Name: " + name + "\n" + "StudentID: " + studentID + "\n" + "ID status: " + (isStudentIDValid ? "valid" : "invalid"));
    }
    public static void main(String[] args) {
        Student a = new Student();
        Student b = new Student();

        a.name = "Alice";
        a.age = 19;
        a.studentID = 225;
        a.isStudentIDValid = true;
        a.semesterNumber = 3;
        a.averageGrade = 4.2;

        b.name = "Mark";
        b.age = 20;
        b.studentID = 992;
        b.isStudentIDValid = false;
        b.semesterNumber = 3;
        b.averageGrade = 3.8;

        a.displayName();
        a.changeStudentIDStatus();
        a.displayStudentID();

        b.sayHello();
        b.displayInfo();
    }
}



