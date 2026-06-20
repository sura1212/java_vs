import java.util.Scanner;

public class Ticket_Booking {
    static String[][] Seats = new String[9][6];
    static Scanner get = new Scanner(System.in);

    static void View() {
        System.out.println("\nCurrent Seat Layout:");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(Seats[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.print("Want to book tickets (Yes/No): ");
        String choice = get.nextLine();
        if (choice.equalsIgnoreCase("Yes")) {
            Booking();
        } else {
            System.out.println("Thanks for your Visit.");
        }
    }

    static void Booking() {
        System.out.print("Select your row (1-9): ");
        int T_row = get.nextInt() - 1;
        System.out.print("Select your seat (1-6): ");
        int T_col = get.nextInt() - 1;
        get.nextLine(); 

        if (Seats[T_row][T_col].equals("Available")) {
            Seats[T_row][T_col] = "Booked";
            System.out.println("Your Ticket is Booked.");
        } else {
            System.out.println("Seat is not Available.");
        }
        View();
    }

    Ticket_Booking() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 6; j++) {
                Seats[i][j] = "Available";
            }
        }
    }

    public static void main(String[] args) {
        new Ticket_Booking();
        System.out.print("Want to Book Movie Tickets (Yes/No): ");
        String choice = get.nextLine();
        if (choice.equalsIgnoreCase("Yes")) {
            View();
        } else {
            System.out.println("Thanks for your Visit.");
        }
    }
}
