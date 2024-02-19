package Employee;

public class PhysicalEmployee extends Employee{

    private byte strength;

    public PhysicalEmployee(String firstName, String lastName, byte age, byte experience,
                            WorkplaceAddress workplaceAddress, byte strength) {
        super(firstName, lastName, age, experience, workplaceAddress);
        this.strength = strength;
    }


    public short getStrength() {
        return strength;
    }

    public void setStrength(byte strength) {
        this.strength = strength;
    }

    @Override
    public double getEmployeeValue() {
        return (double) super.getExperience()*this.getStrength()/super.getAge();
    }

    @Override
    public String toString() {
        return "PhysicalEmployee{" +
                "strength=" + strength +
                "} " + super.toString();
    }
}
