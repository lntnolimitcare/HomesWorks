package encaptulation;

public class EmployeeData {
    private int ssn;
    private String name;
    private double salary;
    private String headOffice;

    public int getSsn() {
        return ssn;
    }
    public void setSsn(int ssn) {
        this.ssn = ssn;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getHeadOffice() {
        return headOffice;
    }
    public void setHeadOffice(String headOffice) {
        this.headOffice = headOffice;
    }
}
