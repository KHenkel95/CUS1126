/* Author: Ken Henkel
 * Course: CUS1126
 * Date: 2/14/19
 */
import java.util.ArrayList;

public class SubstringFinder {
    public static void main(String[] args){
        String a = "helo";
        ArrayList<String> b = new ArrayList<String>();
        generateSubstrings(a, b);
        System.out.println(b);
    }
    public static void generateSubstrings(String str, ArrayList<String> result){
        for(int y = 0; y < str.length()-1; y++) {
            for (int i = 1; i < str.length() - 1; i++) {
                result.add(str.substring(y) + str.substring(i));
            }
        }
    }
}