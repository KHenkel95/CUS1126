import java.util.ArrayList;

public class BinarySearchEmployees {
    public static void main(String[] args){
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jerry", "Garcia", 100000));
        employeeList.add(new Employee("Murphy", "Smith", 80000));
        employeeList.add(new Employee("Kelly", "Jones", 250000));
        employeeList.add(new Employee("Mike", "McCarthy", 50000));
        employeeList.add(new Employee("Karen", "Dalton", 150000));
        employeeList.add(new Employee("Ruth", "Roberts", 78000));
        employeeList.add(new Employee("Susan", "Larsen", 52000));
        employeeList.add(new Employee("Phil", "Lesh", 90000));
        employeeList.add(new Employee("Robert", "Weir", 120000));
        employeeList.add(new Employee("William", "Kreutzmann", 97500));
        employeeList.add(new Employee("Brent", "Mydland", 63400));

        for(int i = 1; i < employeeList.size(); i++){
            int y = employeeList.get(i).getSalary();
            int z = i-1;

            while(z >= 0 && employeeList.get(z).getSalary() > y){
                employeeList.get(z+1) = employeeList.get(z);
            }
        }
        for(Employee employee: employeeList){
            System.out.println(employee);
        }
    }

}
