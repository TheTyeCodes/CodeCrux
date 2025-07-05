import java.util.ArrayList;

class PayrollSystem {
    private ArrayList<Employee> employeesList;

    public PayrollSystem() {
        employeesList = new ArrayList<>();
    }
    public void addEmployee(Employee employee) {
        employeesList.add(employee);

    }
    public void removeEmployee(int id) {
        Employee employeeToRemove = null;
        for(Employee employee : employeesList) {
            if(employee.getId() == id) {
                employeeToRemove = employee;
                break;
            }
        }
        if(employeeToRemove != null) {
            employeesList.remove(employeeToRemove);
        }
    }
    public void displayEmployees() {
        for(Employee employee : employeesList) {
            System.out.println(employee);
        }
    }
}
