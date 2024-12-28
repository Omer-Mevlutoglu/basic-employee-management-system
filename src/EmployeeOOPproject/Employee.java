package EmployeeOOPproject;

import java.io.Serializable;
enum Gender {
    Male, Female, UNKNOWN
};

public abstract class Employee implements Displayable, Serializable {
    private static final long serialVersionUID = 1L;
    String Name;
    int SSN;
    String Address;
    Gender sex;

    public Employee() {
    }

    public Employee(String name, int sSN, String address, Gender Sex) {
        Name = name;
        SSN = sSN;
        Address = address;
        sex = Sex;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int sSN) {
        SSN = sSN;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public abstract double Earning();

    @Override
    public String toString() {
        return " [Name=" + Name + ", SSN=" + SSN + ", Address=" + Address + ", sex=" + sex + "]";
    }

}
