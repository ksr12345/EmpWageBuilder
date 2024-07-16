public class EmpWageBuilder {
    public static final int Full_time = 2;
    public static final int Part_time = 1;
    public static final int Emp_Rate = 20;
    public static final int Working_days = 2;
    public static final int Max_hrs_month = 10;

    public static void main(String[] args){
        int emp_hrs;
        int total_emp_hrs = 0;
        int total_emp_days = 0;
        while (total_emp_hrs <= Max_hrs_month && total_emp_days < Working_days) {
            total_emp_days ++;
            int emp = (int) Math.floor(Math.random() * 10) % 3;
            switch (emp) {
                case Full_time:
                    emp_hrs = 8;
                    break;
                case Part_time:
                    emp_hrs = 4;
                    break;
                default:
                    emp_hrs = 0;
                    break;
            }
            total_emp_hrs += emp_hrs;
            System.out.println("Day#: "+ total_emp_days +" Emp hrs: "+ emp_hrs);
        }
        int total_emp_wage = total_emp_hrs * Emp_Rate;
        System.out.println("Total Employee Wage:" + total_emp_wage);
    }
}
