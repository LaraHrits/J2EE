public class Employee {
    private int id;
    private static int nextid;
    private String name;
    private String surname;
    private Double salary;

    public Employee (String name, String surname, Double salary) throws FieldLengthLimitException, IncorrectSalaryException{

        this.id = nextid++;

        if (name.length()<=15){
            this.name = name;
        } else  {
            throw new FieldLengthLimitException("Name is too long!");
        }

        if (surname.length()<=15){
            this.surname = surname;
        } else  {
            throw new FieldLengthLimitException("Surname is too long!");
        }

        if (salary > 0){
            this.salary = salary;
        }
        else {
            throw new IncorrectSalaryException("Enter positive salary!");
        }

    }
    void PrintEmployee(){
        System.out.println("ID: " + id + "\nName and surname: " + name + " " + surname + "\nSalary " + salary);
    }
}
