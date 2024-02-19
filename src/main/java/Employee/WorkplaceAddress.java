package Employee;

public class WorkplaceAddress {

    private String street;
    private short buildingNo;
    private short localNo;
    private String city;

    public WorkplaceAddress(String street, short buildingNo, short localNo, String city) {
        this.street = street;
        this.buildingNo = buildingNo;
        this.localNo = localNo;
        this.city = city;
    }

    public WorkplaceAddress() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public short getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(short buildingNo) {
        this.buildingNo = buildingNo;
    }

    public short getLocalNo() {
        return localNo;
    }

    public void setLocalNo(short localNo) {
        this.localNo = localNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "WorkplaceAddress{" +
                "street='" + street + '\'' +
                ", buildingNo=" + buildingNo +
                ", localNo=" + localNo +
                ", city='" + city + '\'' +
                '}';
    }
}
