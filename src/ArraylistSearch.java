/* Author: Ken Henkel
* Course: CUS1126
* Date: 14 February, 2019
 */
import java.util.ArrayList;

public class ArraylistSearch {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList();
        arr.add(1);
        arr.add(4);
        arr.add(8);
        arr.add(9);
        arr.add(12);
        System.out.println("Searching linearly for the term: 8 in an arraylist of: " + arr
                + " will show the term if it's in the list or -1 if it isn't: " + listLinearSearch(arr, 8));
        System.out.println("Binary search for the term: 8: in an arraylist of : " + arr
                + " will show the term if it's in the list or -1 if it isn't:  " + listBinarySearch(arr, 8));
        System.out.println("Searching linearly for the term: 18 in an arraylist of: " + arr
                + " will show the term if it's in the list or -1 if it isn't: " + listLinearSearch(arr, 18));
        System.out.println("Binary search for the term: 18: in an arraylist of : " + arr
                + " will show the term if it's in the list or -1 if it isn't:  " + listBinarySearch(arr, 18));
    }

    public static int listLinearSearch(ArrayList<Integer> a, int term){
        for(int i = 0; i <= a.size()-1; i++){
            if(term == a.get(i).intValue()){
                return a.get(i).intValue();
            }
        }
        return -1;
    }
    public static int listBinarySearch(ArrayList<Integer> a, int term){
        int left = 0;
        int right = a.size()-1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(term == a.get(mid).intValue()){
                return a.get(mid).intValue();
            }
            else if(a.get(mid).intValue() > term){
                right = mid -1;
            }
            else{
                left = mid + 1;
            }
        }
        return -1;
    }

}
