package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);;
        Scanner read = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department name: ");
        String departmentName = read.nextLine();
        System.out.println("\nENTER WORKER DATA: ");
        System.out.print("Name: ");
        String workerName = read.nextLine();
        System.out.print("Level: ");
        String workerLevel = read.nextLine();
        System.out.print("Salary: ");
        double baseSalary = read.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.print("\nHow many contracts does this worker have? ");
        int num = read.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.printf("\nENTER CONTRACT %d# DATA: \n", i + 1);
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(read.next());
            System.out.print("Value per hour: ");
            double valuePerHour = read.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = read.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = read.next();

        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.printf("Name: %s\n", worker.getName());
        System.out.printf("Department: %s\n", worker.getDepartment().getName());
        System.out.printf("Income for %s: %.2f\n", monthAndYear, worker.income(year, month));

        read.close();
    }
}
