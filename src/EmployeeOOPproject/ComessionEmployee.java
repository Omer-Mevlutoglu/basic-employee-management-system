package EmployeeOOPproject;

public class ComessionEmployee
        extends Employee {
    private double GrossSales, ComessionRate;

    private double NetSalary;

    public ComessionEmployee(double grossSales, double comessionRate) {
        GrossSales = grossSales;
        ComessionRate = comessionRate;
        NetSalary = GrossSales * (ComessionRate / 100);

    }

    public ComessionEmployee(String name, int sSN, String address, double grossSales, double comessionRate,
            Gender sex) {
        super(name, sSN, address, sex);
        GrossSales = grossSales;
        ComessionRate = comessionRate;
        NetSalary = GrossSales * (ComessionRate / 100);

    }

    public void setGrossSales(double grossSales) {
        GrossSales = grossSales;
    }

    public void setComessionRate(double comessionRate) {
        ComessionRate = comessionRate;
    }

    public double Earning() {
        return GrossSales * (ComessionRate / 100);
    }

    @Override
    public void displayAlldetails() {
        System.out
                .println(
                        " Name : " + Name + "\n SSN: " + SSN + "\n Address " + Address + "\n GrossSales: " + GrossSales
                                + "\n ComessionRate %: " + ComessionRate + "\n NetSalary: " + NetSalary
                                + "\n Company Name " + CompanyName);

    }

    @Override
    public void displayEarnings() {
        System.out.println("Net Salary" + NetSalary);

    }

    public double getGrossSales() {
        return GrossSales;
    }

    public double getComessionRate() {
        return ComessionRate;
    }

    public double getNetSalary() {
        return NetSalary;
    }
}
