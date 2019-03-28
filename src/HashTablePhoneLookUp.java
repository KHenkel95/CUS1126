public class HashTablePhoneLookUp {
    PhoneBook[] a = new PhoneBook[20];
    public static int hashFunction(String name){
        int nameNumber = 0;
        for(int i = 0; i < name.length(); i++){
            nameNumber+=name.codePointAt(i);
        }
        return nameNumber % 20;
    }
    public void insertPhoneNumber(PhoneBook person){
        int index = hashFunction(person.fullName);
        a[index] = person;

    }
    public static void main(String[] args){

    }
}