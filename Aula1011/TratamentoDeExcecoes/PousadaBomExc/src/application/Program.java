package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
// import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner read = new Scanner(System.in);
        // Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int roomNumber = read.nextInt();

            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(read.next());

            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(read.next());
            
            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            // reservation.updateDates(checkIn, checkOut);
            System.out.printf("Reservation: %s\n", reservation);
            
            System.out.println("\nEnter date to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(read.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(read.next());
            
            //Falta um m??todo para atualizar as datas das reservas
            reservation.updateDates(checkIn, checkOut);
            System.out.printf("Reservation: %s\n", reservation);
            
            read.close();

        } catch (ParseException e) {
            System.out.println("Invalid date format!");
        } catch (DomainException e) {
            System.out.printf("Error in reservation: %s\n", e.getMessage());
        }
    }
}
