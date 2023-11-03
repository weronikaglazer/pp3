public class Task24 {
    public static void main(String[] args) {
        int hours = 14;
        int minutes = 27;

        int totalMinutes = hours * 60 + minutes;
        int totalSeconds = totalMinutes * 60;

        System.out.printf("hours = %d%n", hours);
        System.out.printf("minutes = %d%n", minutes);
        System.out.printf("time: %02d:%02d%n", hours, minutes);
        System.out.printf("minutes from midnight: %d%n", totalMinutes);
        System.out.printf("seconds from midnight: %d%n", totalSeconds);
    }
}
