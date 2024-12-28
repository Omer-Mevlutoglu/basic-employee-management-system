package EmployeeOOPproject;

import java.io.IOException;
import java.util.Scanner;

public class TheMainProg {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Departmet d = new Departmet();
        System.out.println("Welcome to Employee mangement system");
        System.out.println();
        try {
            d.loadFromFile();
            System.out.println("Employee data loaded from file.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No existing employee data found. Starting fresh.");
        }

        while (true) {
            System.out.println(
                    "A.Specify the type \n1.Salaried Employee\n2.Hourly Employee\n3.Get All Employee details\n4.Exit");
            int choice = input.nextInt();
            if (choice == 4) {

                // Save data to file before exiting
                try {
                    d.saveToFile();
                    System.out.println("Employee data saved to file. Thank you.");
                } catch (IOException e) {
                    System.out.println("Error saving employee data: " + e.getMessage());
                }
                break;
            }
            if (choice == 3) {
                if (d.emplist.isEmpty()) {
                    System.out.println("There are no available employees.\nAdd Employee and try again!!");
                    continue;
                    // break;
                } else {
                    d.print_All_details();
                    continue;
                }

            }

            System.out.println(
                    "\nB.Operations\n4.Add Employee\n5.Remove Employee\n6.Get All Employee COUNT\n7.Print all Employee of this type\n8.Exit");
            int operate = input.nextInt();
            switch (choice) {
                case 1:
                    switch (operate) {
                        case 4:
                            d.add_employee(getEmployeeData(choice, input));
                            System.out.println("Employee added successfully!");
                            break;
                        case 5:
                            if (d.emplist.isEmpty()) {
                                System.out.println("There are no employee to remove ");

                            } else {
                                System.out.println("Enter the number of the employee");
                                int index = input.nextInt();
                                d.remove_employee(index - 1);
                                System.out.println("The employee number " + index + " has been removed!");
                            }
                            break;
                        case 6:
                            System.out.println("The number of employees is: " + d.getemployeecount());
                            break;
                        case 7:
                            System.out.println("All Salried Employees saved : ");
                            d.Print_All_Salried();
                            break;
                        case 8:
                            System.out.println("Thank you");
                            return;
                        default:
                            System.out.println("Invalid input");
                            break;
                    }
                    break;
                case 2:
                    switch (operate) {
                        case 4:
                            d.add_employee(getEmployeeData(choice, input));
                            System.out.println("Employee added successfully!");
                            break;
                        case 5:
                            if (d.emplist.isEmpty()) {
                                System.out.println("There are no employee to remove ");

                            } else {
                                System.out.println("Enter the number of the employee");
                                int index = input.nextInt();
                                d.remove_employee(index - 1);
                                System.out.println("The employee number " + index + " has been removed!");
                            }
                            break;
                        case 6:
                            System.out.println("The number of employees is: " + d.getemployeecount());
                            break;
                        case 7:
                            System.out.println("All hourly Employees saved: ");
                            d.Print_All_Hourly();
                            break;
                        case 8:
                            System.out.println("Thank you");
                            return;
                        default:
                            System.out.println("Invalid input");
                            break;
                    }
                    break;

                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }

    private static Gender convertCharToGender(char genChar) {
        if (genChar == 'M' || genChar == 'm') {
            return Gender.Male;
        } else if (genChar == 'F' || genChar == 'f') {
            return Gender.Female;
        } else {
            return Gender.UNKNOWN;
        }
    }

    public static Employee getEmployeeData(int x, Scanner input) {
        System.out.println("Enter the Name:");
        String name = input.next();
        System.out.println("Enter the SSN:");
        int ssn = input.nextInt();
        System.out.println("Enter Address");
        String address = input.next();
        System.out.println("Enter gender (M/F):");
        char genChar = input.next().charAt(0);
        Gender gender = convertCharToGender(genChar);

        if (x == 1) {
            System.out.println("Enter Salary");
            double salary = input.nextDouble();
            System.out.println("Enter bonus");
            double bonus = input.nextDouble();
            System.out.println("Enter deductions");
            double deduction = input.nextDouble();
            return new SalriedEmployee(name, ssn, address, salary, bonus, deduction, gender);
        } else if (x == 2) {
            System.out.println("Enter Hourly Rate");
            double hourlyRate = input.nextDouble();
            System.out.println("Enter Number of hours");
            double numberOfHours = input.nextDouble();
            return new HourlyEmployee(name, ssn, address, hourlyRate, numberOfHours, gender);
        } else {
            System.out.println("Invalid choice. Returning null");
            return null; 
        }
    }

}
