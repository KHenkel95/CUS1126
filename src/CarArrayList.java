/* Author: Ken Henkel
*  Date: 2/5/19
*  Course: CUS1126
 */
import java.util.ArrayList;


public class CarArrayList {
    public static void main(String[] args){
        //Declares and initializes an ArrayList with five car objects
        ArrayList<Car> carList = new ArrayList<Car>();
        carList.add(new Car("Dodge", "Ram", "2005", 150000.00, 8000.00));
        carList.add(new Car("Chevrolet", "Corvette", "2019", 100.00, 80900.00));
        carList.add(new Car("Toyota", "Camry", "2015", 35000, 15000.00));
        carList.add(new Car("Chevrolet", "Corvette", "1968", 80000.00, 25000.00));
        carList.add(new Car("Dodge", "Ram", "2019", 150.00, 40000.00));

        System.out.println(carList.toString());
        getAveragePrice("Dodge", "Ram", carList);
        getAveragePrice("Chevrolet", "Corvette", carList);
    }
    //Computes and prints the average price for a given make and model, as well as the details for the highest and
    //lowest priced car
    public static void getAveragePrice(String make, String model, ArrayList<Car> carList){
        double minPrice = 1000000;
        double maxPrice = 0;
        double sum = 0;
        double counter = 0;
        Car maxCar = new Car();
        Car minCar = new Car();
        for (int i = 0; i < carList.size(); i++){
            if(carList.get(i).getMake().compareTo(make)==0 && carList.get(i).getModel().compareTo(model)==0){
                sum += carList.get(i).getPrice();
                counter++;
                if(carList.get(i).getPrice() > maxPrice){
                    maxPrice = carList.get(i).getPrice();
                    maxCar = carList.get(i);
                    }
                 if(carList.get(i).getPrice() < minPrice){
                     minPrice = carList.get(i).getPrice();
                     minCar = carList.get(i);
                    }
            }
        }
        System.out.println("The average price for a " + make + " " + model + " is: " + sum/counter + "\nThe " + make + " "
                + model + " with the lowest price is: " + minCar.toString() + "\nThe " + make + " "
                + model + " with the highest price is: " + maxCar.toString());
    }
}