public class RecursiveArraySum {
    public static void main(String[] Args){
        int[] a = {1, 2, 3, 4, 5};
        System.out.println("The sum is: " + arraySum(a, a.length-1));
    }
    public static int arraySum(int[] arr, int num){
        if(num == 0){
            return arr[num];
        }
        else {
            return arr[num] + arraySum(arr, num-1);

        }
    }
}
