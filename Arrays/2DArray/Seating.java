public class Seating {
    private char[][] seats;

    // Constructor for creating the 2D array for the seating plan. A = Available seat, B = Booked seat
    public Seating(int rows, int cols) {
        seats = new char[rows][cols];
        for (int row = 0; row < seats.length; row++) {
            for (int col = 0; col < seats[row].length; col++) {
                seats[row][col] = 'A';
            }
        }
    }
    
    // Method to make sure the chosen seat is valid, returns true if valid, false otherwise
    public boolean validSeat (int row, int col) {
        return row >= 0 && row < seats.length && col >= 0 && col < seats[0].length; 
    }

    // Method to suggest an open seat to the user. Used within the reserveSeat method.
    public void suggestSeat () {
        for (int row = 0; row < seats.length; row++) {
            for (int col = 0; col < seats[row].length; col ++) {
                if (seats[row][col] == 'A') {
                    System.out.println("Suggested open seat: " + row + "," + col);
                    return;
                }
            }
        }
    }

    // Reserves a seat for the user based on their input for row and column, basic validation included.
    public void reserveSeat (int row, int col) {
        if (validSeat(row, col)) {
            if (seats[row][col] == 'B') {
                System.out.println("Seat already taken.");
                suggestSeat();
            } else {
                seats[row][col] = 'B';
                System.out.println("Your seat has been reserved!");
            }
        } else {
            System.out.println("Invalid seat, please try again.");
        }
    }

    // Cancels a reservation for the user depending on their choice of row and column. Similar logic to the reserveSeat method.
    public void cancelSeat (int row, int col) {
        if (validSeat(row, col)) {
            if (seats[row][col] == 'A') {
                System.out.println("You cannot cancel a reservation on an availiable seat.");
            } else {
                seats[row][col] = 'A';
                System.out.println("Your seat reservation has been canceled.");
            }
        } else {
            System.out.println("Invalid seat, please try again.");
        }
    }

    // Displays the seating chart for the user.
    public void displaySeatingChart () {
        System.out.println("Seating Chart: ");
        for (int row = 0; row < seats.length; row ++) {
            for (int col = 0; col < seats[row].length; col++) {
                System.out.print(seats[row][col] + " ");
            }
        }
        System.out.println("");
    }
}
