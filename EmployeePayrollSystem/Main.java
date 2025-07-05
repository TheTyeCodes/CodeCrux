public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee Emp1 = new FullTimeEmployee("Shiva",522140,50000);
        Intern Emp2 = new Intern("Vikas",522141,8,1000);

        payrollSystem.addEmployee(Emp1);
        payrollSystem.addEmployee(Emp2);
        System.out.println("Initial Employee details: ");
        payrollSystem.displayEmployees();
        System.out.println("Remove Employee : ");
        payrollSystem.removeEmployee(522141);
        System.out.println("Remaining Employee details: ");
        payrollSystem.displayEmployees();
    }
}