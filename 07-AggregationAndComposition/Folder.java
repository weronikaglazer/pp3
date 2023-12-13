import java.util.ArrayList;

public class Folder {
    private String name;
    private ArrayList<File> files;

    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<>();
    }

    public void addFile(File file) {
        files.add(file);
    }
    
    public void removeFile(String filename) {
        files.removeIf(file -> file.getName().equals(filename));
    }

    public void displayContents() {
        System.out.println("Folder Contents: " + name);

        for (File file : files) {
            System.out.println("File: " + file.getName() + ", Size: " + file.getSize());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Folder folder = new Folder("Folder");

        File file1 = new File("file1", 54);
        File file2 = new File("file2", 31);

        folder.addFile(file1);
        folder.addFile(file2);

        folder.displayContents();

        File file3 = new File("file3", 34);
        folder.addFile(file3);

        folder.displayContents();

        folder.removeFile("file2");
        folder.displayContents();
    }
}

