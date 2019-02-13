public class RecursiveStringReverser {
    public static void reverseString(String stringToBeReversed){
        if(stringToBeReversed.length()<=1){
            System.out.println(stringToBeReversed);
        }
        else{
            System.out.print(stringToBeReversed.charAt(stringToBeReversed.length()-1));
            reverseString(stringToBeReversed.substring(0, (stringToBeReversed.length()-1)));
        }
    }
    public static void main(String[] args){
        reverseString("Hello!");
    }
}