package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int num = read.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.printf("EMPLOYEE #%d: \n", i + 1);
            System.out.print("Outsourced (y/n)? ");
            char ch = read.next().charAt(0);
            System.out.print("Name: ");
            read.nextLine();
            String name = read.nextLine();
            System.out.print("Hours: ");
            int hours = read.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = read.nextDouble();

            if (ch == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = read.nextDouble();

                list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge))
            } else {
                list.add(new Employee(name, hours, valuePerHour));
            }
        }
        
        read.close();
    }
}
