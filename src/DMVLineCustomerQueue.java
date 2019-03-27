public class CUS1126Lab5{
    public class CUS1126Lab5{
        public static DMVLineCustomer front;
        public static DMVLineCustomer back;
    
        public void enqueue(DMVLineCustomer nodeToInsert){
            if(front == null){
                front = nodeToInsert;
                back = nodeToInsert;
            }
            else{
                back.next = nodeToInsert;
                back = nodeToInsert;
            }
        }
        public static void main(String[] args){
            DMVLineCustomer customer1 = new DMVLineCustomer(1, "Jack Doe", "License Renewal", 50.00);
            DMVLineCustomer customer2 = new DMVLineCustomer(2, "Mary Jane", "Registration Plate collection", 7.20);
            DMVLineCustomer customer3 = new DMVLineCustomer(3, "Killer Joe", "Address Change on License", 20.05);
            DMVLineCustomer customer4 = new DMVLineCustomer(4, "Nikki Semantic", "License renewal", 120.00);
        }
    }
}