public class SearchPerformanceTest {
    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            int i = (left + right) / 2;
            if(arr[i]==target){
                return arr[i];
            }
            else if (arr [i] > target){
                right = i - 1;
            }
            else{
                left = i + 1;
            }
        }
        return -1;
    }
    public static int linearSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] randNumbers1 = new int[10];
        for(int i = 0; i < randNumbers1.length; i++){
            randNumbers1[i] = (int)(Math.random()*0+9);
        }
        int[] randNumbers2 = new int[20];
        for(int i = 0; i < randNumbers1.length; i++){
            randNumbers2[i] = (int)(Math.random()*0+19);
        }
        int[] randNumbers3 = new int[30];
        for(int i = 0; i < randNumbers3.length; i++){
            randNumbers3[i] = (int)(Math.random()*0+29);
        }
        int[] randNumbers4 = new int[40];
        for(int i = 0; i < randNumbers4.length; i++){
            randNumbers4[i] = (int)(Math.random()*0+39);
        }
        int[] randNumbers5 = new int[10];
        for(int i = 0; i < randNumbers5.length; i++){
            randNumbers5[i] = (int)(Math.random()*0+49);
        }
        long start = System.nanoTime();
        binarySearch(randNumbers1, randNumbers1[randNumbers1.length-1]);
        long stop = System.nanoTime();
        long time = stop - start;
        System.out.println(time);
        start = System.nanoTime();
        linearSearch(randNumbers1, randNumbers1[randNumbers1.length-1]);
        stop = System.nanoTime();
        time = stop - start;
        System.out.println(time);

        start = System.nanoTime();
        binarySearch(randNumbers2, randNumbers2[randNumbers2.length-1]);
        stop = System.nanoTime();
        time = stop - start;
        System.out.println(time);
        start = System.nanoTime();
        linearSearch(randNumbers2, randNumbers2[randNumbers2.length-1]);
        stop = System.nanoTime();
        time = stop - start;
        System.out.println(time);

        start = System.nanoTime();
        binarySearch(randNumbers3, randNumbers3[randNumbers3.length-1]);
        stop = System.nanoTime();
        time = stop - start;
        System.out.println(time);
        start = System.nanoTime();
        linearSearch(randNumbers3, randNumbers3[randNumbers3.length-1]);
        stop = System.nanoTime();
        time = stop - start;
        System.out.println(time);

        start = System.nanoTime();
        binarySearch(randNumbers4, randNumbers4[randNumbers4.length-1]);
        stop = System.nanoTime();
        time = stop - start;
        System.out.println(time);
        start = System.nanoTime();
        linearSearch(randNumbers4, randNumbers4[randNumbers4.length-1]);
        stop = System.nanoTime();
        time = stop - start;
        System.out.println(time);

        start = System.nanoTime();
        binarySearch(randNumbers5, randNumbers5[randNumbers5.length-1]);
        stop = System.nanoTime();
        time = stop - start;
        System.out.println(time);
        start = System.nanoTime();
        linearSearch(randNumbers5, randNumbers5[randNumbers5.length-1]);
        stop = System.nanoTime();
        time = stop - start;
        System.out.println(time);

    }
}
