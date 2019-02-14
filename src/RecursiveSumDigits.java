/* Author: Ken Henkel
* Course: CUS1126
* Date: 2/7/19
 */
public class RecursiveSumDigits {
    public static void main (String[] Args){
        int a = 1234;
        int b = 4930;
        int c = 596012;
        int d = 858483489;
        System.out.println("The sum of: " + a + " is: " + sumDigits(a));
        System.out.println("The sum is: " + b + " is: " + sumDigits(b));
        System.out.println("The sum is: " + c + " is: " + sumDigits(c));
        System.out.println("The sum is: " + d + " is: " + sumDigits(d));
    }
    public static int sumDigits(int x){
        if (x <= 0){
            return x;
        }
        else{
            return x % 10 + sumDigits(x / 10);
        }
    }
}