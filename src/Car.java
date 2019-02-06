public class Car {
    private String make;
    private String model;
    private String year;
    private double mileage;
    private double price;

    public Car(String make, String model, String year, double mileage, double price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }
    //Getters and Setters
    public String getMake(){
        return this.make;
    }
    public void setMake(String make){
        this.make = make;
    }
    public String getModel(){
        return this.model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getYear(){
        return this.year;
    }
    public void setYear(String year){
        this.year = year;
    }
    public double getMileage(){
        return this.mileage;
    }
    public void setMileage(double mileage){
        this.mileage = mileage;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    @Override
    public String toString(){
        return "The make, model, year, mileage, and price is : " + make+" "+model+" "+year+" "+mileage+" "+price+"\n";
    }
}