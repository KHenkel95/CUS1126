import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CarArrayList {
    public static void main(String[] args){

        ArrayList<Car> carList = new ArrayList<Car>();
        carList.add(new Car("Dodge", "Ram", "2005", 150000.00, 8000.00));
        carList.add(new Car("Chevrolet", "Corvette", "2019", 100.00, 80900.00));
        carList.add(new Car("Toyota", "Camry", "2015", 35000, 15000.00));
        carList.add(new Car("GMC", "Sierra HD", "2019", 100.00, 65295.00));
        carList.add(new Car("Hyundai", "Sonata", "2008", 200000.00, 3000.00));

        System.out.println(carList.toString());
    }

    public static int getAveragePrice(ArrayList<Car> carList){

    }
}