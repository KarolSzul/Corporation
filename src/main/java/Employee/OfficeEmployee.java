package Employee;

public class OfficeEmployee extends Employee{

    private int deskNo;
    private short iq;

    public OfficeEmployee(String firstName, String lastName, byte age, byte experience,
                          WorkplaceAddress workplaceAddress, int deskNo, short iq) {
        super(firstName, lastName, age, experience, workplaceAddress);
        this.deskNo = deskNo;
        this.iq = iq;
    }

//    public OfficeEmployee() {
//
//    }

//    public OfficeEmployee(int deskNo, short iq) {
//        this.deskNo = deskNo;
//        this.iq = iq;
//    }

    public int getDeskNo() {
        return deskNo;
    }

    public void setDeskNo(int deskNo) {
        this.deskNo = deskNo;
    }

    public short getIq() {
        return iq;
    }

    public void setIq(short iq) {
        this.iq = iq;
    }


    @Override
    public double getEmployeeValue() {
        return getExperience() * getIq();
    }

    @Override
    public String toString() {
        return "OfficeEmployee{" +
                "deskNo=" + deskNo +
                ", iq=" + iq +
                "} " + super.toString();
    }
}
