public class Task14 {
    static String string = "Have a nice day!";

    static String displayFirstNineChars() {
        String output = "";
        for (int i = 0; i < 9; i++) {
            output += string.charAt(i);
        }
        return output;
    }
    public static void main(String[] args) {
        System.out.println("String has : " + string.length() + "characters");
        System.out.println("First 9 characters are: " + displayFirstNineChars());
        System.out.println("Does it and with 'day!'?" + (string.endsWith("day!") ? true : false));
        System.out.println("Is it empty? "+ string.isEmpty());
        System.out.println("Last index of letter e is " + string.lastIndexOf("e"));
        System.out.println(string.replace(" ", "-"));
        System.out.println(string.toUpperCase());

    }
}
