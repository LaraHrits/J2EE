public class Main {
    public static void main(String[] args) {
        try {

            Employee emp = new Employee("Lori", "Nicolas", 850.0);
            emp.PrintEmployee();
        } catch (FieldLengthLimitException ex){
            System.out.println(ex.getMessage());
        }
        catch(IncorrectSalaryException ex){
            System.out.println(ex.getMessage());
        }
    }
}
