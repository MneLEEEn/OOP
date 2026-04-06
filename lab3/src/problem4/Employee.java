package problem4;

import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
    protected double salary;
    protected Date hireDate;
    protected String nationalInsuranceNumber;

    public Employee() {
        super();
        this.salary = 0;
        this.hireDate = new Date();
        this.nationalInsuranceNumber = "";
    }

    public Employee(String name, double salary, Date hireDate, String ni) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.nationalInsuranceNumber = ni;
    }

    public double getSalary() { return salary; }
    public Date getHireDate() { return hireDate; }
    public String getNI() { return nationalInsuranceNumber; }

    public void setSalary(double salary) { this.salary = salary; }
    public void setHireDate(Date hireDate) { this.hireDate = hireDate; }
    public void setNI(String ni) { this.nationalInsuranceNumber = ni; }

    @Override
    public String toString() {
        return super.toString() +
                ", Salary: " + salary +
                ", HireDate: " + hireDate +
                ", NI: " + nationalInsuranceNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof Employee)) return false;

        Employee e = (Employee) obj;
        return salary == e.salary &&
               Objects.equals(hireDate, e.hireDate) &&
               Objects.equals(nationalInsuranceNumber, e.nationalInsuranceNumber);
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }

    // Clone (deep copy for Date)
    @Override
    public Object clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        cloned.hireDate = (Date) hireDate.clone();
        return cloned;
    }
}