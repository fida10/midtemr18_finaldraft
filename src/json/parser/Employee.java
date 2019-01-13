package json.parser;

public class Employee {

    private String empEmail;

    private String empName;
    private double salary;
    private String department;

    public Employee(){}
    public Employee(String empEmail, String empName, double salary, String department) {
        this.empEmail = empEmail;
        this.empName = empName;
        this.salary = salary;
        this.department = department;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}