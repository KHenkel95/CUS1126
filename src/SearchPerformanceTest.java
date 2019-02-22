/*Author: Ken Henkel
 * Course: CUS1126
 * Date: 2/21/19
 */
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
            randNumbers1[i] = i*10;
        }
        int[] randNumbers2 = new int[100];
        for(int i = 0; i < randNumbers1.length; i++){
            randNumbers2[i] = i*10;
        }
        int[] randNumbers3 = new int[1000];
        for(int i = 0; i < randNumbers3.length; i++){
            randNumbers3[i] = i*10;
        }
        int[] randNumbers4 = new int[10000];
        for(int i = 0; i < randNumbers4.length; i++){
            randNumbers4[i] = i*10;
        }
        int[] randNumbers5 = new int[100000];
        for(int i = 0; i < randNumbers5.length; i++){
            randNumbers5[i] = i*10;
        }
        //Start running methods and printing run times
        long start1 = System.nanoTime();
        binarySearch(randNumbers1, randNumbers1[randNumbers1.length-1]);
        long stop1 = System.nanoTime();
        long time1 = stop1 - start1;
        System.out.println(time1);
        long start2 = System.nanoTime();
        linearSearch(randNumbers1, randNumbers1[randNumbers1.length-1]);
        long stop2 = System.nanoTime();
        long time2 = stop2 - start2;
        System.out.println(time2);

        long start3 = System.nanoTime();
        binarySearch(randNumbers2, randNumbers2[randNumbers2.length-1]);
        long stop3 = System.nanoTime();
        long time3 = stop3 - start3;
        System.out.println(time3);
        long start4 = System.nanoTime();
        linearSearch(randNumbers2, randNumbers2[randNumbers2.length-1]);
        long stop4 = System.nanoTime();
        long time4 = stop4 - start4;
        System.out.println(time4);

        long start5 = System.nanoTime();
        binarySearch(randNumbers3, randNumbers3[randNumbers3.length-1]);
        long stop5 = System.nanoTime();
        long time5 = stop5 - start5;
        System.out.println(time5);
        long start6 = System.nanoTime();
        linearSearch(randNumbers3, randNumbers3[randNumbers3.length-1]);
        long stop6 = System.nanoTime();
        long time6 = stop6 - start6;
        System.out.println(time6);

        long start7 = System.nanoTime();
        binarySearch(randNumbers4, randNumbers4[randNumbers4.length-1]);
        long stop7 = System.nanoTime();
        long time7 = stop7 - start7;
        System.out.println(time7);
        long start8 = System.nanoTime();
        linearSearch(randNumbers4, randNumbers4[randNumbers4.length-1]);
        long stop8 = System.nanoTime();
        long time8 = stop8 - start8;
        System.out.println(time8);

        long start9 = System.nanoTime();
        binarySearch(randNumbers5, randNumbers5[randNumbers5.length-1]);
        long stop9 = System.nanoTime();
        long time9 = stop9 - start9;
        System.out.println(time9);
        long start10 = System.nanoTime();
        linearSearch(randNumbers5, randNumbers5[randNumbers5.length-1]);
        long stop10 = System.nanoTime();
        long time10 = stop10 - start10;
        System.out.println(time10);

    }
}
