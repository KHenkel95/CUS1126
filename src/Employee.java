/*Author: Ken Henkel
 * Course: CUS1126
 * Date: 2/21/19
 */
public class Employee{
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
    public String toString(){
        return fName + " " + lName + " " + salary;
    }
    /*@Override
    public int compareTo(Employee comparableEmployee){
        int compareSalary = (comparableEmployee).getSalary();
        return this.salary-compareSalary;
    }*/
}
