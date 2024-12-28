package EmployeeOOPproject;

public class SalriedEmployee extends Employee {
    private double Salary, Bonus, Deduction, NetSalary;

    public void setSalary(double salary) {
        Salary = salary;
    }

    public void setBonus(double bonus) {
        Bonus = bonus;
    }

    public void setDeduction(double deduction) {
        Deduction = deduction;
    }

    public SalriedEmployee(double salary, double bonus, double deduction) {
        Salary = salary;
        Bonus = bonus;
        Deduction = deduction;
        NetSalary = (Salary + Bonus) - Deduction;
    }

    public SalriedEmployee(String name, int sSN, String address, double salary, double bonus, double deduction,
            Gender sex) {
        super(name, sSN, address, sex);
        Salary = salary;
        Bonus = bonus;
        Deduction = deduction;
        NetSalary = (Salary + Bonus) - Deduction;

    }

    public double Earning() {
        return (Salary + Bonus) - Deduction;
    }

    @Override
    public void displayAlldetails() {
        // System.out
        // .println(
        // " Name : " + Name + "\n SSN: " + SSN + "\n Address " + Address + "\n Gender:
        // " + sex + "\n Salary: "
        // + Salary
        // + "\n Bonus: " + Bonus + "\n Deduction: " + Deduction + "\n NetSalary: " +
        // NetSalary
        // + "\n Company Name " + CompanyName);
        System.out.println(super.toString());
        System.out.println(toString());
        System.out.println();

    }
    

    @Override
    public String toString() {
        return " [Salary=" + Salary + ", Bonus=" + Bonus + ", Deduction=" + Deduction + ", NetSalary="
                + NetSalary + "]";
    }

    @Override
    public void displayEarnings() {
        System.out.println("Net Salary" + NetSalary);

    }

    public double getSalary() {
        return Salary;
    }

    public double getBonus() {
        return Bonus;
    }

    public double getDeduction() {
        return Deduction;
    }

    public double getNetSalary() {
        return NetSalary;
    }
}
