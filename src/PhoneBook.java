/* Author: Ken Henkel
 * Course: CUS1126
 * Date: 4/1/2019
 */
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
