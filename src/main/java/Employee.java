public class Employee {

    protected int id;
    protected static int nextid = 0;
    protected String name;
    protected Double salary;
    protected String departmentName;

    public Employee() {
        name = "0";
        departmentName = "0";
        salary = 0.0;
    }

    public int getID() {
        return id;
    }

    public Employee(String name, String departmentName, Double salary) throws FieldLengthLimitException, IncorrectSalaryException {

        this.id = nextid++;

        if (name.length() <= 15) {
            this.name = name;
        } else {
            throw new FieldLengthLimitException("Name is too long!");
        }

        if (departmentName.length()<=15){
            this.departmentName = departmentName;
        } else  {
            throw new FieldLengthLimitException("Department name is too long!");
        }

        if (salary > 0) {
            this.salary = salary;
        } else {
            throw new IncorrectSalaryException("Enter positive salary!");
        }

    }

     void PrintEmployee() {
        System.out.println("Employee: ID = " + id + " Name " + name + " Department name " + departmentName + " Salary " + salary);
    }

}
