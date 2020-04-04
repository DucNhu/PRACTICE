public class EmployeePartime extends SalaryPolicy {
    private float rate;
//    Constructor

    public EmployeePartime(float baseSalary) {
        super(baseSalary);
        this.rate = 2.5f;
    }

    @Override
    public String toString() {
        return "Employee partime:" + getSalary() * rate;
    }
}
