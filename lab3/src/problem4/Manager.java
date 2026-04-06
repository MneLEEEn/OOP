package problem4;

import java.util.Vector;
import java.util.Objects;

public class Manager extends Employee {
    private Vector<Employee> team;
    private double bonus;

    public Manager() {
        super();
        team = new Vector<>();
        bonus = 0;
    }

    public Manager(String name, double salary, java.util.Date hireDate,
                   String ni, double bonus) {
        super(name, salary, hireDate, ni);
        this.bonus = bonus;
        this.team = new Vector<>();
    }

    public void addEmployee(Employee e) {
        team.add(e);
    }

    public double getBonus() { return bonus; }
    public void setBonus(double bonus) { this.bonus = bonus; }

    public Vector<Employee> getTeam() { return team; }

    @Override
    public String toString() {
        return super.toString() +
                ", Bonus: " + bonus +
                ", Team size: " + team.size();
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof Manager)) return false;

        Manager m = (Manager) obj;
        return bonus == m.bonus &&
               Objects.equals(team, m.team);
    }

    @Override
    public int compareTo(Employee other) {
        int salaryCompare = Double.compare(this.salary, other.salary);
        if (salaryCompare != 0) return salaryCompare;

        if (other instanceof Manager) {
            Manager m = (Manager) other;
            return Double.compare(this.bonus, m.bonus);
        }
        return salaryCompare;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Manager cloned = (Manager) super.clone();
        cloned.team = new Vector<>();
        for (Employee e : team) {
            cloned.team.add((Employee) e.clone());
        }
        return cloned;
    }
}