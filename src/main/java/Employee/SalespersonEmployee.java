package Employee;

public class SalespersonEmployee extends Employee{

    private Efficiency efficiency;
    private double provision;

    public SalespersonEmployee(String firstName, String lastName, byte age, byte experience,
                               WorkplaceAddress workplaceAddress, Efficiency efficiency, double provision) {
        super(firstName, lastName, age, experience, workplaceAddress);
        this.efficiency = efficiency;
        this.provision = provision;
    }

    public Efficiency getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(Efficiency efficiency) {
        this.efficiency = efficiency;
    }

    public double getProvision() {
        return provision;
    }

    public void setProvision(double provision) {
        this.provision = provision;
    }

    @Override
    public double getEmployeeValue() {
        return getEfficiency().getNumVal()*getExperience();
    }

    @Override
    public String toString() {
        return "SalespersonEmployee{" +
                "efficiency=" + efficiency +
                ", provision=" + provision +
                "} " + super.toString();
    }
}
