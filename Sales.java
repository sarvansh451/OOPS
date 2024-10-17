package Marketing;
import General.Employee;
public class Sales extends Employee{
    public Sales(int empid, String ename) {
        super(empid, ename);
    }

    public double tallowance(double basic) {
        double totalEarning = earnings(basic);
        double allowance = 0.05 * totalEarning;
        return totalEarning + allowance;
    }
}

