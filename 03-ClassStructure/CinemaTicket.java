public class CinemaTicket {
    static String cinemaName = "Morning Star Cinema";
    String filmTitle;
    int row, seat, price;

    CinemaTicket(int row, int seat, String filmTitle) {
        this.row = row;
        this.seat = seat;
        this.filmTitle = filmTitle;

        if (row < 3) {
            this.price = 10;
        } else {
            this.price = 25;
        }
    }

    @Override
    public String toString() {
        return "Cinema name: " + cinemaName + "/nFilm title: " + this.filmTitle + "/nRow: " + this.row + "/nSeat: " + this.seat;
    }

    void display() {
        System.out.println(this.toString());
    }

    public static void main(String[] args) {
        CinemaTicket t1 = new CinemaTicket(2, 12, "Gladiator");
        CinemaTicket t2 = new CinemaTicket(7, 4, "Gladiator");

        t1.display();
        System.out.println();
        t2.display();
    }
}
