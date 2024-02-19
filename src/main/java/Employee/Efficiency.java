package Employee;

public enum Efficiency {
    LOW(60),
    MEDIUM(90),
    HIGH(120);

    private int numVal;

    private String name;

    Efficiency(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }
}
