/* Author: Ken Henkel
 * Course: CUS1126
 * Date: 4/1/2019
 */

public class HashTableImplementation {

    public static PhoneBook head = null;
    public static PhoneBook tail = null;

    public static PhoneBook[] a = new PhoneBook[20];
    public static int hashFunction(String name){
        int nameNumber = 0;
        for(int i = 1; i < name.length(); i++){
            nameNumber+=name.codePointAt(i);
        }
        nameNumber %= 20;
        if(nameNumber > 19){
            return 19;
        }
        return nameNumber;
    }
    public static void insertPhoneNumber(PhoneBook person){
        int index = hashFunction(person.fullName);
        if(a[index] != null) {
            while(a[index].next != null){
                a[index]= a[index].next;
            }
            a[index].next = person;
            tail = person;
        }
        else{
             head = person;
             tail = person;
             a[index] = person;
        }
    }
    public static String phoneNumberLookUp(String name){
        int index = hashFunction(name);
        if( a[index].fullName.equals(name)){
            return a[index].phoneNumber;
        }
        else {
            PhoneBook current = a[index];
            while(current != null) {
                if(current.fullName.equals(name)){
                    return current.phoneNumber;
                }
                current = current.next;
            }
            if(current == null){
                return " This person is not in the phonebook";
            }
            return current.phoneNumber;
        }
    }
    public static void main(String[] args){
    PhoneBook person1 = new PhoneBook("Jerry Garcia", "5161234567");
    PhoneBook person2 = new PhoneBook("Bob Weir", "9174893095");
    PhoneBook person3 = new PhoneBook("Phil Lesh", "5165960395");
    PhoneBook person4 = new PhoneBook("Mickey Hart", "5169503945");
    PhoneBook person5 = new PhoneBook("Bill Kreutzmann", "5168594309");
    PhoneBook person6 = new PhoneBook("Jerry Garcia", "5161234534");
    PhoneBook person7 = new PhoneBook("Jerry Garcia", "5161234578");
    insertPhoneNumber(person1);
    insertPhoneNumber(person2);
    insertPhoneNumber(person3);
    insertPhoneNumber(person4);
    insertPhoneNumber(person5);
    insertPhoneNumber(person6);
    insertPhoneNumber(person7);
    System.out.println("Searching for Phil Lesh :" + phoneNumberLookUp("Phil Lesh"));
    System.out.println("Searching for Mickey Hart :" + phoneNumberLookUp("Mickey Hart"));
    System.out.println("Searching for Jerry Garcia :" + phoneNumberLookUp("Jerry Garcia"));
    System.out.println("Searching for Jerry Garcia :" + phoneNumberLookUp(person6.fullName));
    System.out.println("Searching for Jerry Garcia :" + phoneNumberLookUp(person7.fullName));

    }
}