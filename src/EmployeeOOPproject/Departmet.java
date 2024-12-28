package EmployeeOOPproject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Departmet implements Serializable {
    int depNumber;
    String depName;
    ArrayList<Employee> emplist = new ArrayList<>();

    public void saveToFile() throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Employes.txt"))) {
            oos.writeObject(this.emplist);
        }
    }

    // Load the employee list from a file
    @SuppressWarnings("unchecked")
    public void loadFromFile() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Employes.txt"))) {
            this.emplist = (ArrayList<Employee>) ois.readObject();
        }
    }

    public Departmet() {
    }

    public Departmet(int depNumber, String depName, ArrayList<Employee> emplist) {
        this.depNumber = depNumber;
        this.depName = depName;
        this.emplist = emplist;
    }

    public int getDepNumber() {
        return depNumber;
    }

    public void setDepNumber(int depNumber) {
        this.depNumber = depNumber;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public ArrayList<Employee> getEmplist() {
        return emplist;
    }

    public void setEmplist(ArrayList<Employee> emplist) {
        this.emplist = emplist;
    }

    public void add_employee(Employee emp) {
        emplist.add(emp);
    }

    public void remove_employee(int emp) {
        emplist.remove(emp);
    }

    public int getemployeecount() {
        return emplist.size();
    }

    public void print_basic_data() {
        for (Employee e : emplist) {
            System.out.println(" \nName:" + e.Name + " \nAddress " + e.Address + " \nGender " + e.sex
                    + " \nSSN " + e.SSN + "\n---------------------------------");
        }
    }

    public void print_All_details() {
        for (Employee e : emplist) {
            if (e instanceof SalriedEmployee)
                ((SalriedEmployee) e).displayAlldetails();
            if (e instanceof HourlyEmployee)
                ((HourlyEmployee) e).displayAlldetails();
            if (e instanceof ComessionEmployee)
                ((ComessionEmployee) e).displayAlldetails();
        }
    }

    public void Print_All_Salried() {
        for (Employee e : emplist) {
            if (e instanceof SalriedEmployee) {
                ((SalriedEmployee) e).displayAlldetails();
            }

        }
    }

    public void Print_All_Hourly() {
        for (Employee e : emplist) {
            if (e instanceof HourlyEmployee) {
                ((HourlyEmployee) e).displayAlldetails();
            }

        }
    }

}
