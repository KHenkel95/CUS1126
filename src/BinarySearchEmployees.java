/*Author: Ken Henkel
* Course: CUS1126
* Date: 2/21/19
*/
import java.util.ArrayList;


public class BinarySearchEmployees {
    public static void main(String[] args){
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jerry", "Garcia", 20000));
        employeeList.add(new Employee("Murphy", "Smith", 45000));
        employeeList.add(new Employee("Kelly", "Jones", 60000));
        employeeList.add(new Employee("Mike", "McCarthy", 80000));
        employeeList.add(new Employee("Karen", "Dalton", 120000));
        //Printing out the list of employee's
        System.out.println("The list of employee's includes:");
        for(Employee employee: employeeList){
            System.out.println(employee);
        }
        //Searching for employee's by salary
        System.out.println("\nSearching for salary: $20,000");
        if(iterativeEmployeeBinarySearch(employeeList, 20000) != null ){
            System.out.println("Found a salary matching $20,000: "
                    + iterativeEmployeeBinarySearch(employeeList, 20000));
        }
        else{
            System.out.println("Search failed.");
        }
        System.out.println("\nSearching for salary: $30,000");
        if(iterativeEmployeeBinarySearch(employeeList, 30000) != null){
            System.out.println("Found a salary matching $30,000: "
                    + iterativeEmployeeBinarySearch(employeeList, 30000));
        }
        else{
            System.out.println("Search failed.");
        }
        System.out.println("\nSearching for salary: $120,000");
        if(recursiveBinarySearch(employeeList, 0, employeeList.size()-1, 120000) != null){
            System.out.println("Found a salary matching $120,000: "
                    + recursiveBinarySearch(employeeList, 0, employeeList.size()-1, 120000));
        }
        else{
            System.out.println("Search failed.");
        }
        System.out.println("\nSearching for salary: $130,000");
        if(recursiveBinarySearch(employeeList, 0, employeeList.size()-1, 130000) != null){
            System.out.println("Found a salary matching $130,000: "
                    + recursiveBinarySearch(employeeList, 0, employeeList.size()-1, 130000));
        }
        else{
            System.out.println("Search failed.");
        }
    }
    public static Employee iterativeEmployeeBinarySearch(ArrayList<Employee> employeeArrayList, int targetSalary){
        int left = 0;
        int right = employeeArrayList.size()-1;
        while(left <= right){
            int i = (left+right)/2;
            if(employeeArrayList.get(i).getSalary() == targetSalary){
                return employeeArrayList.get(i);
            }
            else if(employeeArrayList.get(i).getSalary() > targetSalary){
                right = i - 1;
            }
            else{
                left = i + 1;
            }
        }
        return null;
    }
    public static Employee recursiveBinarySearch(ArrayList<Employee> employeeArrayList, int left, int right, int targetSalary) {
        int i = (left+right)/2;
        if (left > right){
            return null;
        }
        if(employeeArrayList.get(i).getSalary() == targetSalary){
            return employeeArrayList.get(i);
        }
        else if(employeeArrayList.get(i).getSalary() > targetSalary){
            return recursiveBinarySearch(employeeArrayList, left, i - 1, targetSalary);
        }
        else{
            return recursiveBinarySearch(employeeArrayList, i + 1, right, targetSalary);
        }
    }
}
