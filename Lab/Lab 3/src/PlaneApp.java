import java.util.Scanner;

public class PlaneApp {
    public static void main(String[] args) {
        Plane plane = new Plane();

        Scanner sc = new Scanner(System.in);
        int choice;
        int seatId;
        int cust_Id;

        System.out.println("(1) Show number of empty seats");
        System.out.println("(2) Show the list of empty seats");
        System.out.println("(3) Show the list of seat assignments by seat ID");
        System.out.println("(4) Show the list of seat assignments by customer ID");
        System.out.println("(5) Assign a customer to a seat");
        System.out.println("(6) Remove a seat assignment");
        System.out.println("(7) Exit");

        do {
            System.out.println("Enter the number of your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    plane.showNumEmptySeats();
                    break;

                case 2:
                    System.out.println("The following seats are empty: ");
                    plane.showEmptySeats();
                    break;

                case 3:
                    System.out.println("The seat assignments are as follows: ");
                    plane.showAssignedSeats(true);
                    break;

                case 4:
                    System.out.println("The seat assignments are as follows: ");
                    plane.showAssignedSeats(false);
                    break;

                case 5:
                    System.out.println("Assigning Seat..");
                    System.out.println("Please enter SeatID: ");
                    seatId = sc.nextInt();

                    System.out.println("Please enter Customer ID: ");
                    cust_Id = sc.nextInt();

                    plane.assignSeat(seatId, cust_Id);
                    break;

                case 6:
                    System.out.println("Enter SeatID to unassign customer from: ");
                    seatId = sc.nextInt();

                    plane.unAssignSeat(seatId);
                    break;

            }
        } while (choice != 7);


    }
}