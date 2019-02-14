/* Author: Ken Henkel
 * Course: CUS1126
 * Date: 2/13/19
 */
public class RecursiveStringReverser {
    public static void main(String[] args){
        reverseString("Hello!");
        reverseString("Murphy");
        reverseString("Jerry Garcia");
        reverseString("test");
    }
    public static void reverseString(String stringToBeReversed){
        if(stringToBeReversed.length()<=1){
            System.out.println(stringToBeReversed);
        }
        else{
            System.out.print(stringToBeReversed.charAt(stringToBeReversed.length()-1));
            reverseString(stringToBeReversed.substring(0, (stringToBeReversed.length()-1)));
        }
    }
}