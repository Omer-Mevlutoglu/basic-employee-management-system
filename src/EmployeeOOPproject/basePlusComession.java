package EmployeeOOPproject;

public class basePlusComession extends ComessionEmployee {

    double base;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public basePlusComession(double grossSales, double comessionRate, double base) {
        super(grossSales, comessionRate);
        this.base = base;
    }

    public basePlusComession(String name, int sSN, String address, double grossSales, double comessionRate, Gender sex,
            double base) {
        super(name, sSN, address, grossSales, comessionRate, sex);
        this.base = base;
    }

    @Override
    public double Earning() {

        return super.Earning() + base;
    }

    @Override
    public void displayAlldetails() {
        super.displayAlldetails();
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "basePlusComession [base=" + base + "]";
    }

    @Override
    public void displayEarnings() {
        System.out.println(Earning());
    }

}
