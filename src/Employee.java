public class Employee {
    private String fName;
    private String lName;
    private int salary;
    //Constructor for Employee
    public Employee(String fName, String lName, int salary){
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
    }
    //Setters and Getters
    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public int compareTo(Employee comparableEmployee){
        int compareSalary = ((Employee)comparableEmployee)
    }
}
