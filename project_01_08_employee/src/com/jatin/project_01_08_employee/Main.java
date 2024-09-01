package com.jatin.project_01_08_employee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        EmployeeList empList = new EmployeeList();

        Scanner sc = new Scanner(System.in);

        int input = 0;

        do {
            System.out.println("======= Main Menu ==========");
            System.out.printf("%-3s %-20s %n", "1.", "Add an employee");
            System.out.printf("%-3s %-20s %n", "2.", "List all employees");
            System.out.printf("%-3s %-20s %n", "3.", "List all employees who are managers");
            System.out.printf("%-3s %-20s %n", "4.", "Delete an employee");
            System.out.printf("%-3s %-20s %n", "5.", "Exit");
            System.out.print("Select an option (1-5): ");

            input = sc.nextInt();
            sc.nextLine();

            switch (input) {
                case 1:
                    Employee newEmployee = getNewEmployeeDetails(sc);
                    empList.addEmployee(newEmployee);
                    break;
                case 2:
                    empList.listAllEmployees();
                    break;
                case 3:
                    empList.listAllManagers();
                    break;
                case 4:
                    System.out.print("Enter Employee ID to delete: ");
                    int empIdToDelete = sc.nextInt();
                    sc.nextLine();
                    empList.deleteEmployee(empIdToDelete);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please select a number between 1 and 5.");
            }

            // Print a blank line for readability
            System.out.println();
        } while (input == 0);

        sc.close();
    }

    private static Employee getNewEmployeeDetails(Scanner sc) {
        int empId = sc.nextInt();
        sc.nextLine();
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        String designation = sc.nextLine();
        String mobNo = sc.nextLine();
        float salary = sc.nextFloat();
        sc.nextLine();
        return new Employee(empId, firstName, lastName, designation, mobNo, salary);
    }

}
