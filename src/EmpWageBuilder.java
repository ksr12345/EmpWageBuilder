public class EmpWageBuilder {
    public static final int Full_time = 2;
    public static final int Part_time = 1;
    public static final int Emp_Rate = 20;

    public static void main(String[] args){
        int emp_hrs = 0;
        int emp_Wage = 0;
        int emp = (int)Math.floor(Math.random()*10) % 3;
        switch (emp){
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
        emp_Wage = emp_hrs*Emp_Rate;
        System.out.println("Emp Wage: "+ emp_Wage);
    }
}
