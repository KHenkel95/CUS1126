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
                a[index] = a[index].next;
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
                else {
                    current = current.next;
                }
            }
            return " This person is not in the phonebook";
        }
    }
    public static void main(String[] args){
    PhoneBook person1 = new PhoneBook("Jerry Garcia", "5161234567");
    PhoneBook person2 = new PhoneBook("Bob Weir", "9174893095");
    PhoneBook person3 = new PhoneBook("Phil Lesh", "5165960395");
    PhoneBook person4 = new PhoneBook("Mickey Hart", "5169503945");
    PhoneBook person5 = new PhoneBook("Bill Kreutzmann", "5168594309");
    PhoneBook person6 = new PhoneBook("Drew Smith", "5161234534");
    PhoneBook person7 = new PhoneBook("Kelly Henkel", "5161234578");
    PhoneBook person8 = new PhoneBook("Joe Smith", "5161234578");
    PhoneBook person9 = new PhoneBook("Jacob Degrom", "5161238782");
    PhoneBook person10 = new PhoneBook("Matt Barzal", "5165451235");
    PhoneBook person11 = new PhoneBook("Pete Alonso", "5169854527");
    PhoneBook person12 = new PhoneBook("Robin Lenher", "5165743620");
    PhoneBook person13 = new PhoneBook("Sam Darnold", "5168752301");
    PhoneBook person14 = new PhoneBook("Jamal Adams", "5167523654");
    PhoneBook person15 = new PhoneBook("Noah Syndergaard", "5168523650");
    PhoneBook person16 = new PhoneBook("Wilson Ramos", "5169851203");
    PhoneBook person17 = new PhoneBook("Brock Nelson", "5167520214");
    PhoneBook person18 = new PhoneBook("Anders Lee", "5169852013");
    PhoneBook person19 = new PhoneBook("Michael Conforto", "5168502403");
    PhoneBook person20 = new PhoneBook("Amed Rosario", "5169505201");
    insertPhoneNumber(person1);
    insertPhoneNumber(person2);
    insertPhoneNumber(person3);
    insertPhoneNumber(person4);
    insertPhoneNumber(person5);
    insertPhoneNumber(person6);
    insertPhoneNumber(person7);
    insertPhoneNumber(person8);
    insertPhoneNumber(person9);
    insertPhoneNumber(person10);
    insertPhoneNumber(person11);
    insertPhoneNumber(person12);
    insertPhoneNumber(person13);
    insertPhoneNumber(person14);
    insertPhoneNumber(person15);
    insertPhoneNumber(person16);
    insertPhoneNumber(person17);
    insertPhoneNumber(person18);
    insertPhoneNumber(person19);
    insertPhoneNumber(person20);

    System.out.println("Searching for Phil Lesh :" + phoneNumberLookUp(person3.fullName));
    System.out.println("Searching for Noah Syndergaard :" + phoneNumberLookUp(person15.fullName));
    System.out.println("Searching for Amed Rosario :" + phoneNumberLookUp(person20.fullName));

    }
}