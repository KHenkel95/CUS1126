/* Author: Ken Henkel
* Course: CUS1126
* Date: 25 March 2019
 */

import java.util.ArrayList;
public class DMVLineCustomerQueue {
    public static DMVLineCustomer front;
    public static DMVLineCustomer back;

    public static ArrayList<Float> arrTotal = new ArrayList<>();
    public DMVLineCustomerQueue(){
        front = null;
        back = null;
    }

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

    public DMVLineCustomer dequeue(){
        if (front == null){
            System.out.println("Queue is Empty");
            return null;
        }
        else{
            DMVLineCustomer removed = front;
            arrTotal.add(removed.payment);
            front = front.next;
            return removed;
        }
    }
    public void displayQueue(){
        DMVLineCustomer current = front;
        if (current == null){
            System.out.println("\nQueue is Empty");
            return;
        }
        else{
            System.out.print("\nQueue is as follows:");
            while(current != null){
                System.out.print(" "+current.fullName + "->");
                current = current.next;
            }

        }
    }
    public static void addTotal(ArrayList<Float> arrTotal){
        float total = 0f;
        for(int i = 0; i < arrTotal.size(); i++){
            total+=arrTotal.get(i);
        }
        System.out.println("The total is $" + total);
    }


    public static void main(String[] Args){
        DMVLineCustomer customer1 = new DMVLineCustomer(1, "Jack Doe", "License Renewal", 50.00f);
        DMVLineCustomer customer2 = new DMVLineCustomer(2, "Mary Jane", "Registration Plate collection", 7.20f);
        DMVLineCustomer customer3 = new DMVLineCustomer(3, "Killer Joe", "Address Change on License", 20.05f);
        DMVLineCustomer customer4 = new DMVLineCustomer(4, "Nikki Semantic", "License renewal", 120.00f);

        DMVLineCustomerQueue Queue1 = new DMVLineCustomerQueue();
        Queue1.enqueue(customer1);
        Queue1.displayQueue();
        Queue1.enqueue(customer2);
        Queue1.displayQueue();
        Queue1.enqueue(customer3);
        Queue1.displayQueue();
        Queue1.enqueue(customer4);
        Queue1.displayQueue();

        Queue1.dequeue();
        Queue1.displayQueue();
        Queue1.dequeue();
        Queue1.displayQueue();

        Queue1.dequeue();
        Queue1.displayQueue();
        Queue1.dequeue();
        Queue1.displayQueue();
        addTotal(arrTotal);
    }
}