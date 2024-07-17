import java.util.ArrayList;

interface Emp_Manager{
    void find_wage();
    double show_wage();
}


public class EmpWageBuilder implements Emp_Manager{
    private final String c_name;
    private final double rate_hr;
    private final int hrs_worked;
    private double total;

    public EmpWageBuilder(String c_name, double rate_hr, int hrs_worked){
        this.c_name = c_name;
        this.rate_hr = rate_hr;
        this.hrs_worked = hrs_worked;
        this.total = 0;
    }

    @Override
    public void find_wage(){
        double daily_wage = this.hrs_worked*this.rate_hr;
        this.total += daily_wage;
    }

    @Override
    public double show_wage(){
        return this.total;
    }

    public String get_c_name() {
        return this.c_name;
    }

    public static void main(String[] args){
        ArrayList<Emp_Manager> companies = new ArrayList<>();

        companies.add(new EmpWageBuilder("Company A", 20.0, 8));
        companies.add(new EmpWageBuilder("Company B", 25.0, 6));

        for (Emp_Manager company : companies) {
            company.find_wage();
            company.find_wage();
        }

        // Print total wages for each company
        for (Emp_Manager company : companies) {
            System.out.println("Total wage for " + ((EmpWageBuilder) company).get_c_name() + ": $" + company.show_wage());
        }
    }
}
