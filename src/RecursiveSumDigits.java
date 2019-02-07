public class RecursiveSumDigits {
    public static void main (String[] Args){
        System.out.println("The sum is: " + sumDigits(1234));
    }
    public static int sumDigits(int x){
        if (x == 1){
            return 1;
        }
        else{
            return x % 10 + sumDigits(x / 10);
        }
    }
}
