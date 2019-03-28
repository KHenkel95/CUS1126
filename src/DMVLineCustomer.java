/* Author: Ken Henkel
 * Course: CUS1126
 * Date: 25 March 2019
 */

public class DMVLineCustomer{
    int tokenNumber;
    String fullName;
    String purpose;
    float payment;
    DMVLineCustomer next;

    public DMVLineCustomer (int tokenNumber, String fullName, String purpose, float payment){
        this.tokenNumber = tokenNumber;
        this.fullName = fullName;
        this.purpose = purpose;
        this.payment = payment;

        this.next = null;
    }
}