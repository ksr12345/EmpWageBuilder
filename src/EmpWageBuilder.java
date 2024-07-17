public class EmpWageBuilder {
    private final int rate_hr;

    public EmpWageBuilder(int rate_hr){
        this.rate_hr = rate_hr;
    }

    public int find_wage(int hrs_worked){
        return rate_hr*hrs_worked;
    }

    public static void main(String[] args){
        EmpWageBuilder company1 = new EmpWageBuilder(20);
        EmpWageBuilder company2 = new EmpWageBuilder(18);

        int hrs_spent_company1 = 8;
        int wage1 = company1.find_wage(hrs_spent_company1);
        System.out.println("Employee wage for company1 for "+ hrs_spent_company1 +" hrs is "+ wage1);

        int hrs_spent_company2 = 7;
        int wage2 = company2.find_wage(hrs_spent_company2);
        System.out.println("Employee wage for company2 for "+ hrs_spent_company2 +" hrs is "+ wage2);
    }
}
