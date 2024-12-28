package EmployeeOOPproject;

public class HourlyEmployee extends Employee {
    private double HourlyRate, NumberOfHours;
    private double NetSalary;

    public HourlyEmployee(double hourlyRate, double numberOfHours) {
        HourlyRate = hourlyRate;
        NumberOfHours = numberOfHours;
        NetSalary = hourlyRate * numberOfHours;
    }

    public HourlyEmployee(String name, int sSN, String address, double hourlyRate, double numberOfHours, Gender sex) {
        super(name, sSN, address, sex);
        HourlyRate = hourlyRate;
        NumberOfHours = numberOfHours;
        NetSalary = hourlyRate * numberOfHours;

    }

    public void setHourlyRate(double hourlyRate) {
        HourlyRate = hourlyRate;
    }

    public void setNumberOfHours(double numberOfHours) {
        NumberOfHours = numberOfHours;
    }

    public double Earning() {
        return HourlyRate * NumberOfHours;
    }

    @Override
    public void displayAlldetails() {
        // System.out
        // .println(
        // " Name : " + Name + "\n SSN: " + SSN + "\n Address " + Address + "\n
        // HourlyRate: " + HourlyRate
        // + "\n NumberOfHours: " + NumberOfHours + "\n NetSalary: " + NetSalary
        // + "\n Company Name " + CompanyName);
        System.out.println(super.toString());
        System.out.println(this.toString());
        System.out.println();

    }

    @Override
    public String toString() {
        return "HourlyEmployee [HourlyRate=" + HourlyRate + ", NumberOfHours=" + NumberOfHours + ", NetSalary="
                + NetSalary + "]";
    }

    @Override
    public void displayEarnings() {
        System.out.println("Net Salary" + NetSalary);

    }

    public double getHourlyRate() {
        return HourlyRate;
    }

    public double getNumberOfHours() {
        return NumberOfHours;
    }

    public double getNetSalary() {
        return NetSalary;
    }
}
