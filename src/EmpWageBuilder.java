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

    public static double getTotalWageByCompany(List<EmpWageBuilder> companies, String companyName) {
        for (EmpWageBuilder company : companies) {
            if (company.get_c_name().equals(companyName)) {
                return company.show_wage();
            }
        }
        return 0;
    }

    public static void main(String[] args){
        List<EmpWageBuilder> companies = new ArrayList<>();

        companies.add(new EmpWageBuilder("Company A", 20.0));
        companies.add(new EmpWageBuilder("Company B", 25.0));

        for (Emp_Manager company : companies) {
            company.find_wage(8);
            company.find_wage(7);
        }

        for (EmpWageBuilder company : companies) {
            System.out.println("Company: " + company.get_c_name());
            System.out.println("Total wage: " + company.show_wage());
            System.out.println("Daily wages: " + company.getDailyWages());
            System.out.println();
        }

        String queryCompany = "Company A";
        double totalWage = EmpWageBuilder.getTotalWageByCompany(companies, queryCompany);
        System.out.println("Total wage for " + queryCompany + ": " + totalWage);
    }
}
