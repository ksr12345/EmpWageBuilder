import java.util.*;

interface Emp_Manager{
    void find_wage(int hrs_worked);
    double show_wage();
}


public class EmpWageBuilder implements Emp_Manager{
    private final String c_name;
    private final double rate_hr;
    private final List<Double> dailyWages;
    private double total;

    public EmpWageBuilder(String c_name, double rate_hr){
        this.c_name = c_name;
        this.rate_hr = rate_hr;
        this.dailyWages = new ArrayList<>();
        this.total = 0;
    }

    @Override
    public void find_wage(int hrs_worked){
        double dailyWage = hrs_worked * this.rate_hr;
        this.dailyWages.add(dailyWage);
        this.total += dailyWage;
    }

    @Override
    public double show_wage(){
        return this.total;
    }

    public List<Double> getDailyWages() {
        return this.dailyWages;
    }

    public String get_c_name(){
        return this.c_name;
    }

    public static void main(String[] args){
        List<Emp_Manager> companies = new ArrayList<>();

        companies.add(new EmpWageBuilder("Company A", 20.0));
        companies.add(new EmpWageBuilder("Company B", 25.0));

        for (Emp_Manager company : companies) {
            company.find_wage(8);
            company.find_wage(7);
        }

        for (Emp_Manager company : companies) {
            System.out.println("Company: " + ((EmpWageBuilder) company).get_c_name());
            System.out.println("Total wage: " + company.show_wage());
            System.out.println("Daily wages: " + ((EmpWageBuilder) company).getDailyWages());
            System.out.println();
        }
    }
}
