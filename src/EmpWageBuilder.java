public class EmpWageBuilder {
    public static void main(String[] args){
        int Full_time = 1;
        int Emp_Rate = 20;
        int emp_hrs = 0;
        int emp_Wage = 0;
        double emp = Math.floor(Math.random()*10) % 2;
        if (emp == Full_time){
            emp_hrs = 8;
        }
        emp_Wage = emp_hrs*Emp_Rate;
        System.out.println("Emp Wage: "+ emp_Wage);
    }
}
