public class EmpWageBuilder {
    private final String c_name;
    private final int rate_hr;
    private int total;

    public EmpWageBuilder(String c_name, int rate_hr){
        this.c_name = c_name;
        this.rate_hr = rate_hr;
    }

    public int find_wage(int hrs_worked){
        total = rate_hr*hrs_worked;
        return total;
    }

    public void show_wage(){
        System.out.println("Total Wage of "+ c_name +" is "+ total);
    }

    public static void main(String[] args){
        EmpWageBuilder company1 = new EmpWageBuilder("Company 1", 20);
        EmpWageBuilder company2 = new EmpWageBuilder("Company 2", 18);

        int hrs_spent_company1 = 8;
        company1.find_wage(hrs_spent_company1);
        company1.show_wage();

        int hrs_spent_company2 = 9;
        company2.find_wage(hrs_spent_company2);
        company2.show_wage();
    }
}
