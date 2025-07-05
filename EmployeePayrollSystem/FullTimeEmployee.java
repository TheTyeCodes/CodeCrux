class FullTimeEmployee extends Employee {
    private double monthlysalary;

    public FullTimeEmployee(String name, int id, double salary) {
        super(name, id);
        monthlysalary = salary;
    }

    @Override
    public double calculateSalary() {
        return monthlysalary;
    }
}
