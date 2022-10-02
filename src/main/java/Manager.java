public class Manager extends Employee {

    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public Manager(String name, String departmentName, double salary, double bonus) throws FieldLengthLimitException, IncorrectSalaryException {
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

        this.bonus = bonus;
    }

     void PrintEmployee() {
        System.out.println("Manager: ID = " + id + " Name = " + name + " Department name " + departmentName + " Salary = " + salary + " Bonus = " + bonus);
    }
}
