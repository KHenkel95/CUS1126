public class Assignment2 {
    public static void main(String[] Args){
        int [] a = {4, 12, 9, 2, 3, 4, 5};
        int total = 0;
        for (int i = 2; i <= 9; i++){
            total *= a[i];
        }
        System.out.println(""+total);
    }
}
