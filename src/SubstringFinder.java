/* Author: Ken Henkel
 * Course: CUS1126
 * Date: 2/14/19
 */
import java.util.ArrayList;

public class SubstringFinder {
    public static void main(String[] args){
        String a = "abc";
        ArrayList<String> b = new ArrayList<>();
        generateSubstrings(a, b);
        System.out.println("The string to be printed is: " + a);
        printStringArrayList(b);
        String c = "Murphy";
        ArrayList<String> d = new ArrayList<>();
        generateSubstrings(c, d);
        System.out.println("The string to be printed is: " + c);
        printStringArrayList(d);
    }
    public static void generateSubstrings(String str, ArrayList<String> result){
        if (str.isEmpty()){
            result.add(" ");
        }
        else{
            String subCh = String.valueOf(str.charAt(0));
            String subStr = str.substring(1);
            result.add(subCh);
            generateSubstrings(subStr, result);
            for(int i = 0; i < subStr.length(); i++){
                result.add(subCh + subStr.substring(i));
            }
        }
    }
    public static void printStringArrayList(ArrayList<String> stringListToBePrinted){
        for (String a : stringListToBePrinted){
            System.out.println(a);
        }
    }
}