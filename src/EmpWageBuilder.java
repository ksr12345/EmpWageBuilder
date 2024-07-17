public class EmpWageBuilder {
    public static int rate_hr = 20;

    public static int find_wage(int hrs_worked){
        return rate_hr*hrs_worked;
    }

    public static void main(String[] args){
        int hrs_spent = 8;
        int wage = EmpWageBuilder.find_wage(hrs_spent);
        System.out.println("Employee wage for "+ hrs_spent +" hrs is "+ wage);
    }
}
