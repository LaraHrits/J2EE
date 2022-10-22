public class Main {
    public static void main(String[] args) throws FieldLengthLimitException, IncorrectSalaryException,
            EmployeeInRegistryException {

        Registry candidate = Registry.getRegistry();

        Manager SMM_manager = new Manager("Lisa Paterson ", 1200, 400);
        Employee sales_agent_1 = new Employee("Nicolas Kan", 750);
        Employee sales_agent_2 = new Employee("Alex Bulking", 800);
        Manager sales_manager = new Manager("Maria L", 1100, 300);

        candidate.add_candidate(SMM_manager);
        candidate.add_candidate(sales_agent_1);
        candidate.add_candidate(sales_agent_2);
        candidate.add_candidate(sales_manager);

        candidate.printList();

        sales_manager.addSubordinate(sales_agent_1);
        sales_manager.addSubordinate(sales_agent_2);
        SMM_manager.addSubordinate(sales_manager);

        System.out.println("");
        for (Employee subordinate : SMM_manager.getSubordinates()) {
            subordinate.PrintEmployee();

        System.out.println("");

            for (Employee employee : subordinate.getSubordinates()) {
                employee.PrintEmployee();
            }
        }
    }
}