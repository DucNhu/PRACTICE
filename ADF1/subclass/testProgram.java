import java.util.Scanner;

public class testProgram {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        float Salary = Scanner.nextFloat();
        SalaryPolicy sa= new EmployeePartime(Salary);
        System.out.println(sa);
        SalaryPolicy sa1 =  new EmployeeFullTime(Salary);
        System.out.println(sa1);
    }
}
