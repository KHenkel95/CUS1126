public class PhoneBook {
    //int tokenNumber;
    String fullName;
    String phoneNumber;
    PhoneBook next;

    public PhoneBook(String fullName, String phoneNumber){
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.next = null;
    }
}
