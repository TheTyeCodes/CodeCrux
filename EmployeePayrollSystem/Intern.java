class Intern extends Employee {
    private int hoursworked;
    private  double hourlyrate;


    public Intern(String name, int id,int hoursworked, double hourlyrate) {
        super(name, id);
        this.hoursworked = hoursworked;
        this.hourlyrate = hourlyrate;
    }

    @Override
    public double calculateSalary() {
        return hourlyrate * hoursworked;

    }
}
