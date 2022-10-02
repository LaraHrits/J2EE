import java.util.ArrayList;

public class Registry {

    private static Registry instance = null;
    private final ArrayList<Employee> candidate = new ArrayList<Employee>();

    private Registry() {

    }

    public static Registry getRegistry() {
        if (instance == null) {
            instance = new Registry();
        }
        return instance;

    }

    public void add_candidate(Employee emp) throws EmployeeInRegistryException {
        if (candidate.size() == 0) {
            candidate.add(emp);
        } else {
            for (Employee employee : candidate) {
                if (employee.getID() == emp.getID()) {
                    throw new EmployeeInRegistryException("Candidate already exists");
                }
            }
            candidate.add(emp);
        }
    }

    public void printList() {
        if (candidate.size() == 0) {
            System.out.println("List of employees is empty");
        } else {
            System.out.println("Company employees list:");

            for (Employee emp : candidate) {
                emp.PrintEmployee();
            }
        }
    }
}
