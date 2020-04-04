public class EmployeeFullTime extends SalaryPolicy{
     float rate;
//    Constructor


    public EmployeeFullTime(float baseSalary) {
        super(baseSalary);
        this.rate = 4;
    }

    @Override
    public String toString() {
        return "Employee full time:"  + getSalary() * rate;
    }
}
