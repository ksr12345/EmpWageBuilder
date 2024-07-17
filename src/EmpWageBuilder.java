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

    public static void main(String[] args){
        EmpWageBuilder company1 = new EmpWageBuilder("Company 1", 20.0, 8);
        EmpWageBuilder company2 = new EmpWageBuilder("Company 2", 25.0, 6);

        company1.find_wage();
        company1.find_wage();

        company2.find_wage();
        company2.find_wage();

        System.out.println("Total wage for " + company1.c_name + " is " + company1.show_wage());
        System.out.println("Total wage for " + company2.c_name + " is " + company2.show_wage());
    }
}
