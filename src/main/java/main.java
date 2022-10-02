public class main {
    public static void main(String[] args) throws FieldLengthLimitException, IncorrectSalaryException, EmployeeInRegistryException {

        Registry candidate = Registry.getRegistry();
        candidate.printList();

        Employee emp = new Employee("Lori","HR", 850.0);
        candidate.add_candidate(emp);

        Employee manager = new Manager("Clar", "Head",1350.0, 200);
        candidate.add_candidate(manager);

        candidate.printList();

    }
}
