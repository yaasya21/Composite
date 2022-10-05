import java.util.ArrayList;
import java.util.List;

public class Employee {
    protected int ID;
    protected static int nextID = 1;
    protected int bossID;

    protected String name;
    protected String departmentName;
    protected double salary;
    protected List<Employee> subordinates;

    public Employee(String name, String departmentName, double salary, int bossID) {
        this.name = name;
        this.departmentName = departmentName;
        this.salary = salary;
        subordinates = new ArrayList<Employee>();
        this.ID = nextID++;
        this.bossID = bossID;
    }

    public Employee() {
    }

    public void add(Employee emp) {
        subordinates.add(emp);
    }

    public void remove(Employee emp) {
        System.out.println(emp.name + " has just hired. His ID was " + emp.ID);
        subordinates.remove(emp);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public String toString() {
        return ("ID:" + ID + " Name: " + name + " Department: " + departmentName + " Salary: " + salary + " bossID: " + bossID);
    }

    public int getID() {
        return ID;
    }
}
