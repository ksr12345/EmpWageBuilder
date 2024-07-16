public class EmpWageBuilder {
    public static void main(String[] args){
        int Full_time = 1;
        double emp = Math.floor(Math.random()*10) % 2;
        if (emp == Full_time){
            System.out.println("Employee is present");
        } else{
            System.out.println("Employee is absent");
        }
    }
}
