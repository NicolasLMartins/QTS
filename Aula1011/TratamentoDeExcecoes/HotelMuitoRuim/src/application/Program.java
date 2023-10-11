package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
// import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {
    public static void main(String[] args) throws ParseException {
        
        Scanner read = new Scanner(System.in);
        // Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.print("Room number: ");
        int roomNumber = read.nextInt();
        
        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(read.next());

        System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(read.next());


        if (!checkOut.after(checkIn)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date.");
        } else {
            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.printf("Reservation: %s\n", reservation);

            System.out.println("\nEnter date to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(read.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(read.next());

            Date now = new Date();

            if (checkIn.before(now) || checkIn.before(now)) {
                System.out.println("Error in reservation: Updated reservation dates must be future dates.");
            } else if (!checkOut.after(checkIn)) {
                System.out.println("Error in reservation: Check-out date must be after check-in date.");
            } else {
                reservation.updateDates(checkIn, checkOut);
                System.out.printf("Reservation %s", reservation);
            }

        }

        read.close();
    }
}
