/* Author: Ken Henkel
 * Course: CUS1126
 * Date: 4/1/2019
 */
public class HashTableImplementation {
    public static PhoneBook[] a = new PhoneBook[20];
    public static int hashFunction(String name){
        int nameNumber = 0;
        for(int i = 1; i < name.length(); i++){
            nameNumber+=name.codePointAt(i);
        }
        if(nameNumber > 20){
            nameNumber = 20;
        }
        return nameNumber % 20;
    }
    public static void insertPhoneNumber(PhoneBook person){
        while(true) {
            int index = hashFunction(person.fullName);
            if (a[index] == null) {
                a[index] = person;
            } else {
                a[index] = person.next;
            }
            return;
        }
    }
    public static String phoneNumberLookUp(String name){
        while(true) {
            if (a[hashFunction(name)].fullName.equals(name)) {
                return a[hashFunction(name)].phoneNumber;
            } else if (a[hashFunction(name)].next.fullName.equals(name)) {
                return a[hashFunction(name)].next.phoneNumber;
            }
            else{
                return "Name not found";
            }
        }
    }
    public static void main(String[] args){
    PhoneBook person1 = new PhoneBook("Jerry Garcia", "5161234567");
    PhoneBook person2 = new PhoneBook("Bob Weir", "9174893095");
    PhoneBook person3 = new PhoneBook("Phil Lesh", "5165960395");
    PhoneBook person4 = new PhoneBook("Mickey Hart", "5169503945");
    PhoneBook person5 = new PhoneBook("Bill Kreutzmann", "5168594309");
    insertPhoneNumber(person1);
    insertPhoneNumber(person2);
    insertPhoneNumber(person3);
    insertPhoneNumber(person4);
    insertPhoneNumber(person5);
    System.out.println("Searching for Phil Lesh :" + phoneNumberLookUp(person3.fullName));
    }
}