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
        System.out.println(getAveragePrice("Dodge", "Ram",carList));
    }

    public static int getAveragePrice(String make, String model, ArrayList<Car> carList){
        
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < carList.size(); i++){
            if(carList.get(i).getMake().compareTo(make)==0){
                if(carList.get(i).getModel().compareTo(model)==0){
                    sum += carList.get(i).getPrice();
                    counter++;
                    if(carList.get(i).getPrice() > )
                }
            }
        }
        return sum/counter;
    }
}